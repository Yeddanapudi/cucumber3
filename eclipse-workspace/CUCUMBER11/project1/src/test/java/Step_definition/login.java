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

public class login {
WebDriver d=null; 
ChromeOptions opt;
	@Given("user is in amazon page")
	public void user_is_in_amazon_page() {
		 WebDriverManager.chromedriver().setup();
		 opt=new ChromeOptions();
		 opt.addArguments("--remote-allow-origins=*");

		 		d=new ChromeDriver(opt);
		 		d.get("https://www.amazon.com/");
		 		d.manage().window().maximize();
		 		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 		
	}

	@When("user selected Books from dropdown box")
	public void user_selected_books_from_dropdown_box() {
	d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	
	
	
	}
	
	

	@Then("user types harry porter on the edit box")
	public void user_types_harry_porter_on_the_edit_box() {
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("harry porter");
	
	}

	@And("user click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {

		d.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000);
	d.close();
	
	
	}


}
