package DAY1;
import org.testng.annotations.Ignore;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

//@org.testng.annotations.Ignore 
public class Newtours {
	WebDriver d;
	String page = "https://demo.guru99.com/test/newtours/";

	@BeforeClass
	public void OBN_Page() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d = new ChromeDriver();

		d.get(page);
		Boolean img = d
				.findElement(
						By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img"))
				.isDisplayed();
		Assert.assertTrue(img);

		d.manage().window().maximize();
		d.findElement(By.xpath("//a[text()='REGISTER']")).click();
		Boolean img1 = d
				.findElement(
						By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img"))
				.isDisplayed();
		Assert.assertTrue(img1);
	}

	@Test(priority = -1, description = "url of the page")

	public void Url() {
		String acturl = d.getCurrentUrl();
		String expurl = "https://demo.guru99.com/test/newtours/register.php";
		Assert.assertEquals(acturl, expurl);

	}

	@Test(priority=2,description = "title of the page ",alwaysRun=true,dependsOnMethods= "Url",invocationCount=3)
	public void Title() {

		String title = d.getTitle();
		String exptitle = "Register: Mercury Tours";
		Assert.assertEquals(title, exptitle);
	}

	@Test(priority = 3, description = "country names")
	public void Dropdown() {
		d.findElement(By.name("country")).click();
		WebElement drop = d.findElement(By.name("country"));
		List<WebElement> drop1 = drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for (int i = 0; i < drop1.size(); i++) {
			System.out.println(drop1.get(i).getText());

		}
	}

	@Test(priority = 4, description = "screenshot for the current page ")

	public void Screenshot() throws IOException {

		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://ap1.png"));
	}

	@AfterClass
	public void Closing() {

		d.close();

	}

}
