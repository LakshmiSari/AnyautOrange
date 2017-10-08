package com.westCoastPirates.AnyAutOrange;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.BuiltInKeywordsPage;
import pageObjects.ElementsPage;
import pageObjects.LandingPage;
import pageObjects.ModulesPage;
import pageObjects.TestResultspage;
import pageObjects.TestRunPage;
import pageObjects.TestSteps;
import pageObjects.dashboardPage;
import resources.base;
import pageObjects.Testcasespage;
import pageObjects.TestdataPage;
import pageObjects.UserDefinedKeywordsPage;

public class Dashboard extends base{
	//public static  Logger log =LogManager.getLogger(base.class.getName());
	public static final  Logger logger = Logger.getLogger(Dashboard.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		logger.info("Driver is initialized");
		//driver.get(prop.getProperty("url"));
		driver.get("https://anyaut.com/orange");
		logger.info("Navigated to Homepage");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void dashboardnavigation() throws IOException, InterruptedException
	{
		
		dashboardPage dashboard = new dashboardPage(driver);
		 LandingPage landing = new LandingPage(driver);
		 ModulesPage module = new ModulesPage(driver);
		 Testcasespage t_cases = new Testcasespage(driver);
		 TestSteps t_steps = new TestSteps(driver);
		 ElementsPage elements =new ElementsPage(driver);
		 TestdataPage testdata = new TestdataPage(driver);
		 UserDefinedKeywordsPage user_keywords = new UserDefinedKeywordsPage(driver);
		 BuiltInKeywordsPage builtinkeywords = new BuiltInKeywordsPage(driver);
		 TestRunPage testrun = new TestRunPage(driver);
		 TestResultspage testresults = new TestResultspage(driver);
		 
		  landing.getUsername().clear();
		  landing .getUsername().sendKeys("sirideep.boddu@gmail.com");
		  landing.getPassword().clear();
		  landing.getPassword().sendKeys("valasapalli2");
		  landing.signinButton().click();
		  logger.info("Sucessfully logged in with valid user details");
		  getScreenShot("dashboard");
        Assert.assertEquals(dashboard.getTitle().getText(), "Dashboard");
        logger.info("Sucessfully validated the Dashboard title");
       Thread.sleep(6000);
        dashboard.clickModules().click();
        Thread.sleep(2000);
        logger.info("Sucessfully navigated to Modules page");
        getScreenShot("ModulesPage");
        Assert.assertEquals(module.getModulePageTitle().getText(),"Add/Edit Module");
        driver.navigate().back();
        logger.info("Sucessfully validated the Modules page title");
        Thread.sleep(2000);
        dashboard.clickTestCases().click();
        Thread.sleep(3000);
        logger.info("Sucessfully navigated to TestCasesPage page");
        getScreenShot("TestCasePage");
        Assert.assertEquals(t_cases.getT_caseTitle().getText(), "Add/Edit Test Cases");
       Thread.sleep(2000);
       logger.info("Sucessfully validated the Testcases page title");
       driver.navigate().back();
       Thread.sleep(2000);
       dashboard.clickTestSteps().click();
       Thread.sleep(3000);
       logger.info("Sucessfully navigated to TestStepsPage page");
       getScreenShot("TestStepsPage");
       Assert.assertEquals(t_steps.getTestStepsPageTitle().getText(),"Add/Edit Test Steps");
       Thread.sleep(3000);
       logger.info("Sucessfully validated the Teststeps page title");
       driver.navigate().back();
       Thread.sleep(2000);
       dashboard.clickElements().click();
       Thread.sleep(3000);
       logger.info("Sucessfully navigated to Elements page");
       getScreenShot("ElementsPage");
       Assert.assertEquals(elements.getElementPageTitle().getText(),"Add/Edit Element Map");
       Thread.sleep(3000);
       logger.info("Sucessfully validated the Elements page title");
       driver.navigate().back();
       Thread.sleep(3000);
       dashboard.clickTestdata().click();
       Thread.sleep(2000);
       logger.info("Sucessfully navigated to TestData page");
       getScreenShot("testDataPage");
       Assert.assertEquals(testdata.getTestdataPageTitle().getText(),"Add/Edit Test Data");
       Thread.sleep(2000);
       logger.info("Sucessfully validated the TestData page title");
       driver.navigate().back();
       Thread.sleep(2000);
       dashboard.clickUserdefinedKeywords().click();
       Thread.sleep(2000);
       logger.info("Sucessfully navigated to UserDefinedKeywords page");
       getScreenShot("UserdefinedKeywordspage");
       Assert.assertEquals(user_keywords.getUserDefinedKeywordsPageTitle().getText(),"Add/Edit User Defined Keywords");
       Thread.sleep(2000);
       logger.info("Sucessfully validated the Userdeifined page title");
       driver.navigate().back();
       Thread.sleep(2000);
       dashboard.clickBuiltInKeywords().click();
       Thread.sleep(2000);
       logger.info("Sucessfully navigated to BuiltInKeywords  page");
       getScreenShot("BuiltinKeywordsPage");
       Assert.assertEquals(builtinkeywords.getBuiltinKeywordsPageTitle().getText(),"Available Built-In Keywords");
       Thread.sleep(2000);
       logger.info("Sucessfully validated the BuiltInKeywords page title");
       driver.navigate().back();
       Thread.sleep(2000);
       dashboard.clickTestRun().click();
       Thread.sleep(2000);
       logger.info("Sucessfully navigated to TestRun  page");
       getScreenShot("TestRunPage");
       Assert.assertEquals(testrun.getTestRunPageTitle().getText(),"Test Run");
       Thread.sleep(2000);
       logger.info("Sucessfully validated the TestRun page title");
       driver.navigate().back();
       Thread.sleep(2000);
       dashboard.clickTestResults().click();
       Thread.sleep(2000);
       logger.info("Sucessfully navigated to TestResults  page");
       getScreenShot("testResultsPage");
       Assert.assertEquals(testresults.getTestResultPageTitle().getText(),"Test Results");
       Thread.sleep(2000);
       logger.info("Sucessfully validated the TestResults page title");
       driver.navigate().back();
       Thread.sleep(2000);
       
       
       
		
	}
@AfterTest
public void teardown()
{
	driver.close();
}

}
