package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	WebDriver driver; 
	By threeLines = By.id("react-burger-menu-btn");
	By logout = By.id("logout_sidebar_link");
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void logoutfunc() throws InterruptedException
	{
		driver.findElement(threeLines).click();
		Thread.sleep(10000);
		driver.findElement(logout).click();
	}

}
