package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);

		//To get address of all suggestions
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		//To count number of suggestions
		int count = allSuggestions.size();
		System.out.println(count);
		Thread.sleep(4000);

		//To click on selenium webdriver
		for(int i=0;i<count;i++)
		{
			WebElement suggestion = allSuggestions.get(i);
			String text = suggestion.getText();
			Thread.sleep(4000);
			if(text.equals("selenium webdriver"))
			{
				suggestion.click();
				Thread.sleep(4000);
				break;
			}
		}
		driver.close();
	}}		
