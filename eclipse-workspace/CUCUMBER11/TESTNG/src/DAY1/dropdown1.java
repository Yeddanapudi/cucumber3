package DAY1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String page="https://www.amazon.com";

		 System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		 ChromeDriver d=new ChromeDriver();
		 d.get(page);
		 d.manage().window().maximize();
		// d.findElement(By.id("searchDropdownBox")).click();
		 WebElement drop=d.findElement(By.id("searchDropdownBox"));
		 List<WebElement>drop1=drop.findElements(By.tagName("option"));
		 System.out.println(drop1.size());
		 for(int i=0;i<drop1.size();i++)
		 {
		 	System.out.println(drop1.get(i).getText());
		 	
		 }

	}

}
