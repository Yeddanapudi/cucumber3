package Step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login1 {
WebDriver d=null;

ChromeOptions opt;
	@Given("Opening Browser")
	public void opening_browser() {
		WebDriverManager.chromedriver().setup();
		opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		d=new ChromeDriver(opt);
	}

	@When("user opening orangeHrm")
	public void user_opening_orange_hrm() {

	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	}

	@Then("^user specifies (.*) and (.*)$")
	public void user_specifies_admin_and_admin123(String userName,String Pwd) {
d.findElement(By.name("username")).sendKeys(userName);
d.findElement(By.name("password")).sendKeys(Pwd);

		
	}

	@And("user  click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
	
	d.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	d.close();
	
	}
	
	
	
	

}
