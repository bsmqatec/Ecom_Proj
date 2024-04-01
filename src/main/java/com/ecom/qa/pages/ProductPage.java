package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecom.qa.base.TestBase;

public class ProductPage extends TestBase{
	
	
	@FindBy (xpath = "//a[text()='Pour Homme Eau de Toilette']")
	WebElement selectPerfume;
	
	

}
