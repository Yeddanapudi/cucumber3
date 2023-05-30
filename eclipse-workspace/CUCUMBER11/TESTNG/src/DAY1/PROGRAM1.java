package DAY1;

import org.testng.annotations.Test;

public class PROGRAM1 {
  @Test(priority=1)
  public void login() {
	  System.out.println("login sucessfully opened");
  }
  @Test(enabled=false)
  public void product_details()
  {
	  System.out.println("product details sucessfully updated");
  }
  @Test(enabled=false)
  public void payment_details()
  {
	  System.out.println("payment done sucessfully");
  }
  @Test(priority=4)
  public void delivery_process()
  {
	  System.out.println("delivered to right address");
	  
  }
  @Test(priority=5)
  public void logout()
  {
	  System.out.println("user sucessfully logged off ");
	  
  }
}
