package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schoolsframes {
	static

	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//All frames in the webpage
		int Allframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println(Allframes);
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='W3Schools HTML Tutorial']")));
		Thread.sleep(4000);
		driver.findElement(By.linkText("JAVASCRIPT")).click();
		Thread.sleep(4000);
		WebElement textinframe = driver.findElement(By.xpath("//div[@id='mainLeaderboard']/following-sibling::h1[1]"));
		System.out.println(textinframe.getText());
		Thread.sleep(4000);
		
		driver.switchTo().parentFrame();
		WebElement parentwindow = driver.findElement(By.xpath("//div[@id='mainLeaderboard']/following-sibling::h1[1]"));
		System.out.println(parentwindow.getText());
		driver.close();
  }


	}