package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver ;
	
	public WebDriver intializeApplication()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Youtube\\Selenum\\required jars\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.saucedemo.com/");
		  return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	

}
