package com.wiki.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiki.qa.base.TestBase;

public class SearchPage extends TestBase {
	
	@FindBy(xpath="//*[@id='mw-search-top-table']/div[1]/div/div/span/span/button")
	WebElement btn;
	
	@FindBy(linkText="Create account")
	WebElement linkCreateaccount;
	
	 public SearchPage()
	    {
	    	PageFactory.initElements(driver, this);
	    }
	
	 //ActionMethod
	 
	 public void clickbutton()
	 {
		 btn.click();
		
	 }
	 
	 public CreateAccountPage clicklink()
	 {
		 linkCreateaccount.click();
		 return new CreateAccountPage();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	

}
