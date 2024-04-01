package com.ecom.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.AccountPage;
import com.ecom.qa.pages.FragrancePage;
import com.ecom.qa.pages.LoginPage;
import com.ecom.qa.pages.MenPage;
import com.ecom.qa.pages.ProductPage;

public class MenPageTest  extends TestBase{
	
	public static LoginPage loginPage;
	public static AccountPage accountPage;
	public static FragrancePage fragrancePage;
	public static MenPage menPage;
	public static ProductPage productPage;
	
	
	
	
	
public MenPageTest() {
		
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		accountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		fragrancePage= accountPage.clickFragranceLink();
		menPage=fragrancePage.clickMenLink();
	}
	
	
	
	@Test (priority = 1)
	public void validatePageTitle() {
		
		String pageTitle = menPage.getPageTitle();
		System.out.println("Page title is = " + pageTitle);
		
		Assert.assertEquals(pageTitle, "Men", "***Men Page Title not Found***");
	}
	
	@Test(priority = 2)
	public void validatePageLabel() {
		
		Assert.assertTrue(menPage.pageLabel());
	}
	
	
	@Test (priority = 3)
	public void clickMenLink() {
		
		
		productPage = menPage.clickPerfumeLink();
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
