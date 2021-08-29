package com.wiki.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiki.qa.base.TestBase;

public class HomePage extends TestBase{
	
	//@FindBy: An annotation used in Page Factory to locate and declare web elements using different locators.
	
	
	@FindBy(id="searchInput")
	WebElement searchinputbox;
	
	@FindBy(xpath="//*[@id=\"search-form\"]/fieldset/button")
	WebElement searchbutton;
	
	// PageFactory
	//Page Factory is a class provided by Selenium WebDriver to support Page Object Design patterns. 
	//In Page Factory, testers use @FindBy annotation. The initElements method is used to initialize web elements.
	// driver is coming from Testbase class
	// "this" here means.. initialize all the variables in the current class with this driver
	// you can also write Homepage.class instad of this..
	//this means its pointing to the current class object
	
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
