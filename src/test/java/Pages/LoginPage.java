package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import Pages.InputPages.BaseClass;
import Pages.InputPages.ILogLevel;
import io.appium.java_client.AppiumDriver;
import pageObject.LoginPageObject;

public class LoginPage extends BaseClass{

	public LoginPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
	 Date date = new Date();
	public String name = "QA"+dateFormat.format(date);
	public String email = "test"+dateFormat.format(date)+"@mailinator.com";
	public String password = "Testing"+AutogenerateNumbers(4);
	
	public void clickOnSkipButton(){
		click(By.id(LoginPageObject.skipButton_id), "[Skip] button", 2);
		takeScreenshot("Skip button");
	}
	
	public void clickOnCreateAccount(){
		click(By.xpath(LoginPageObject.createAccount_xpath), "[CRIAR CONTA] button", 3);
		takeScreenshot("Create Account");
	}
	
	public void enterName(){
		sendKeys(By.id(LoginPageObject.name_id), name, 3, name);
		takeScreenshot("Name");
	}
	
	public void enterEmail(){
		driver.hideKeyboard();
		sendKeys(By.id(LoginPageObject.email_id), email, 3, email);
		takeScreenshot("Email");
	}
	
	public void enterPassword(){
		sendKeys(By.id(LoginPageObject.password_id), password, 3, password);
		takeScreenshot("Password");
	}
	
	public void clickOnSubmit(){
		driver.hideKeyboard();
		click(By.xpath(LoginPageObject.submit_xpath), "[Entrar] button", 3);
		takeScreenshot("Submit");
	}
	
	public void clickOnCaminho(){
		takeScreenshot("Chaminho");
		click(By.xpath(LoginPageObject.caminho_xpath), "Chaminho", 3);
	}
	
	public void clickOnOnetab(){
		waitForElementDisplayed(By.id(LoginPageObject.one_id));
		click(By.id(LoginPageObject.one_id), "1", 3);
		takeScreenshot("1");
	}
	
	public void clickOnIntroductionVideo(){
		click(By.id(LoginPageObject.introduction_id), "[Introduction] tab", 10);
		takeScreenshot("Introduction");
	}
	
	public void clickOnCloseButton(){
		if(isElementPresent(By.id(LoginPageObject.closeButton_id))){
		click(By.id(LoginPageObject.closeButton_id), "[X] icon", 3);
		takeScreenshot("Close");
		}else{
			driver.navigate().back();
			takeScreenshot("back");
		}
	}
	
	public void clickOnSimOption(){
		click(By.id(LoginPageObject.yesButton_id), "Sim", 3);
		takeScreenshot("Sim");
	}
	
	public void clickOnProfileTab(){
		click(By.id(LoginPageObject.profiletab_id), "[Profile] tab", 3);
		takeScreenshot("Profile");
	}
	
	public boolean isProfileNamePresent(String _name){
		boolean text = isElementPresent(By.id(LoginPageObject.profileName_id));
		String name = driver.findElement(By.id(LoginPageObject.profileName_id)).getText();
		if(name.equals(_name)){
			log(name+" is present on Profile page", ILogLevel.METHOD);
			return true;
		}
		return false;
	}
	
	public void clickOnVideoTab(){
		click(By.id(LoginPageObject.videoTab_id), "[Videos] tab", 3);
		takeScreenshot("Videos");
	}
	
	public void clickOnVideoPlaybutton(){
		click(By.xpath(LoginPageObject.videoPlaybutton_xpath), "[Play] button", 5);
		takeScreenshot("Play");
		driver.navigate().back();
		takeScreenshot("Back");
	}
	

}
