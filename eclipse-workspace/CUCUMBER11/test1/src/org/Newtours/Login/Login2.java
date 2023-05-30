package org.Newtours.Login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login2 {
	@Test(priority=3)
	public void login()
	{
		System.out.println("login 2");
	}
	@Test(priority=4)
	public void logout()
	{
		System.out.println("logout");
	}

}
