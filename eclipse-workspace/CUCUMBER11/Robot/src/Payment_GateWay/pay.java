package Payment_GateWay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pay {
	WebDriver d;
	public void Opening_browser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");

		d=new ChromeDriver();
		d.get("https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php");

		d.manage().window().maximize();
		d.findElement(By.xpath("//a[text()='Customer']")).click();
		
		WebElement text=d.findElement(By.xpath("//*[@class='heading3']"));
		System.out.println(text.getText());
		
		d.findElement(By.xpath("//a[text()='Mini Statement']")).click();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement text1=d.findElement(By.xpath("//p[text()='Mini Statement Form']"));
		System.out.println(text1.getText());

		Thread.sleep(2000);
	    
		d.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

	/*WebElement ac=d.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]"));
	
		List<WebElement> allOptions =d.findElements(By.tagName("option"));
		//List<WebElement> acc=ac.findElements(By.tagName("option"));
		System.out.println(allOptions.size());
		for(int i=1;i<allOptions.size();i++)
		{
		System.out.println(allOptions.get(i).getText());
			}
	*/
	    d.findElement(By.name("//select[@name='accountno']")).sendKeys("3308");
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		BST a1=new BST();
		a1.Opening_browser();
	}

}
