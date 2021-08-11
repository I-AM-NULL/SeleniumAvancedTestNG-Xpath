package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertVsSoftAssert {
	
	String sName = "soft";
	
  @Test
  public void f() {
	  SoftAssert sa = new SoftAssert();
	  sa.assertTrue(sName.equals("Soft"));
	  
	  System.out.println("SoftAssert");
	  System.out.println("1");
	  System.out.println("2");
	  System.out.println("3");
  }
  
  
//  @Test
//  public void test()
//  {
//	  Assert.assertTrue(sName.equals("Soft"));
//	  
//	  System.out.println("HardAssert");
//	  System.out.println("1");
//	  System.out.println("2");
//	  System.out.println("3");
//  }
}
