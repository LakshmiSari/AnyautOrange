package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {
public WebDriver driver;
public ElementsPage(WebDriver driver)
{
	this.driver=driver;
}
By elementsTitle =By.xpath("html/body/div[1]/div/div[3]/h1");

public WebElement getElementPageTitle()
{
	return driver.findElement(elementsTitle);
}




}


 