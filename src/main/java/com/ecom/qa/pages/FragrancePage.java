package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class FragrancePage extends TestBase{
	
	
	@FindBy (xpath = "//div/a[text()='Men']")
	WebElement menLink;
	
	
	@FindBy (xpath =  "//span[text()='Fragrance']")
	WebElement fragrancePageLabel;
	
	//Initializing the Page Objects:
		public FragrancePage () {
			PageFactory.initElements(driver, this);
		}
		
		
		//Actions
		
		public String getPageTitle() {
			return driver.getTitle();
		}
		
		
		public boolean pageLabel() {
			return fragrancePageLabel.isDisplayed();
		}
		
		
		public MenPage clickMenLink() {
			menLink.click();
			return new MenPage();
		}
	

}
