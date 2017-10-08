package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuiltInKeywordsPage {
	public WebDriver driver;
	public BuiltInKeywordsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By BuiltInKeywordspageTitle =By.xpath("html/body/div[1]/div/div[3]/h1");

	public WebElement getBuiltinKeywordsPageTitle()
	{
		return driver.findElement(BuiltInKeywordspageTitle);
	}

}
