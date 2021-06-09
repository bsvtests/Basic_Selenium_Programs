package SeleniumPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\iamsp\\Downloads\\Selenium docs\\sel java\\geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//table[@class='data-list']/tbody[1]/tr[4]/td[6]/a[1]")).click();

		Robot keys = new Robot();

		keys.keyPress(KeyEvent.VK_ALT);
		keys.keyPress(KeyEvent.VK_S);
		keys.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		keys.keyRelease(KeyEvent.VK_S);
		keys.keyRelease(KeyEvent.VK_ALT);
		keys.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);



	}
}