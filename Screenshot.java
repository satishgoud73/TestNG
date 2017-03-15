package seleniumscreenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import library.Utility;

public class Screenshot
	{
   @Test 
	public void seleniumscreenshots() throws Exception 
	{
		
			
	System.setProperty("webdriver.gecko.driver", "C:\\selenium softwares\\geckodriver.exe");
	 
	WebDriver driver= new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.dice.com/");
	Utility.seleniumscreenshots(driver, "browserstarted");
	
   driver.findElement(By.id("search-field-keyword")).sendKeys("selenium");
   
 
   Utility.seleniumscreenshots(driver, "mysearch");
	 
   driver.quit();
		
	}
	}


