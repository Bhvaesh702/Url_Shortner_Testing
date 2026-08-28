package WebTable;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_WebTable {
	/* Action is class used to perform keyboard and mouse action on webElement
	 * Create Object of Actions Class Actions act= new Actions(driver);
	 * Methods act.moveToElement();
	 * act.perform
	 * act.doubleClick();
	 * act.release();
	 * act.dragAndDrop();
	 * act.build();
	 * act.contextClick();
	 * act.clickAndHold();
	 * act.click();
*/
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		

	}

}
