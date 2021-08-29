package com.wiki.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wiki.qa.base.TestBase;
import com.wiki.qa.pages.CreateAccountPage;
import com.wiki.qa.pages.HomePage;
import com.wiki.qa.pages.SearchPage;
import com.wiki.qa.pages.UploadFilePage;

public class UploadFilePageTest extends TestBase{
	
	HomePage hp;
	SearchPage sp;
	CreateAccountPage cp;
	UploadFilePage up;
	
	
	public UploadFilePageTest()
	{
		super();
	
	}
	@BeforeClass
	public void startbrowser()
	{
		initialization();
		hp = new HomePage();
		hp.ClickButton();
		sp= new SearchPage();
		sp.clickbutton();
		sp.clicklink();
		cp= new CreateAccountPage();
		cp.createAccountTest("uname", "passwrd", "rtype", "email@gmail.com");
		cp.clickUploadFile();
		up = new UploadFilePage();
	}

	@Test
	public void uploadfilebtntest()
	{
		up.uploadfile();
	}
}







