package com.wiki.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wiki.qa.base.TestBase;
import com.wiki.qa.pages.CreateAccountPage;
import com.wiki.qa.pages.HomePage;
import com.wiki.qa.pages.SearchPage;

public class SearchPageTest extends TestBase {
	HomePage hp;
	
	SearchPage sp;
	
	CreateAccountPage cp;
	
	public SearchPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void startbrowser()
	{
		initialization();
		hp = new HomePage();
		sp = new SearchPage();	
		hp.ClickButton();
		 
	}

	// click on search button on page
	
	@Test
	public void clickbuttonTest()
	{
		sp.clickbutton();
	}
	
	// click on create account page
	@Test
	public void clicklinktest()
	{
		cp=sp.clicklink();
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}
