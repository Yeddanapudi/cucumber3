package Alert_Meeages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https://demoqa.com/browser-windows");
d.manage().window().maximize();

String parent=d.getWindowHandle();
System.out.println(parent);
d.findElement(By.xpath("//button[@id='tabButton']")).click();
Set<String>child=d.getWindowHandles();
System.out.println(child);
for(String handle:child)
{
if(!(parent.equals(handle)))
		{
d.switchTo().window(handle);

WebElement text=d.findElement(By.id("sampleHeading"));
System.out.println(text.getText());

}


	}

}
}
