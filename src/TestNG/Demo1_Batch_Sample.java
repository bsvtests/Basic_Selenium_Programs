package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1_Batch_Sample extends TestMethods_Batch_Sample{
	
	@Test
	public void testA() {
		Reporter.log("test A----", true);
	}
	
	@Test
	public void testB() {
		Reporter.log("test B----", true);
	}

}