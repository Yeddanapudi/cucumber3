package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https://jqueryui.com/datepicker/");
d.switchTo().frame(0);
d.findElement(By.xpath("//input[@id='datepicker']")).click();

d.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody/tr[4]/td[5]")).click();

//d.findElement(By.xpath("//a[@class='ui-state-default']")).click();

//*[@id="ui-datepicker-div"]/table/tbody/tr[5]/td[1]/a
//*[@id="ui-datepicker-div"]/table/tbody/tr[5]/td[1]/a
//table[@class='ui-state-default']
	}

}
