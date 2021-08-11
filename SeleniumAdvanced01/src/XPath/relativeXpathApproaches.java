package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class relativeXpathApproaches {
	
	WebDriver driver ; //selenium-java jar to add
	
  @BeforeMethod
  public void beforeMethod()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Youtube\\Selenum\\required jars\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
  }
	
	
  @Test
  public void f() throws InterruptedException {
//	  System.out.println("opened the application");
//	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");//basic xpath
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("secret_sauce");//contains
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//input[@type='submit' and @data-test='login-button']")).click();//AND or OR
//	  driver.close();
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.xpath("//input[starts-with(@data-test,'user')]")).sendKeys("standard_user");//starts-with
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//h4[text(),'Accepted usernames are:']")).isDisplayed();//text() - error occured
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();//index
	
	  
	  
	 
  }
}
