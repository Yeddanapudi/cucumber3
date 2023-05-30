package Alert_Meeages;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
public class reading {
	WebDriver d; 
  @Test(dataProvider = "parameterization")
  public void Student(String value, String name) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.findElement(By.name("username")).sendKeys(value);
	d.findElement(By.name("password")).sendKeys(name);
	d.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	d.close();
  }

  @DataProvider
  public Object[][] parameterization() {
 Object[][] obj = new Object[2][2];
obj[0][0] = "Admin";
obj[0][1] = "admin123";
obj[1][0] = "Admin";
obj[1][1] = "admin123";
return obj; 
    };
  }
