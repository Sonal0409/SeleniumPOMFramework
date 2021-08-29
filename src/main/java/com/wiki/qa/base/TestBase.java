package com.wiki.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {
	// Load the property file and instantiate driver(global)

		// All the page classes and test classes are going to inherit this driver object
		public static WebDriver driver;
		
		// Create one more object to access property file
		
		public static Properties prop;
		
		public TestBase() 
		{
			
			prop= new Properties();
			// load the property file
			FileInputStream file = null;
			try {
				file = new FileInputStream("C:\\Users\\vishal mittal\\workspace\\8.30PMPOMDEMOINSTRUCTOR\\src\\main\\java\\com\\wiki\\qa\\config\\config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// All test classes are going to inherit this method for opening the browser
		// for opening the url, wait time, max, delete cookies
		
		public static void initialization()
		{
			// open  browser
		
			String browsername= prop.getProperty("browser");
			
			if(browsername.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (29)\\chromedriver.exe");
				
				driver = new ChromeDriver();
			}
			if(browsername.equalsIgnoreCase("FireFox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Grid\\geckodriver.exe");
			 	driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			String urlname= prop.getProperty("url");
			driver.get(urlname);	
			
		}
	
}











