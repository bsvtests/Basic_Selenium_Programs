package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class Autosuggestions {

	static
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/iamsp/Downloads/Selenium docs/sel java/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".Downloads/Selenium docs/sel java/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(2000);
		
		//To get address of all suggestions
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		//To count number of suggestions
		int count = allSuggestions.size();
		System.out.println(count);
		
		//To print all suggestions
		for(int i=0;i<count;i++)
		{
			WebElement suggestion = allSuggestions.get(i);
			String text = suggestion.getText();
			System.out.println(text);
		}		
		
		//To click on last suggestion
		allSuggestions.get(count-1).click();

		
	}

}
