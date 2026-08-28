package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.MyAccountPage;
import TestBase.BaseClass;

public class TC_002MyAccountTest extends BaseClass
{
	
	
	
	@Test 
	
	void LogoTesting()
	{ 
		//logger.info("********** LOGO VALIDATION**********");
		MyAccountPage Account= new MyAccountPage(driver);
		Account.LogoTest();
		Assert.assertEquals(Account.LogoTest(), true);
	
		
	}

}
