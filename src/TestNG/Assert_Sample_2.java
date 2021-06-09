package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Sample_2 {

	@Test
	public void testA()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));

		boolean v = cb.isSelected();
		Assert.assertFalse(v);
	}
}
//Note:
//if expected result is false then use assertFalse().
//If the condition is false the it will update the status to PASSED.
//If the condition is true then it will update status to FAILED.
//In Assert, if the comparison is failed, it will not execute the remaining statements of the current test method. But it will execute other test methods.
//To overcome the above problem we use another class called as  SoftAssert.

//SoftAssert:
//SoftAssert class contains the same methods which are present Assert class but here they are non-static and overloaded methods.
//In SoftAssert class, even if the comparison failed it will execute remaining statements of the current test method but it will not update the result to the status.
//In order to update the result to the status, we have to call assertAll().
//assertAll() should be the last statement of the test method.