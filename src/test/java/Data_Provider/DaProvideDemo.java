package Data_Provider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DaProvideDemo {
	WebDriver driver;
	@BeforeTest
	void OpenApplication()
	{
		driver= new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test
	(dataProvider="dp")
	void LogIn(String email,String pwd)
	{

		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[4]/a")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit' and @data-qa='login-button']")).click();
		boolean LogOutBtn = driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[4]")).isDisplayed();
		if(LogOutBtn==true)
		{
			driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[4]")).click();
		Assert.assertTrue(LogOutBtn);
		}
		else {
			Assert.fail();
		}
		
	}
	@AfterTest
	void logOut()
	{
		driver.close();
	}
	
	@DataProvider (name="dp",indices={0,3})
	Object[][]LogInData()
	{
		Object[][] Data={
				
				{"Suyash321@gmail.com","Token@123"},
				{"Jayesh321@gmail.com","Token@123"},
				{"Ramesh321@gmail.com","Token@123"},
				{"bhaveshmandlik1@gmail.com","Token@2026"},
		
		};
		return Data;
	}
		
	

}
