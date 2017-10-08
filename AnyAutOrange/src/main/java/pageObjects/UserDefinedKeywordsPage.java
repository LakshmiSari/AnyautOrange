package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserDefinedKeywordsPage {
	public WebDriver driver;
	public UserDefinedKeywordsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By UserdefinedKeywordspageTitle =By.xpath("html/body/div[1]/div/div[3]/h1");

	public WebElement getUserDefinedKeywordsPageTitle()
	{
		return driver.findElement(UserdefinedKeywordspageTitle);
	}

}
