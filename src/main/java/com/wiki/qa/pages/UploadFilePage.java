package com.wiki.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiki.qa.base.TestBase;

public class UploadFilePage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"fuwStartScriptLink\"]/div[3]/span/a/span")
	WebElement uploadbtn;
	
	 public UploadFilePage()
	    {
	    	PageFactory.initElements(driver, this);
	    }
	
	//Actions methods
	
	public void uploadfile()
	{
		uploadbtn.click();
		
	}

}
