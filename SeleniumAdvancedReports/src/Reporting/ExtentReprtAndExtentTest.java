package Reporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReprtAndExtentTest {
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest()
	{
//	report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
//	test = report.startTest("ExtentDemo");
		report = new ExtentReports();
		test = report.createTest("ExtentReprtAndExtentTest");
	}
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Youtube\\Selenum\\required jars\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	if(driver.getTitle().equals("Google"))
	{
//	test.log(LogStatus.PASS, "Navigated to the specified URL");
		test.log(Status.PASS, "Navigated to the specified URL");
	}
	else
	{
	test.log(Status.FAIL, "Test Failed");
	}
	}
	@AfterClass
	public static void endTest()
	{
//	report.endTest(test);
		report.removeTest(test);
	report.flush();
	}
	
}
