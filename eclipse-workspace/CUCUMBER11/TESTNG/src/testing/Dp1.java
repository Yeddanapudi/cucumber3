package testing;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Dp1 {
WebDriver d; 
String page="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Test(dataProvider = "dp")
  public void f(String Username, String Pwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d=new ChromeDriver();
			d.get(page);
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
d.findElement(By.name("username")).sendKeys(Username);
System.out.println(Username);

d.findElement(By.name("password")).sendKeys(Pwd);
System.out.println(Pwd);

Thread.sleep(2000);

d.findElement(By.xpath("//button[@type='submit']")).click();

d.close();
	}

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
    };
  }
}
