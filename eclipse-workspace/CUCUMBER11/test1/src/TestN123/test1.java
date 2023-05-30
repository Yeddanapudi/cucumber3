package TestN123;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class test1 {
	
	@BeforeTest
	  public void Login() {
		  System.out.println("welcome to python login page ");
	  }
	
	@Test(priority=1)
  public void FirstText() {
	  System.out.println("this is my first test");
  }
  
@Test(priority=2)
public void secondTest()
{
	System.out.println("the tile of the page is python ");
}
  
  }


