package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotaionsHierachyExp {
  @Test
  public void Test() {
	  System.out.println("i'm test");
  }
  @BeforeMethod
  public void beforeMethod() {System.out.println("i'm beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {System.out.println("i'm afterMethod");
  }

  @BeforeClass
  public void beforeClass() {System.out.println("i'm beforeClass");
  }

  @AfterClass
  public void afterClass() {System.out.println("i'm afterClass");
  }

  @BeforeTest
  public void beforeTest() {System.out.println("i'm beforeTest");
  }

  @AfterTest
  public void afterTest() {System.out.println("i'm afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {System.out.println("i'm beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {System.out.println("i'm afterSuite");
  }

}
