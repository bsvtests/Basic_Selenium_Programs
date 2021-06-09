package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Sample {

	@Test
	public void testA()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		String eTitle = "actiTIME - Logi";
		String aTitle = driver.getTitle();

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(aTitle, eTitle);
		
		driver.close();

		sa.assertAll();
	}
}

//SoftAssert:
//All the methods are non static methods
//Even if the comparison is failed, 
//it will execute remaining statements of current test method
//we have to call assertAll() to know in which statement and what error we are getting in the console.

//To verify basic and critical features, we use Assert and for others we use SoftAssert.