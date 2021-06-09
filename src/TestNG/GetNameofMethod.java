package TestNG;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GetNameofMethod {

	public class DemoA 
	{
		@Test
		public void testA()
		{
			Reporter.log("testA().......",true);
		}

		@Test
		public void testB()
		{
			Reporter.log("testB().......",true);
		Assert.fail();
		}

		@AfterMethod
		//To know the method name we need to use getName() and in method we need to write ITestResult (object reference)
		public void Condition(ITestResult result)
		{
			String name = result.getName();
			Reporter.log("Name: "+name,true);

			int s = result.getStatus();
			Reporter.log("status: "+s,true);

			Reporter.log("=======================================",true);
		}
	}}