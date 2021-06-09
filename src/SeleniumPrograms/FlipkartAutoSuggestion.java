package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestion {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[1]")).sendKeys("iPhone");
		Thread.sleep(3000);

		//To get address of all suggestions
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']/li"));

		//To count number of suggestions
		int count = allSuggestions.size();
		System.out.println(count);
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[1]")).clear();
		driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[1]")).sendKeys("iPhone 6s");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/ul[1]/li[1]/div[1]")).click();
		
		//To click on selenium webdriver
//		for(int i=0;i<count;i++)
//		{
//			WebElement suggestion = allSuggestions.get(i);
//			String text = suggestion.getText();
//			if(text.equals("qspiders hebbal"))
//			{
//				suggestion.click();
//				break;
//			}
//		}
		driver.close();
	}}		
