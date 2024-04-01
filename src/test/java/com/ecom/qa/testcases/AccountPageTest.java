package com.ecom.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.AccountPage;
import com.ecom.qa.pages.FragrancePage;
import com.ecom.qa.pages.LoginPage;

public class AccountPageTest extends TestBase{
	
	public static LoginPage loginPage;
	public static AccountPage accountPage;
	public static FragrancePage fragrancePage;
	
	
	
	public AccountPageTest() {
		
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		accountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test (priority = 1)
	public void validateUserName() {
		String pageTitle = accountPage.accountPageTitle();
		System.out.println("Page title is = " + pageTitle);
		
		Assert.assertEquals(pageTitle, "My Account", "***Account Page Title not Found***");
	}
	
	
	@Test(priority = 2)
	public void validateUserNameLabel() {
		Assert.assertTrue(accountPage.validateUserNameLabel());
	}
	
	
	@Test (priority = 3)
	public void clickFragranceLink() {
		fragrancePage = accountPage.clickFragranceLink();
		
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}
