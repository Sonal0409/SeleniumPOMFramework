package com.wiki.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiki.qa.base.TestBase;

public class HomePage extends TestBase{
	
	// PageFactory
	
	@FindBy(id="searchInput")
	WebElement searchinputbox;
	
	@FindBy(xpath="//*[@id=\"search-form\"]/fieldset/button")
	WebElement searchbutton;
	
    public HomePage()
    {
    	PageFactory.initElements(driver, this);
    }
	
    //Action
    public String getTitleTest()
    {
    	return driver.getTitle();
    	
    }
    	
	public SearchPage ClickButton()
	{
		
		searchinputbox.sendKeys("Seleniumautomation");
		searchbutton.click();
		
		return new SearchPage();
	}
	
	
}
