package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.westCoastPirates.AnyAutOrange.HomePage;

public class base { 
	  public WebDriver driver;
	 public Properties prop;
	 public static final  Logger logger = Logger.getLogger(base.class.getName());
	public WebDriver initializeDriver() throws IOException
	{
		String log4jconfigPath = "log4j.properties";
		PropertyConfigurator.configure(log4jconfigPath);
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium Training\\AnyAutOrange\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium Training\\AnyAutOrange\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Desktop\\elenium Training\\AnyAutOrange\\drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
		}
		/*else if  (browserName =="IE")
		{
			System.setProperty(key, value);
			driver = new ;
		}*/
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver;
		
		
		
		
		
	}
	 public  void getScreenShot(String name)
	 {
		 Calendar calender =Calendar.getInstance();
		 SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		 
		  File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 try{
	 String reportdirectory =new File(System.getProperty("user.dir")).getAbsolutePath()+"//screenshot//";
	 File destFile = new File((String) reportdirectory +name + "_" + formater.format(calender.getTime())+ ".png");
	 FileUtils.copyFile(srcFile, destFile);
	 Reporter.log("<a href='"  + destFile.getAbsolutePath() + "'> <img src ='" + destFile.getAbsolutePath() + "'height='100' width='100'/> </a>");
	 
	 
	 }catch(IOException e){
		 e.printStackTrace();
	 }
	 
	 }
	

}
