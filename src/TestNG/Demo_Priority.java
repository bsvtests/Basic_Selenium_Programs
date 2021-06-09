package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_Priority {
	
	@Test(priority = 999)
	public void testA() {
		Reporter.log("test A method", true);
	}
	
	@Test(priority = 1)
	public void testB() {
		Reporter.log("test B method", true);
	}
}
