package Alert_Meeages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {
	public void Opening_Browser()
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();

        // start application
d.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        // click on date picker so that we can get the calendar in view 
d.findElement(By.id("datepicker")).click();
	
        // this will find all matching nodes in calendar		
List<WebElement> allDates=d.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        // now we will iterate all values and will capture the text. We will select when date is 28
for(WebElement ele:allDates)
{
	
	String date=ele.getText();
	
                // once date is 28 then click and break
	if(date.equalsIgnoreCase("25"))
	{
		ele.click();
		break;
	}
	
}
	}
public static void main(String[] args)
{
	Calender a1=new Calender();
	a1.Opening_Browser();
	
}
}
