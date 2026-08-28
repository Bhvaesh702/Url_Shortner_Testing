package Listner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Listner_Demo {
	WebDriver driver;
	@BeforeClass
	void OpenApp()
	{
		driver= new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

	}


	@Test
	void SignIn()
	{
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[4]/a")).click();
		driver.findElement(By.name("email")).sendKeys("bhaveshmandlik1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Token@2026");
		driver.findElement(By.xpath("//button[@type='submit' and @data-qa='login-button']")).click();
		

		

	}
	@Test (dependsOnMethods={"SignIn"})
	void LogoTest() {
		boolean Logo = driver.findElement(By.xpath("//div[@class='logo pull-left']")).isDisplayed();
		  Assert.assertEquals(Logo, true);
		  throw new SkipException("This Method is Skipped");
		
	}
	@Test
	void UrlTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise");
		
	}
	
	@AfterClass
	void LogOut()
	{
		
		driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[4]")).click();
		driver.quit();
	}
}
