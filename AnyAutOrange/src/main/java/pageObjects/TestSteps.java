package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestSteps {
	public WebDriver driver;
	 public TestSteps(WebDriver driver)
	 {
		 this.driver=driver;
	 }
By title_testSteps = By.xpath("html/body/div[1]/div/div[3]/h1");

  public WebElement getTestStepsPageTitle()
  {
	  return driver.findElement(title_testSteps);
  }
}