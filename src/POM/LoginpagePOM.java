package POM;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpagePOM {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		Loginpage lp = new Loginpage(driver);

		lp.enterUserName("admin");
		lp.enterPassword("damager");
		lp.clickOnLogin();

		Thread.sleep(3000);

		lp.enterUserName("admin");
		lp.enterPassword("manager");
		lp.clickOnLogin();
		
		driver.close();
	}
}