package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class AccountPage extends TestBase{
	
	
	
	@FindBy (xpath="//div[text()='Welcome back Bhabani Shankar']")
	WebElement usernameLabel;
	
	@FindBy (xpath ="//ul[@class='nav-pills categorymenu']/li/a[contains(text(),'Fragrance')]")
	WebElement fragranceLink;
	
	@FindBy (xpath = "//ul[@class='nav-pills categorymenu']/li/a[contains(text(),'Skincare')]")
	WebElement skinCareLink;
	
	@FindBy (xpath = "//ul[@class='nav-pills categorymenu']/li/a[contains(text(),'Haircare')]")
	WebElement hairCareLink;
	
	@FindBy (xpath = "//ul[@class='side_account_list']/li/a[contains(text(),'Manage Address Book')]")
	WebElement manageAddressBookLink;
	
	
	
	//Initializing the Page Objects:
		public AccountPage() {
			
			PageFactory.initElements(driver, this);
		}
		
		
		//Actions
		
		
		public String accountPageTitle() {
			return driver.getTitle();
		}
		
		public boolean validateUserNameLabel() {
			
			return usernameLabel.isDisplayed();
		}
		
		
		public FragrancePage clickFragranceLink() {
			fragranceLink.click();
			
			return new FragrancePage();
		}
		
		
		public SkinCarePage clickSkinCareLink() {
			skinCareLink.click();
			
			return new SkinCarePage();
		}
		
		public HairCarePage clickHairCareLink() {
			hairCareLink.click();
			
			return new HairCarePage();
		}
		
		
		public ManageBookAddressPage clickManageBookAddressLink() {
			manageAddressBookLink.click();
			
			return new ManageBookAddressPage();
		}
		
	
	
	
	
	
	
	
	
	

}
