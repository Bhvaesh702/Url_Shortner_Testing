package Data_Provider;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Testing {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void OpenApp(String br) {
		switch(br.toLowerCase()) {
		
		case "chrome": driver= new ChromeDriver();
		break;
		case "edge": driver= new EdgeDriver();
		break;
		default:System.out.println("Invalid Browser");
		return;
		
		}
		
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	
  @Test  (dataProvider="dp")
  public void TestLogIn(String email, String pwd) 
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
  
  @Test()
  void TestLogo()
  {
	  boolean Logo = driver.findElement(By.xpath("//div[@class='logo pull-left']")).isDisplayed();
	  Assert.assertEquals(Logo, true);
	  
  }
  

  @AfterClass
  
  void tearDown()
  {
	  driver.quit();
  
  }
  
  
  
  @DataProvider(name="dp",indices= {3})
	
	Object [][]LogInData()
	{
		Object[][] Data= {
			    {"Suyash321@gmail.com","Token@123"},
				{"Jayesh321@gmail.com","Token@123"},
				{"Ramesh321@gmail.com","Token@123"},
				{"bhaveshmandlik1@gmail.com","Token@2026"},
		
	};
	return Data;
	}
}
