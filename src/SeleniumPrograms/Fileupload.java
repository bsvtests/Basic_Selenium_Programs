package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
	static
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/contact-support");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//String filelocation = "C:\\Users\\iamsp\\Downloads";
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\iamsp\\Desktop\\Certification\\wp4056399-dark-netflix-wallpapers.jpg");
		
		
		Thread.sleep(3000);
		
		

	}

}
