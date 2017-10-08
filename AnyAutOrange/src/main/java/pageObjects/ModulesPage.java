package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModulesPage {
public WebDriver driver;

public ModulesPage(WebDriver driver)
{
	this.driver=driver;
}

By title = By.xpath("html/body/div[1]/div/div[3]/h1");
 
public WebElement getModulePageTitle()
{
	return driver.findElement(title);
}







}
