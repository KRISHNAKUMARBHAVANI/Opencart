package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAcccounPage;
import testBase.BaseClass;

public class LoginTestcase extends BaseClass {

	@Test(groups={"master","regression"})
	public void verifyLoginTest()
	{   logger.debug(" capturing debug logs");
		logger.info("started log in test");
		try {
	HomePage hm=new HomePage(driver);
	hm.clickOnMyAccount();
	hm.clickOnLogin();
	LoginPage log=new LoginPage(driver);
	
	log.SetEmailadress("mnb@gmail.com");
	log.SetPassword("test");
	log.clickonLoginButton();
	
	MyAcccounPage mcc=new MyAcccounPage(driver);
	
boolean targetpage=mcc.verifyMyaccout();
	Assert.assertEquals(targetpage, true);
		}
		catch(Exception e){
			Assert.fail();
		}
	logger.info(" execution completed");
	}
	
}
