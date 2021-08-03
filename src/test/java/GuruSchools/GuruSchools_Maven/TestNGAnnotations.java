package GuruSchools.GuruSchools_Maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations {
  @Test
  public void f() {
	  System.out.println("Inside the Test");	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside @AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside @AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside afterSuite");
  }

}
