package Alert_Meeages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.dezlearn.com/multiple-browser-windows/");
		d.manage().window().maximize();

		String title=d.getTitle();
		System.out.println(title);
		
		String parent=d.getWindowHandle();
		System.out.println(parent);

		
		d.findElement(By.id("u_7_8")).click();
		
		Set<String>child=d.getWindowHandles();
		System.out.println(child);
	for(String handle:child)
		{
			if(!parent.equals(handle))
			{
				d.switchTo().window(handle);
			d.findElement(By.id("u_0_0_eK")).click();
Set<String>child1=d.getWindowHandles();
			System.out.println(child1);
	for(String winid : child1)
			{
				String  t1= d.switchTo().window(winid).getTitle();
				if(title.equals("Dezlearn"))
				{
					d.close();					
				}
	
	}
	}
		}
	}
}

			
	