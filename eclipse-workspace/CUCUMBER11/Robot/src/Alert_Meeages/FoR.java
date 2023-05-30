package Alert_Meeages;

import java.util.concurrent.TimeUnit;

import org.openqa.jetty.html.Font;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoR {
	WebDriver d; 
	public void login()
	
	{
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	d=new ChromeDriver();
	
	}
	public void login(String page)
	{
		d.get(page);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	public void login(String username, String pwd) throws InterruptedException
	{
		d.findElement(By.name("username")).sendKeys(username);
		d.findElement(By.name("password")).sendKeys(pwd);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		d.close();
		
		
	}
public static void main(String[] args) throws InterruptedException
{
	fol a2=new fol();
	a2.login();
	a2.login("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	a2.login("Admin","admin123");
	
	
	FoR a1=new FoR();
	a1.login();
	a1.login("https://demo.guru99.com/test/newtours/");
	a1.login("mercury	","mercury");
	
	
	
}

}
