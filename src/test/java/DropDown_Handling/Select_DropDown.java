package DropDown_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDown {
/*
 * First find the x path where Select tag is.
 * then Store in ref Variable.
 * Then Create object of Select Class
 * use methods with Objects
 * Sel.selectByVisibleText();
 * Sel.selectByIndex();
 * Sel.selectByValue();
 * Sel.getOptions();
 * Sel.isMultiple();
 * Sel.getFirstSelectedOption();
 * Sel.getAllSelectedOptions();
 * Sel.deselectByVisibleText();
 * Sel.deselectByInde();
 * Sel.deSelectByValue();
 * 
 */
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://vinothqaacademy.com/drop-down/");
		driver.manage().window().maximize();
		WebElement Cities = driver.findElement(By.id("simpleDropdown"));
		Select sel= new Select(Cities);
		sel.selectByVisibleText("London");
		List<WebElement> Options = sel.getOptions();
		System.out.println(Options.size());
		for(WebElement AllOptions:Options)
		{
			System.out.println(AllOptions.getText());
		}
		
		/*WebElement Cities = driver.findElement(By.xpath("//select[@class=\"select2-hidden-accessible\"][1]"));
		Select Sel= new Select(Cities);
		ArrayList<WebElement> Options = Sel.getOptions();
		System.out.println(Options.size());
		
		 for(int i=1;i<Options.size();i++)
		 {
			Sel.selectByIndex(i);
			System.out.println(Sel.getFirstSelectedOption().getText());
		 }
			driver.close();
		}*/
	}

}
