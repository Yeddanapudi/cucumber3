package org.Newtours.Login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loginwindow {
	@BeforeClass
	public void login() {
		System.out.println("login window sucessfully opened");
	}
@Parameters({"user name","password"})
	@Test(priority = 1)
	public void customerdetails(String username,String password ) {
		System.out.println("customer details sucessfully updated");
		System.out.println("the name which u entered is :"+username);
		System.out.println("the pwd which u entered is :"+password);
			
	
	}

	@Test(priority = 2)
	public void productDetails() {
		System.out.println("product details updated sucessfully");
	}

	@AfterClass
	public void closingPage() {
		System.out.println("window sucessfully closed");
	}
}
