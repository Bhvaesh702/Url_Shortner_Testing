package WebDriver_Commands;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_And_quit_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shorturl.at/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.close(); // will close main browser window
		//driver.quit(); // will close all active windows
		//Q.] What if we have to close window  based on choice?
		String MainWindow=driver.getWindowHandle();
		System.out.println(MainWindow);
		Thread.sleep(5000);
		WebElement Facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		Facebook.click();
		WebElement Twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		Twitter.click();
		Set<String> AllIds = driver.getWindowHandles();
		System.out.println(AllIds);
		/*for(String Ids:AllIds)
		{
			driver.switchTo().window(Ids);

			String Url = driver.getCurrentUrl();
			System.out.println("Checking window Id" + Ids + " | Url : " + Url);

			if(Url.contains("facebook"))
			{
				System.out.println("Closing the Current Window " + Url);
				driver.close();

			}

		}
		driver.switchTo().window(MainWindow);
		System.out.println("Switching to main Window " + driver.getTitle());
		driver.close();
		
		============================================================================
		*/
for(String Ids:AllIds)
{
	driver.switchTo().window(Ids);

	String Urls = driver.getCurrentUrl();
	
	System.out.println("Capturing the Current Urls For All Windows "+ Urls);
	
	if(!Ids.equals(MainWindow)) {
driver.switchTo().window(Ids);
System.out.println("Closing the Window With Title: "+ driver.getTitle());
driver.close();
}
	driver.switchTo().window(MainWindow);

	}}
}













