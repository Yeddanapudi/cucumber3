package TestN123;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test3 extends test2{
  @Test(priority=5)
  public void fifthtest() {
	  System.out.println("this is my fifth test cases");
  }
  @AfterTest
  public void closing()
  {
	  System.out.println("python page is closing");
	  
  }
}
