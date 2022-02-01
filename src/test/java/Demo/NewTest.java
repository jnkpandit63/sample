package Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("a");
  }

  @Test
  public void f() {
	  System.out.println("b");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("c");
  }

}
