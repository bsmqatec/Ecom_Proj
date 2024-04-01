package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class MenPage extends TestBase{
	
	@FindBy (xpath = "//a[@class='prdocutname' and text()='Pour Homme Eau de Toilette']")
	WebElement selectPerfume;
	
	
	@FindBy (xpath =  "//span[text()='Men']")
	WebElement menPageLabel;
	
	
	
	
	
	//Initializing the Page Objects:
			public MenPage() {
				
				PageFactory.initElements(driver, this);
			}
			
			
			
			//Actions
			
			public String getPageTitle() {
				return driver.getTitle();
			}
			
			
			public boolean pageLabel() {
				return menPageLabel.isDisplayed();
			}
			
			
			public ProductPage clickPerfumeLink() {
				selectPerfume.click();
				return new ProductPage();
			}

}
