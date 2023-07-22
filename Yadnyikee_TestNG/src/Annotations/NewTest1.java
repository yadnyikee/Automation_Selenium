package Annotations;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
	
  @Test
  public void f() {
	  System.out.println("F test class");
  }
  //1.Before Suite
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite--> SetUp SystemProperty(or start selenium driver)");
  }
  
  //2.Before Test
  @BeforeTest
  public void beforeTest1() {
	  System.out.println("@BeforeTest--> Enter URL");
	  
  }

//3.Before Class
  @BeforeClass
  public void beforeClass() {
	  System.out.println(" @BeforeClass-->Lauch Browser");
  }

  //4.Before Method
  @BeforeMethod
  public void Steup() {
	  System.out.println("@BeforeMethod--> Login Application");
  }
  
 //5.@Test
  @Test
	  public void GoogleTest() {
		  System.out.println("@test-->google title1");
	  }
  
//6.After Method
  @AfterMethod
  public void afterMethod() {
	  System.out.println(" @AfterMethod--> Logout From application");
  }

  @Test
  public void facebook() {
	  System.out.println("@test-->facebook open");
  }
  
  //7.@AfterClass
  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass-->Close Browser");
  }

  //8.@AfterTest
  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest-->Delete Cookies");
  }

//9.@AfterSuite
  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite-->use to stop the selenium webdriver");
  }

}
