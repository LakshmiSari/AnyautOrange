package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestResultspage {
	public WebDriver driver;
	public TestResultspage(WebDriver driver)
	{
		this.driver=driver;
	}
	By TestResultPageTitle =By.xpath("html/body/div[1]/div/div[3]/h1");

	public WebElement getTestResultPageTitle()
	{
		return driver.findElement(TestResultPageTitle);
	}
}
