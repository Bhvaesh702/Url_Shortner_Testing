package Alerts_PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Handling_Using_Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html#google_vignette");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		//driver.switchTo().alert().accept();
	Alert	MyWait=wait.until(ExpectedConditions.alertIsPresent());
	System.out.println(MyWait.getText());
	MyWait.accept();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
