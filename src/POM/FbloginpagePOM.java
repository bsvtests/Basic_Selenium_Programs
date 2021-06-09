package POM;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbloginpagePOM {static
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

public static void main(String[] args) throws InterruptedException, AWTException, IOException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);

	Fbloginpage object = new Fbloginpage(driver);

	object.enterusername("testbrandemail.com");
	object.enterpassword("123456789");
	object.clickonloginbutton("button");
	//driver.navigate().back();
	Thread.sleep(3000);

	object.enterusername("testbrandemail@gmail.com");
	object.enterpassword("India!@#$1234");
	object.clickonloginbutton("button");

}
}