package Broken_Links_Handling;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Broken_Links {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("No of Links Are: " + Links.size());
		ArrayList<String> urlList= new ArrayList<String>();
		for(WebElement e:Links)
		{
			String url= e.getAttribute("href");
			urlList.add(url);
		}
		long StartTime= System.currentTimeMillis();
		urlList.parallelStream().forEach(e-> CheckBrokenLinks(e));
		Long EndTime= System.currentTimeMillis();
		System.out.println(" Total Time Taken : "+ (EndTime- StartTime));
	}
	public static void CheckBrokenLinks (String LinkUrl)
	{
		try {
			URL url= new URL(LinkUrl);
			HttpURLConnection Connection= ( HttpURLConnection)url.openConnection();
			Connection.setConnectTimeout(5000);
			Connection.connect();
			if(Connection.getResponseCode()>=400)
			{
				System.out.println(LinkUrl +"  ========>>>> "  + Connection.getResponseCode()+   "Is a Broken Link");
			}
			else {

				System.out.println(LinkUrl +"============>>>" + Connection.getResponseCode() + " Is Not Broken Link");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
