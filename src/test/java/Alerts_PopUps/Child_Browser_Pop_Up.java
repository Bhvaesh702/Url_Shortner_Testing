package Alerts_PopUps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Pop_Up {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		String MainPageId = driver.getWindowHandle();
		System.out.println("Id of Main Page is: " + MainPageId);
		Set<String> AllIds = driver.getWindowHandles();
		System.out.println("Id Of Main Page and other Page is: " + AllIds);
		ArrayList<String> al= new ArrayList<String>(AllIds);
		String ChildPageId = al.get(1);
		driver.switchTo().window(ChildPageId);
		driver.findElement(By.xpath("//i[@class='fab fa-youtube']")).click();

		
		
		
		

	}

}
