package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoClass {

	WebDriver driver;
	@BeforeTest
	void OpenApp()
	{
		driver= new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.xpath("//button[@data-test-id='popup-footer-button-allow-all']")).click();

	}


	@Test
	void SignUp()
	{
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[4]/a")).click();
		driver.findElement(By.name("email")).sendKeys("bhaveshmandlik1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Token@2026");
		driver.findElement(By.xpath("//button[@type='submit' and @data-qa='login-button']")).click();
		
		

	}
	
	@AfterTest
	void LogOut()
	{
		
		driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[4]")).click();
	}


}
