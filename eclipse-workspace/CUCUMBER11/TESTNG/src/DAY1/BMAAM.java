package DAY1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class BMAAM {

	  @BeforeMethod
	  public void login () {
	  System.out.println("login sucessfully opened");
	  }
	
	
	@Test(priority=1)
  public void Tandu() {
  
System.out.println("title and url of the page is sucessfully enabled to user");  
  }
  @Test(priority=2)
  public void customerdetails()
  
  {
	  System.out.println("customer details sucessfully updated");
  }
  
  @Test(priority=3)
  public void paymentdetails()
  {
	  System.out.println("payment sucessfully updated");
  }
  
@Test(priority=4)
public void feedback()
{
	System.out.println("feedback sucessfully updated from the user");
}
  
  @AfterMethod
  public void Logout() {
System.out.println("application sucessfully logged off ");

  }

}
