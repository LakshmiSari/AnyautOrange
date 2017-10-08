package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestdataPage {

	public WebDriver driver;
	public TestdataPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By testdataTitle =By.xpath("html/body/div[1]/div/div[3]/h1");

	public WebElement getTestdataPageTitle()
	{
		return driver.findElement(testdataTitle);
	}

}
