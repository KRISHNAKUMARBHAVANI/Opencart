package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAcccounPage;
import testBase.BaseClass;
import utiliTies.DataProviders;

public class Datadriventestcases extends BaseClass {
	

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verifyLoginTest(String email, String password, String exp)
	{   logger.debug(" capturing debug logs");
		logger.info("started log in test");
		try {
	HomePage hm=new HomePage(driver);
	hm.clickOnMyAccount();
	hm.clickOnLogin();
	LoginPage log=new LoginPage(driver);
	
	log.SetEmailadress(email);
	log.SetPassword(password);
	log.clickonLoginButton();
	
	MyAcccounPage mcc=new MyAcccounPage(driver);
	
boolean targetpage=mcc.verifyMyaccout();

if(exp.equalsIgnoreCase("Valid"))
{
	if(targetpage==true)
	{
		mcc.clickonLogout();
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}
}

if(exp.equalsIgnoreCase("Invalid"))
{
	if(targetpage==true)
	{
		mcc.clickonLogout();
		Assert.assertTrue(false);
	}
	else
	{
		Assert.assertTrue(true);
	}
}
}
catch(Exception e)
{
Assert.fail("An exception occurred: " + e.getMessage());
}


	}
}


