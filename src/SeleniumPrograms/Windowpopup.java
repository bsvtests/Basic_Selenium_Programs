package SeleniumPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowpopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\iamsp\\Downloads\\Selenium docs\\sel java\\geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException, IOException  
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.linkText("3.141.59")).click();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(3000);

		r.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);

		driver.close();
	}
}

