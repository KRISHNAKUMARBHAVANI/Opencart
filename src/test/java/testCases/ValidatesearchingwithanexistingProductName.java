package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class ValidatesearchingwithanexistingProductName extends BaseClass{
   @Test(groups={"master","regression"})
	public void validatingSearchbox() {
	   try {
	HomePage hm=new HomePage(driver);
	hm.clickOnMyAccount();
	hm.clickOnLogin();
	LoginPage lp= new LoginPage(driver);
	lp.SetEmailadress(p.getProperty("email"));
	lp.SetPassword(p.getProperty("password"));
	lp.clickonLoginButton();
	SearchPage sp= new SearchPage(driver);
	sp.Entersearchitems("iMac");
	sp.clickonsubmit();
Assert.assertTrue(sp.validateResults());
	   }
	   catch(Exception e) {
		   Assert.fail();
	   }
	}
	
	

	
}
