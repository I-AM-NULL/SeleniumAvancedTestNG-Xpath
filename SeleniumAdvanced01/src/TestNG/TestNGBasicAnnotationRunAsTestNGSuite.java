package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasicAnnotationRunAsTestNGSuite {
	 @Test
	  public void f() {
		  System.out.println("@Test");
	  }
	  
	  @BeforeClass
	  public void beforeClass()
	  {
		  System.out.println("@BeforeClass");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("@BeforeMethod");
	  }
	  
	  @BeforeSuite
	  public void beforeSuite()
	  {
		  System.out.println("@BeforeSuite");
	  }
	  
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("@BeforeTest");
	  }
	  
	  @AfterClass
	  public void afterClass()
	  {
		  System.out.println("@AfterClass");
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("@AfterMethod");
	  }
	  
	 
	  @AfterSuite
	  public void afterSuite()
	  {
		  System.out.println("@AfterSuite");
	  }
	  
	  @AfterTest
	  public void afterTest()
	  {
		  System.out.println("@AfterTest");
	  }
	  
}
