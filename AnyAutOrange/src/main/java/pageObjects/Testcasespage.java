package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testcasespage {
public WebDriver driver;
public Testcasespage(WebDriver driver)
{
	this.driver=driver;
}

By t_casesTitle =By.xpath("html/body/div[1]/div/div[3]/h1");
public WebElement getT_caseTitle()
{
	return driver.findElement(t_casesTitle);
}

}
