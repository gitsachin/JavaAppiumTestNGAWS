package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.InputPages.BaseClass;
import Pages.InputPages.ILogLevel;
import Pages.InputPages.TestCore;
import pages.LoginPage;

public class loginTest extends TestCore{
	
	@Test
	public void createAccountTest(){
		LoginPage loginPage = new LoginPage(driver);
		
		log("Test Started [Create New Account] test", ILogLevel.TESTCASE);
		
		BaseClass.takeScreenshot("launch");
		loginPage.clickOnSkipButton();
		loginPage.clickOnCreateAccount();
		loginPage.enterName();
		loginPage.enterPassword();
		loginPage.enterEmail();
		loginPage.clickOnSubmit();
		loginPage.clickOnCaminho();
		loginPage.clickOnOnetab();
		loginPage.clickOnIntroductionVideo();
		loginPage.clickOnCloseButton();
		loginPage.clickOnSimOption();
		loginPage.clickOnProfileTab();
		Assert.assertTrue(loginPage.isProfileNamePresent(loginPage.name), "[Name] doesn't present on profile page");
		loginPage.clickOnVideoTab();
		loginPage.clickOnVideoPlaybutton();
		
		log("Test Completed Successfully", ILogLevel.TESTCASE);
	}

}
