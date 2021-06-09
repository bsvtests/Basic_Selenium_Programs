package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2_Batch_Sample extends TestMethods_Batch_Sample {

	@Test
	public void testC() {
		Reporter.log("test C----", true);
	}

	//	@Test(dependsOnMethods="testC")
	//	public void testD() {
	//		Reporter.log("test D----", true);
	//	}

	//	@Test(enabled=false)
	//	public void testD() {
	//		Reporter.log("test D----", true);
	//	}

}