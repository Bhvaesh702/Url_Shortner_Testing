package AutoSuggestion;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestion_Handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		List<WebElement> AllResults = driver.findElements(By.xpath("//ul[@class='G43f7e'][1]/li//div[@role='option']"));
		System.out.println(AllResults.size());
		Thread.sleep(5000);
		String ExpectedResults= "selenium download ";
		for(WebElement Results:AllResults)
		{  
			System.out.println(Results.getText());
			String ActualResult = Results.getText();
			if(ActualResult.equalsIgnoreCase(ExpectedResults))
			{
				Thread.sleep(2000);
				Results.click();


			}
		}

	}

}
