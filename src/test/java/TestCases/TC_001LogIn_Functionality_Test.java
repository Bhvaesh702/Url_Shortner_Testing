package TestCases;

import org.testng.annotations.Test;
import PageObject.LogInPage;
import TestBase.BaseClass;




public class TC_001LogIn_Functionality_Test extends BaseClass
{

	@Test ()

	void TestLogIn()
	{
		try {
		logger.info("********** LOGIN TEST STARTED**********");
		LogInPage lp= new LogInPage(driver);
		logger.info("Performing Action on UserName, Password and LogIn Button");
		lp.LogInBtnSearch();
		lp.UserName(p.getProperty("Email"));
		lp.Password(p.getProperty("Password"));
		lp.LogInButtonClick();
		} catch (Exception e) {
			logger.error("Test Failed");
			logger.debug("Debug logs");
			
		}
		
	}
	
	
	
	


	




}
