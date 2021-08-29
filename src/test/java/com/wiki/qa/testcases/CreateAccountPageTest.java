package com.wiki.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.wiki.qa.base.TestBase;
import com.wiki.qa.pages.CreateAccountPage;
import com.wiki.qa.pages.HomePage;
import com.wiki.qa.pages.SearchPage;
import com.wiki.qa.utilities.Xls_dataProvider;

public class CreateAccountPageTest extends TestBase{
	
	CreateAccountPage cp;
	HomePage hp;
	SearchPage sp;
	
	public CreateAccountPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void openbrowser()
	{
	    initialization();
		cp = new CreateAccountPage();
		hp = new HomePage();
		sp= new SearchPage();
		
		hp.ClickButton();
		sp.clickbutton();
		sp.clicklink();	
	}
	
	@Test(priority='1')
	public void CreateAccount()
	{
		cp.createAccountTest("uname", "passrd", "passrd", "email@gmail.com");
	}
/*
	@DataProvider(name="testdata")
	public Object[][] readExcel() throws Exception 
	{
	    Object input[] []=Xls_dataProvider.getTestData("Sheet1");
		return input;	
	}*/
	
	@Test(priority='2')
	public void uploadfileTest()
	{
		cp.clickUploadFile();
	}
	
}
