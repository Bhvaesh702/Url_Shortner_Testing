package Check_Box_Handling;


import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
    	driver.manage().window().maximize();
    	List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='form-group']//input[@type='checkbox']"));
		System.out.println(checkboxes.size());

		for(WebElement Box: checkboxes)
		{
			Box.click();
		}
		Thread.sleep(5000);
		for(int i= checkboxes.size()-1;i>=0;i--)
		{
			checkboxes.get(i).click();
		}
		
		


		
		
	}


}
