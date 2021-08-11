package XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XPathAxes {
	WebDriver driver ;
	
	@BeforeMethod
	public void beforeMethod()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Youtube\\Selenum\\required jars\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.saucedemo.com/");//
	}
	
  @Test
  public void f() 
  {
	  
  }
}
