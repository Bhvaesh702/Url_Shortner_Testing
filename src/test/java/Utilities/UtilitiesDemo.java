package Utilities;

import org.testng.annotations.DataProvider;

public class UtilitiesDemo 
{
	
	
@DataProvider (name="dpm")
Object[][] LogInDataDemo()
{
		
	Object[][]Data={
		{"bhaveshmandlik1@gmail.com","Token@2026"},
		
	};
		return Data;
}

}
