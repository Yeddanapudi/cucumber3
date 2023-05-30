package DAY1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orange_Hrm {
	WebDriver d; 
  String page="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Test(priority=1)
  public void Opening_browser() {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	  d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
  }
  @Test(priority=2)
  public void Navigate()
  {
	  d.get(page);
	  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
  }
  @Test(priority=3)
  public void title()
  {
	  String title=d.getTitle();
	  System.out.println(title);
	  
  }
  @Test(priority=4)
  public void url()
  {
	  String url=d.getCurrentUrl();
	  System.out.println(url);
	  
  }
  @Test(priority=5)
  public void Usercredentials()
  {
	  d.findElement(By.name("username")).sendKeys("Admin");
	  d.findElement(By.name("password")).sendKeys("admin123");
  }
	
  @Test(priority=6) 
	  public void screenshot() throws IOException
	  {
	 	 File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	 	 FileUtils.copyFile(src, new File("D://p1.png"));
	  }
  
@Test(priority=7)
 public void close() throws InterruptedException
 {
	  d.findElement(By.xpath("//button[@type='submit']")).click();

Thread.sleep(2000);
	  d.close();
	 
 }
}
