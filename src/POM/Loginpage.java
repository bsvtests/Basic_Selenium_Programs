package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	//Declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;

	//Initialization
	public Loginpage(WebDriver driver)
	{
		//this is used and acted here as current class object. This will represent current class object.
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}

	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}

	public void clickOnLogin()
	{
		loginBTN.click();
	}
}
