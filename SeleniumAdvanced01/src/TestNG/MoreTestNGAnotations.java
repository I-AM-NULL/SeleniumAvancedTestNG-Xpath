package TestNG;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MoreTestNGAnotations {//@Optional,@Parameters,@DataProvider
	
	
//  @Test
//  @Parameters({"username","password"})
//  public void test(String UserName,String Password) {
//	  System.out.println("username is "+UserName);
//	  System.out.println("password is "+Password);
//  }
//  
//  @Test
//  @Parameters({"Username","password"})
//  public void test02(@Optional("STR") String  UserName,String Password) {
//	  System.out.println("username is "+UserName);
//	  System.out.println("password is "+Password);
//  }
//  
  
  @DataProvider(name="List")
  public Object[] list()// must return either Object[][] or Object[] or Iterator&lt;Object[]&gt; or Iterator&lt;Object&gt;,
  {
	  Object[] l= new Object[3];
	 l[0]	= 1;
	 l[1]   = 2;
	 l[2]   = 3;
	  return l;
  }
  
  @Test(dataProvider = "List")
  public void test(Integer i)
  {
	System.out.println("Integer is "+i);  
  }
  
  
  @DataProvider(name="2D")
  public Object[] matrix()// must return either Object[][] or Object[] or Iterator&lt;Object[]&gt; or Iterator&lt;Object&gt;,
  {
	  Object[][] o= new Object[2][2];
	 o[0][0]	= 1;
	 o[1][0]   = 2;
	 o[0][1]   = "sai";
	 o[1][1]   = "teja";
	 
	  return o;
  }
  
  @Test(dataProvider = "2D")
  public void testMatrix(Integer i,String name)
  {
	System.out.println("Integer is "+i);  
	System.out.println("name is "+name);
  }
  
  
  
  
  
  
  
  
  
  
}
