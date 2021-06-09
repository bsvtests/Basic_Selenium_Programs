package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest_Group_Sample {
	
	@BeforeMethod(alwaysRun = true)
	public void login()
	{
		
		Reporter.log("login....",true);
		
	}
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		
		Reporter.log("logout....",true);
		
	}
	
}