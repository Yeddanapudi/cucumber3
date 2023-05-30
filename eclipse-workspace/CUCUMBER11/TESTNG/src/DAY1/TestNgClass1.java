package DAY1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClass1 {

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite will be executed");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("aftersuite will be executed");
		
	}
@BeforeTest
public void beforetest()
{
	System.out.println("before test");
	
}
@AfterTest
public void afterTest()
{
	System.out.println("after test will be executed");
	
}
@BeforeClass 
public void beforeclass()
{
	System.out.println("before class will be executed");

}
@AfterClass
public void afterclass()
{
	System.out.println("after class will be executed");
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("before method will be executed");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("aftermethod will be executed");
}
@Test
public void test()
{
	System.out.println("test is executed sucessfully");
}
}
