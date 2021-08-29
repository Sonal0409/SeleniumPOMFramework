package com.wiki.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wiki.qa.base.TestBase;
import com.wiki.qa.pages.HomePage;
import com.wiki.qa.pages.SearchPage;

public class HomePageTest extends TestBase{
	
	HomePage hp;
	
	SearchPage sp;
	
	// create contructor of current class
	// use super() keyword here.. it calls the constructor of the TestBase class, only then you can use the initialized method.
	//otherwise it will give null pointer exception
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeClass
	public void startbrowser()
	{
		initialization();
		 hp = new HomePage();	
	}

	@Test(priority='1')
	public void TitleTest()
	{
		String title=hp.getTitleTest();
		System.out.println(title);
		Assert.assertEquals(title, "Wikipedia");
	}
	

	@Test(priority='4')
	public void clickbtnTest()
	{
		sp= hp.ClickButton();
	}
	
	

	
	
	
	
	
}
