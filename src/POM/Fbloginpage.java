package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {

	//declaration
	@FindBy(id="email")
	private WebElement usernameTB;
	
	@FindBy(id="pass")
	private WebElement passwordTB;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement loginbutton;
	
	//initialization
	public Fbloginpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	public void enterusername(String un) {
		usernameTB.sendKeys(un);
	}
	
	public void enterpassword(String pwd) {
		passwordTB.sendKeys(pwd);
	}
	
	public void clickonloginbutton(String button) {
		loginbutton.click();
	}
	
}
