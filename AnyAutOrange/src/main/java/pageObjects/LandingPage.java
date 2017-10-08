package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	 By username = By.id("username");
	 By password = By.id("password");
	 By signin = By.id("singlebutton");
	 
	 public LandingPage(WebDriver driver) {
		this.driver=driver;
	}


	public  WebElement getUsername()
	 {
		 return driver.findElement(username);
		 
	 }
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement signinButton()
	{
		return driver.findElement(signin);
	}

}
