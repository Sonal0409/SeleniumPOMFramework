package com.wiki.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiki.qa.base.TestBase;

public class CreateAccountPage extends TestBase{
	

	
	@FindBy(id="wpName2")
    WebElement username;
	@FindBy(id="wpPassword2")
    WebElement pswd;
	@FindBy(id="wpRetype")
    WebElement rtype;
	@FindBy(id="wpEmail")
    WebElement mail;
	@FindBy(xpath="//*[@id='n-upload']/a")
	WebElement uploadlink;

	 public CreateAccountPage()
	    {
	    	PageFactory.initElements(driver, this);
	    }
	
	//ActionMethod
	
	public void createAccountTest(String name, String password, String retype, String email)
	{
		username.sendKeys(name);
		pswd.sendKeys(password);
		rtype.sendKeys(retype);
	    mail.sendKeys(email);
	}

	
	public UploadFilePage clickUploadFile()
	{
		uploadlink.click();
		return new UploadFilePage();
	}
}
