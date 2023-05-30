package Alert_Meeages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https://www.dezlearn.com/iframe-example/");
d.manage().window().maximize();
d.switchTo().frame(0);
d.findElement(By.id("u_5_6")).click();
WebElement text=d.findElement(By.id("processing"));
System.out.println(text.getText());
d.switchTo().defaultContent();
//WebElement t1=d.findElement(By.xpath("//*[text()='iframe 2']"));
d.switchTo().frame(1);

d.findElement(By.id("u_5_6")).click();
WebElement text1=d.findElement(By.id("processing"));
System.out.println(text1.getText());


	
		
	}
	

	
	

}
