package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MyAccountPage extends BasePage
{
	//Locators
	@FindBy(xpath="//div[@class='logo pull-left']") WebElement Logo;
	
	
	
	
	// Constructor
		public MyAccountPage(WebDriver driver)
		{
			
			super(driver);
		}
		
		//Actions
		
		public boolean LogoTest()
		{
			return Logo.isDisplayed();
		}
		
	

}
