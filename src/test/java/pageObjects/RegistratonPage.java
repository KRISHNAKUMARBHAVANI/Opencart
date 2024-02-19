package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistratonPage  extends BasePage{

	WebDriver driver;
	public RegistratonPage(WebDriver driver) {
		super(driver);
		

	}
	

@FindBy(xpath="//input[@id='input-firstname']")   WebElement firstName;
@FindBy(xpath="//input[@id='input-lastname']")   WebElement lastName;
@FindBy(xpath="//input[@id='input-email']")   WebElement eMail;
@FindBy(xpath="//input[@id='input-password']")   WebElement password;
@FindBy(xpath="//input[@name='agree']") 
WebElement chkdPolicy;

@FindBy(xpath="//input[@value='Continue']") 
WebElement btnContinue;

@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;


public void SetFirstname(String frstname) {
	firstName.sendKeys(frstname);
}
public void SetLastname(String lastname) {
	lastName.sendKeys(lastname);	
}

public void SetEmail(String mail) {
	eMail.sendKeys(mail);	
}

public void SetPassword(String passwrd) {
	password.sendKeys(passwrd);
}
public void setPrivacyPolicy() {
	chkdPolicy.click();

}
public void clickContinue() {
	//sol1 
	btnContinue.click();
	
	//sol2 
	//btnContinue.submit();
	
	//sol3
	//Actions act=new Actions(driver);
	//act.moveToElement(btnContinue).click().perform();
				
	//sol4
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", btnContinue);
	
	//Sol 5
	//btnContinue.sendKeys(Keys.RETURN);
	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	
}

public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	} catch (Exception e) {
		return (e.getMessage());

	}

}
}


