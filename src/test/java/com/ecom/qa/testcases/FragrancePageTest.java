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

public class FragrancePageTest extends TestBase {
	
	public static LoginPage loginPage;
	public static AccountPage accountPage;
	public static FragrancePage fragrancePage;
	public static MenPage menpage;
	
	
public FragrancePageTest() {
		
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		accountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		fragrancePage= accountPage.clickFragranceLink();
	}
	
	@Test (priority = 1)
	public void validatePageTitle() {
		
		String pageTitle = fragrancePage.getPageTitle();
		System.out.println("Page title is = " + pageTitle);
		
		Assert.assertEquals(pageTitle, "Fragrance", "***Fragrance Page Title not Found***");
	}
	
	@Test(priority = 2)
	public void validatePageLabel() {
		
		Assert.assertTrue(fragrancePage.pageLabel());
	}
	
	
	@Test (priority = 3)
	public void clickMenLink() {
		
		
		menpage = fragrancePage.clickMenLink();
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
