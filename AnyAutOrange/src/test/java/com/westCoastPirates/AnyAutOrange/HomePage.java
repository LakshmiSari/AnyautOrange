package com.westCoastPirates.AnyAutOrange;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {
	
	public static final  Logger logger = Logger.getLogger(HomePage.class.getName());
	
	@BeforeTest
	
	
	public void initialize() throws IOException
	{
		// String log4jconfigPath = "log4j.properties";
			//PropertyConfigurator.configure(log4jconfigPath);
		driver=initializeDriver();
		logger.info("driver is initialized");
		  driver.get("https://anyaut.com/orange");
		  logger.info("navigated to homepage");
		
		  //PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\resources\\log4j.properties");
	}
	
	@Test(dataProvider="getdata")
	public void basePageNavigation( String Username , String Password ) throws IOException
	{
  
  LandingPage landing = new LandingPage(driver);
  landing.getUsername().clear();
  landing .getUsername().sendKeys(Username);
  getScreenShot("Homepage_invalid data");
  landing.getPassword().clear();
  landing.getPassword().sendKeys(Password);
  landing.signinButton().click();
  
	
 
 
  
}
	
	@DataProvider
	public Object[][] getdata()
	{
		//row stands for how many different data types test should run
		//Column stands for number of values passed in each test
		Object[][] data =new Object[2][2];
		data[0][0]="sirideepu.boddu@gmail.com";
		data[0][1]="valasapalli2";
		data[1][0]="sirideep.boddu@gmail.com";
		data[1][1]="valasapalli2";
		return data;
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		
	}
}

