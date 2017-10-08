package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestRunPage {
	public WebDriver driver;
	public TestRunPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By TestRunPageTitle =By.xpath("html/body/div[1]/div/div[3]/h1");

	public WebElement getTestRunPageTitle()
	{
		return driver.findElement(TestRunPageTitle);
	}

}
