package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	static

	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//All frames in the webpage
		int Allframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println(Allframes);
		
		//finding the frame with ID
		driver.switchTo().frame("a077aa5e");
		
		System.out.println("******** We are switching to the iframe using ID *******");
		
		//Clicks the iframe
 		driver.findElement(By.xpath("html/body/a/img")).click();
		    
 		System.out.println("*********We are done***************");
  }


	}