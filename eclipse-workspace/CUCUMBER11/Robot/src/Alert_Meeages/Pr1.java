package Alert_Meeages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
FileInputStream f=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\CUCUMBER11\\Robot\\src\\Alert_Meeages\\pp1.properties");
Properties p1=new Properties();
p1.load(f);
System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get(p1.getProperty("url"));
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
d.findElement(By.name("username")).sendKeys(p1.getProperty("username"));
System.out.println(p1.getProperty("username"));
d.findElement(By.name("password")).sendKeys(p1.getProperty("pwd"));
System.out.println(p1.getProperty("pwd"));
Thread.sleep(2000);
d.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
d.close();

	}

}
