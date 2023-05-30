package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2 {
WebDriver d; 
public void login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://wetransfer.com/");
	d.manage().window().maximize();
	
	d.findElement(By.xpath("//button[text()='Or select a folder']")).click();
	
	d.findElement(By.xpath("//button[text()='I accept']")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//button[text()='I agree']")).click();

		
	WebElement Email_id=d.findElement(By.xpath("//input[@id='autosuggest']"));
	Email_id.sendKeys("yeddanapudi1979@yahoo.com");
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement mail=d.findElement(By.id("email"));
	mail.click();
	mail.sendKeys("yeddanapudi6@gmail.com");
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement title=d.findElement(By.xpath("//input[@class='textfield__field']"));
	title.click();
	title.sendKeys("testingdocuments");
	
	WebElement msg=d.findElement(By.xpath("//textarea[@id='message']"));
	msg.sendKeys("welcome to testing tools");
	
	
		}

public static void main(String[] args) throws InterruptedException
{
	program2 a=new program2();
	a.login();
	
}
}
