package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver ;

	By username = By.id("user-name");
	By password = By.xpath("//input[@name='password']");
	By loginButton = By.xpath("//input[@data-test='login-button']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public HomePage login() throws InterruptedException
	{
		driver.findElement(username).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(password).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(loginButton).click();
		Thread.sleep(3000);
		return new HomePage(driver);
		
	}
}
