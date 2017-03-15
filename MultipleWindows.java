package seleniummultiplewindows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class MultipleWindows {
	
    //@Test
	//public void seleniummultiplewindows() throws InterruptedException
	public static void main(String[] args) throws InterruptedException 
	{
	
	System.setProperty("webdriver.gecko.driver", "C:\\selenium softwares\\geckodriver.exe")	;
		
		WebDriver d=new FirefoxDriver();
		
		d.manage().window().maximize();
		d.get("https://mycentralcas.ucmo.edu:8447/cas-web/login?service=https%3A%2F%2Fmycentral.ucmo.edu%2Fc%2Fportal%2Flogin");
	    Timeouts implicitlyWait = d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parent_window=d.getWindowHandle();
		
		System.out.println("before switching title is="+d.getTitle());
		d.findElement(By.xpath(".//*[@id='login']/div[5]/p/a/b/font")).click();
		 
	 Set<String> s1=d.getWindowHandles();
             
	 Iterator<String> i1=s1.iterator();
		
	 while(i1.hasNext()){
		 
		 String child_window= i1.next();
		 
		 if(!parent_window.equalsIgnoreCase(child_window))
			
		 {
		 
			 d.switchTo().window(child_window);
			 
		 Thread.sleep(10000);
		 
		 System.out.println("after switching title is="+d.getTitle());
		 d.quit();
	 }
	}

	 d.switchTo().window(parent_window);
	 System.out.println("back to parent window="+d.getTitle());
	 
	 
	 
	 
	}
}
