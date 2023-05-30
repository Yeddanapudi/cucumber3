package Alert_Meeages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		d.findElement(By.id("promtButton")).click();
		org.openqa.selenium.Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("welcome to python");
		Thread.sleep(2000);
		alt.accept();
		
		WebElement text=d.findElement(By.id("promptResult"));
		System.out.println(text.getText());
		
		
		
		
	}

}
