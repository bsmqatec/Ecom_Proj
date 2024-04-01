package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - OR:
	
	
	
	@FindBy (xpath = "//a[text()='Login or register']")
	WebElement loginbtn;
	
	@FindBy (name = "loginname")
	WebElement loginName;
	
	@FindBy (name ="password")
	WebElement password;
	
	@FindBy (xpath = "//button[@title='Login']")
	WebElement submitBtn;
	
	@FindBy (xpath ="//a/img[@title='Automation Test Store']")
	WebElement automationTestStoreLogo;

	//Initializing the Page Objects:
	public LoginPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean validateQAFoxImage(){
		return automationTestStoreLogo.isDisplayed();
	}
	
	
	
	public AccountPage login(String un, String pwd) {
		
		loginbtn.click();
		
		loginName.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		
		return new AccountPage();
	}
}
