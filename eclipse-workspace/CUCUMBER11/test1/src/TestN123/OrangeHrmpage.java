package TestN123;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
public class OrangeHrmpage {
  @Test(priority=-1,description="title of the page")
  public void title() {
	  String title=d.getTitle();
	System.out.println(title);  
	String exptitle="OrangeHRM";
	Assert.assertEquals(title, exptitle);
  }
 
  @Test(priority=2,description="url of the page",invocationCount=4)
  public void url()
  {
	  String url=d.getCurrentUrl();
	  System.out.println(url);
	String expurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	 Assert.assertEquals(url ,expurl);
	   
  }
  @Test(priority=3,description="user credentials")
  public void usercredentials()
  {
	  d.findElement(By.name("username")).sendKeys("Admin");
	  d.findElement(By.name("password")).sendKeys("admin123");
	  d.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
WebDriver d; 
  @BeforeClass
  public void beforeClass() {
  System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
  d=new ChromeDriver();
  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  d.manage().window().maximize();
  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
  }

  @AfterClass
  public void afterClass() {
	  d.close();
	  
  }

}
