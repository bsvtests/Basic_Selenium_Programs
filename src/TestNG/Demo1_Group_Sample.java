package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1_Group_Sample extends BaseTest_Group_Sample
{

	@Test(priority = 1,groups ="smoke")
	public void createUser()
	{

		Reporter.log("user is created",true);
	}

	@Test(priority = 2, groups = {"smoke","reg"})

	public void editUser()
	{

		Reporter.log("user is edited",true);

	}

	@Test(priority = 3 , groups = "reg")

	public void deleteUser()
	{

		Reporter.log("user is deleted",true);
	}

}