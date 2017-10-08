package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboardPage {
	public WebDriver driver;
	
	public dashboardPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By title = By.cssSelector(".page-header.text-center");
	By modules = By.xpath("html/body/div[1]/div/div[3]/div[1]/div[1]/a/div/div[1]/h4");
	By testCases =By.xpath("html/body/div[1]/div/div[3]/div[1]/div[2]/a/div/div[1]/h4");
	By testSteps = By.xpath("html/body/div[1]/div/div[3]/div[1]/div[3]/a/div/div[1]/h4");
	By elements = By.xpath("html/body/div[1]/div/div[3]/div[2]/div[1]/a/div/div[1]/h4");
	By testData = By.xpath("html/body/div[1]/div/div[3]/div[2]/div[2]/a/div/div[1]/h4");
	By userDefinedKeywords = By.xpath("html/body/div[1]/div/div[3]/div[2]/div[3]/a/div/div[1]/h4");
	By builtInKeywords = By.xpath("html/body/div[1]/div/div[3]/div[2]/div[4]/a/div/div[1]/h4");
	By testrun = By.xpath("html/body/div[1]/div/div[3]/div[3]/div/a/div/div[1]/h4");
	By testresults =By.xpath("html/body/div[1]/div/div[3]/div[4]/div/a/div/div[1]/h4");
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement clickModules()
	{
		return driver.findElement(modules);
	}
	
	public WebElement clickTestCases()
	{
		return driver.findElement(testCases);
	}
	public WebElement clickTestSteps()
	{
		return driver.findElement(testSteps);
	}
	public WebElement clickElements()
	{
		return driver.findElement(elements);
		
	}
	public WebElement clickTestdata()
	{
		return driver.findElement(testData);
	}
	public WebElement clickUserdefinedKeywords()
	{
		return driver.findElement(userDefinedKeywords);
	}
	public WebElement clickBuiltInKeywords()
	{
		return driver.findElement(builtInKeywords);
	}
	public WebElement clickTestRun()
	{
		return driver.findElement(testrun);
	}
	public WebElement clickTestResults()
	{
		return driver.findElement(testresults);
	}
	
	
	
}
