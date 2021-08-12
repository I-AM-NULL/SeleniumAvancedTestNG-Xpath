package Log4j;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class BasicConfiguratorLog4j {
	
	
	WebDriver driver ;
	Logger logger = Logger.getLogger(BasicConfiguratorLog4j.class);
//	BasicConfigurator.configure();
	
	@BeforeMethod 
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Youtube\\Selenum\\required jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		logger.info("logged into appliation");
		
	}
  @Test
  public void f() {
	  logger.info("test class is executed ");
  }
}
