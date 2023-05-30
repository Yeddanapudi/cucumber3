package TestN123;

import org.testng.annotations.Test;

public class test2 extends test1{
  @Test(priority=3)
  public void thirdtest() 
  {
	  System.out.println("this is my third test");
  }
  @Test(priority=4)
  public void fourthtest()
  {
	  System.out.println("this is my fourth test");
	  
  }
}
