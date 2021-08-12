package Log4j;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class PropertyConfiguratorLog4j {
	
	WebDriver driver;
	
	Logger logger = Logger.getLogger(PropertyConfiguratorLog4j.class);
	PropertyConfigurator.Configure("");
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Youtube\\Selenum\\required jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		  driver.get("https://www.saucedemo.com/");
		  logger.info("Application login page is opened");
	}
	
  @Test
  public void f() {
	  logger.info("testclass is executed ");
  }
}
