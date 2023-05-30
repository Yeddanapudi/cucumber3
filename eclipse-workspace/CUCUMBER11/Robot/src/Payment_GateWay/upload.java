
package Payment_GateWay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://itera-qa.azurewebsites.net/home/automation");
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	
	}
}



