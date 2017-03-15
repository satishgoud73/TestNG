package languagechange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class LanguagChange
{
	
		
		public static void main(String[] args)
		{
		
			FirefoxProfile fireFoxProfile = new FirefoxProfile();
			// setting language to telugu using firefoz profile
			fireFoxProfile.setPreference("intl.accept_languages", "hi");
			System.setProperty("webdriver.gecko.driver", "C:\\selenium softwares\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver(fireFoxProfile);
			driver.get("https://www.facebook.com/");
			
		}
		}

