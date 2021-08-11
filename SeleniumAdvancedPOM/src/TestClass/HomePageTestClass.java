package TestClass;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Setup.BaseClass;

public class HomePageTestClass extends BaseClass{
	
	WebDriver driver ;
	
	@BeforeMethod
	public void setDriver()
	{
		this.driver=intializeApplication();
	}
	
  @Test
  public void VerifyLoginLogout() throws InterruptedException 
  {
	  LoginPage lp = new LoginPage(driver);
	  HomePage hp = lp.login();
	  Thread.sleep(5000);
	  hp.logoutfunc();
	  
	  
  }
  
  
}
