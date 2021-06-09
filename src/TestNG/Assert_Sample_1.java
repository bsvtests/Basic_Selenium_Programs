package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Sample_1 {

	@Test
	public void testA()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement un = driver.findElement(By.id("username"));
		boolean v = un.isDisplayed();
		
		Assert.assertTrue(v);
	}
}

//Note:
//if expected result is true then use assertTrue().
//If the condition is true the it will update the status to PASSED.
//If the condition is false then it will update status to FAILED.