package SeleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltips {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();	
        
		driver.get("http://demo.guru99.com/test/tooltip.html");
        String expectedTooltip = "What's new in 3.2";					
        					
        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));							
        Actions builder = new Actions (driver);							

        builder.clickAndHold().moveToElement(download);					
        builder.moveToElement(download).build().perform(); 	
        
        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));	
       // toolTipElement.click();
        String actualTooltip = toolTipElement.getText();			
        
        System.out.println("Actual Title of Tool Tip = "+actualTooltip);							
        if(actualTooltip.equalsIgnoreCase(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        driver.close();			
   }		

}
