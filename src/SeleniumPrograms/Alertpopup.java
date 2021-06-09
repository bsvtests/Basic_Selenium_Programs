package SeleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(3000);
		
		Alert message = driver.switchTo().alert();
		String alertmsg = message.getText();
		
		System.out.println(alertmsg);
		message.accept();
		driver.close();
		
//		Date currentdate = new Date();
//		System.out.println(currentdate);
		
	}

}
