package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {
	
	
//Locators
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[4]/a") WebElement LigInClick;
	@FindBy(name="email") WebElement email;
	@FindBy(name="password") WebElement Pwd;
	@FindBy(xpath="//button[@type='submit' and @data-qa='login-button']") WebElement LigInBtn;
	
	
// Constructor
	public LogInPage(WebDriver driver)
	{
		
		super(driver);
	}
	
	
	//Actions
	public void LogInBtnSearch()
	{
		LigInClick.click();
	}

	public void UserName(String Email)
	{
		email.sendKeys(Email);
	}

	public void Password(String Password)
	{
		Pwd.sendKeys(Password);
	}

	public void LogInButtonClick()
	{
		LigInBtn.click();
	}
	
}
