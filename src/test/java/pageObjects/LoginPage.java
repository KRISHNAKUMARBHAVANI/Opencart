package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	
public LoginPage(WebDriver driver){
		
		super(driver);
	}
	@FindBy(xpath="//input[@id='input-password']")   WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']")   WebElement login;
	@FindBy(xpath="//input[@id='input-email']")  WebElement MailAddress;


public void SetEmailadress( String email) {
	
	MailAddress.sendKeys(email);
}

public void SetPassword(String pass)

{
	password.sendKeys(pass);
}
public void clickonLoginButton()
{
	login.click();
}



}
	
	
