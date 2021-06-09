package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckboxes {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(3000);

		List<WebElement> listofCheckbox = driver.findElements(By.xpath("//table[@class='headerRowTable']/tbody[1]/tr[1]/td[1]/div[1]/div[1]"));
		
		for ( WebElement singlecheckbox : listofCheckbox ) {
			if (!singlecheckbox.isSelected()) {
				singlecheckbox.click();
				Thread.sleep(2000);
			}
		}
	}

}