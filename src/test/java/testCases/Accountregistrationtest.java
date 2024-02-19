package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistratonPage;
import testBase.BaseClass;

public class Accountregistrationtest extends BaseClass{
	
	 @Test(groups={"master","sanity"})
  public void RegestrationTest() throws InterruptedException {
	  logger.info("logs strted");
	  logger.debug("debuglogs");
	  try {
HomePage hm= new HomePage(driver);
hm.clickOnMyAccount();
logger.info("clicked on my account");
hm.ClickonRegister();
logger.info("click on my register");
Thread.sleep(2000);
logger.info("strted providing data");
RegistratonPage repage=new RegistratonPage(driver);
repage.SetFirstname(randomstring().toUpperCase());
repage.SetLastname(randomstring().toUpperCase());
repage.SetEmail(randomstring()+"@gmail.com");
repage.SetPassword(Alphanumeric());
Thread.sleep(2000);

repage.setPrivacyPolicy();


repage.clickContinue();
logger.info("clicked on continue..");

String confmsg=repage.getConfirmationMsg();

logger.info("Validating expected message..");

Assert.assertEquals(confmsg, "Your Account Has Been Created!","Account creation failed");

	  }
catch(Exception e){
	Assert.fail();
System.out.println(e.getMessage());
logger.error("failed test case");
logger.debug("debuglogs");
  }
  logger.info("logs completed");

  }



}