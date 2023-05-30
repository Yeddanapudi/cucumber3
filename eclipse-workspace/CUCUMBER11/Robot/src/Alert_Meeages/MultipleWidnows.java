package Alert_Meeages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWidnows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		// To open browser
		ChromeDriver driver=new ChromeDriver();
		// To maximize browser
		driver.manage().window().maximize();
		// To open Naukri website with multiple windows
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		// It will return the parent window name as a String
		String mainWindow=driver.getWindowHandle();
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='u_7_8']")).click();
		
		Set<String> set =driver.getWindowHandles();
		// Using Iterator to iterate with in windows
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			String childWindow=itr.next();
		   	// Compare whether the main windows is not equal to child window. If not equal, we will close.
			if(!mainWindow.equals(childWindow)){
			driver.switchTo().window(childWindow);
			//System.out.println(driver.switchTo().window(childWindow).getTitle());
	//	driver.close();
			String s=driver.switchTo().window(childWindow).getTitle();
			if(s.equals("Facebook – log in or sign up"))
			{
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
				
			}
			else
			{
				driver.close();
				
			}
			}
			
			
		}
		// This is to switch to the main window
		driver.switchTo().window(mainWindow);
		

	}
	}


	
	
	
