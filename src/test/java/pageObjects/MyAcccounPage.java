package pageObjects;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAcccounPage extends BasePage{

	public MyAcccounPage(WebDriver driver) {
		super(driver);
}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")  WebElement myAccount;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement logoutbtn;


public boolean verifyMyaccout()

{
	try {
	return( myAccount.isDisplayed());
	}catch(Exception e) {
		
		return(false);
	}
}

public void clickonLogout() {
	
	logoutbtn.click();
}

}