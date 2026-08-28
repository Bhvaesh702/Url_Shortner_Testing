package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg_Annotations {
	WebDriver driver;
	
	
	
  @Test (priority=-2)
  public void LogIn() {
	  
	  driver.findElement(By.xpath("//div[@class='tu-guest-navbar__buttons']/a")).click();
	  driver.findElement(By.id("email")).sendKeys("bhaveshmandlik1@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Token@2026");
	  driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
	  
	
  }
  @Test (priority=1)
  public void OpenApp() {
	  
      driver= new ChromeDriver();
	  driver.get("https://tinyurl.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	 // driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//span[@role='button']")).click();
  }
  
  @Test(priority=3)
  public void VerifyLogo() {
	  
 driver.findElement(By.xpath("//button[@data-test-id='account-button-dropdown']")).click();

	  
  }
  
  
  
  
  
}
