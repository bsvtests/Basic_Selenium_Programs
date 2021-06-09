package SeleniumPrograms;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleofallbrowsers {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\iamsp\\Downloads\\Selenium docs\\sel java\\geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String win : allwindows)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			
		}
		
	}

}
