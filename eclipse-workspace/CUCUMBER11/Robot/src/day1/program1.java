package day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class program1 {
	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
System.out.println(" first page links");
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	       WebDriver driver =new ChromeDriver();
	       driver.get("https://www.dezlearn.com/courses/"); ;
	       driver.manage().window().maximize();
	       List<WebElement>link=driver.findElements(By.xpath("//span[@class='elementor-cta__button elementor-button elementor-size-sm']"));
	      System.out.println(link.size()); 
for(int i=0;i<link.size();i++)
{
	System.out.println(link.get(i).getText());
	link.get(i).click();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl()); 
	driver.navigate().back();
link=driver.findElements(By.xpath("//span[@class='elementor-cta__button elementor-button elementor-size-sm']"));
	
}
System.out.println("-----------------certification page links----------------");

driver.findElement(By.xpath("//*[@id=\"menu-item-10433\"]")).click();
	List<WebElement>links=driver.findElements(By.xpath("//span[@class='elementor-cta__button elementor-button elementor-size-sm']"));
	System.out.println(links.size());
	for(int j=1;j<links.size();j++)
	{
		System.out.println(links.get(j).getText());
		links.get(j).click();
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("D://ap.png"));
	
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		links=driver.findElements(By.xpath("//span[@class='elementor-cta__button elementor-button elementor-size-sm']"));
		
	}
	driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/div/button")).click();
	
	
	}
}