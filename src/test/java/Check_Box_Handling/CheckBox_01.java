package Check_Box_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//JavascriptExecutor js=  (JavascriptExecutor)driver;
		//driver.findElement(By.xpath("//div[@class='form-group']//input[@id='sunday']")).click();
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='form-group']//input[@type='checkbox']"));
		System.out.println(checkboxes.size());

		/*To Click All CheckBoxes
		 * METHOD-1=====>>>
		for(WebElement checkBox:checkboxes) 
		{
			checkBox.click();	

		}

		METHOD-2=======>>>>
		for(int i=0;i<checkboxes.size();i++) 
		{
			checkboxes.get(i).click();
		}
		 */

		/*TO Click last 4 Check Boxes
		for(int i=3;i<checkboxes.size();i++) {

			checkboxes.get(i).click();
		}*/
	/*	//TO Click First 3 Check Boxes
		for(int i=0;i<3;i++) {

			checkboxes.get(i).click();
		}
*/

		//Unselect checked Checkboxes
		
		//Selecting first 3 Checkboxes
		
		/*for(int i=0;i<3;i++) {

			checkboxes.get(i).click();
		}
		
		Thread.sleep(3000);
		// Unselecting the selected Checkboxes
		for(int i=0;i<checkboxes.size();i++) {
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();

			}

		}*/
		
		// To Uncheck by reverse Direction
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
