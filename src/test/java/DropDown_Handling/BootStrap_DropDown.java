package DropDown_Handling;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap_DropDown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.htmlelements.com/demos/dropdownlist/multiple-selection/");
		driver.manage().window().maximize();
	driver.switchTo().frame(0);
		driver.findElement(By.id("dropDownList4159Label")).click();// Perform click action on drop-down Element.
	
		//Select Single Option From Drop Down
		driver.findElement(By.xpath("//div[@role='listbox']/smart-list-item[@label='Affogato']")).click();
		
		//To Select All Options( Capture all Option and then find Size)
		// Inside Ul tag there is li->span/a->label->input tag
		
	/*	ArrayList<WebElement> Choices = driver.findElements(By.xpath("//div[@role='listbox']/smart-list-item"));
	for(WebElement Choice:Choices)
	{
		System.out.println(Choice.getText());
	}
	
	*/
	
	}

}
