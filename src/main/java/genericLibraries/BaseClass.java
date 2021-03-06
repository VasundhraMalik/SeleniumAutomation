package genericLibraries;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
 public static WebDriver driver;
 public PropertyFile pdata= new PropertyFile();
 public static WebDriverUtilies utilies=new WebDriverUtilies();
 
 @BeforeMethod
 public void openApp() throws FileNotFoundException, IOException
 {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(pdata.getData("url"));
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
 
 @AfterMethod
   
  public void closeapp(ITestResult res) throws IOException  {
	 int status = res.getStatus();
	 String name = res.getName();
	 if(status==2) {
	  Screenshot s=new Screenshot();
	  s.getPhoto(driver, name);
		 
	 }
	    
	 driver.quit();
}
 
 
}
