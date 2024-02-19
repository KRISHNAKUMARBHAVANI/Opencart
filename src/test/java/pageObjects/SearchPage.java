package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(name="search")WebElement searchbox;
	@FindBy(xpath="//button[@class='btn btn-light btn-lg']") WebElement searchbtn;
	@FindBy(xpath="//div[@class='col mb-3']") WebElement iMac;
public void Entersearchitems(String search) {
	
	searchbox.sendKeys(search);
	
}

public void clickonsubmit() {
	
	searchbtn.click();
}
public boolean validateResults() {
	try {
	return(iMac.isDisplayed());
}
	catch(Exception e){
		e.getMessage();
	}
	return false;
	
}

}