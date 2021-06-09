package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2_Group_Sample extends BaseTest_Group_Sample 
{

	@Test(priority = 4 , groups = "smoke")
	public void createTask()
	{
		
		Reporter.log("task is created",true);
		
	}
	@Test(priority = 5 , groups = {"smoke","reg"})
	public void editTask()
	{
		
		Reporter.log("task is edited",true);
		
	}
	@Test(priority = 6,groups = "reg")
	public void deleteTask()
	{
		
		Reporter.log("task is deleted",true);
	
	}
}
