package SeleniumPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldownpage {
	
	static

	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/12293158/page-scroll-up-or-down-in-selenium-webdriver-selenium-2-using-java");
		
		Robot page = new Robot();
		page.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		page.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		
		page.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		page.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		driver.quit();
	
	}
}