package Alert_Meeages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https://demoqa.com/alerts");
d.manage().window().maximize();
d.findElement(By.id("alertButton")).click();

org.openqa.selenium.Alert alt=d.switchTo().alert();
System.out.println(alt.getText());
alt.accept();//accept is a function which allows the user to perform 
//certain operations on the alert window( OK button) 



	}

}
