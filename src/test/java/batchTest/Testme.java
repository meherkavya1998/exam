package batchTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import demo.Drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Testme {
	WebDriver driver;
	@Given("User navigated to login page")
	public void user_navigated_to_login_page() {
		driver=Drivers.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		LoginPage lp=new LoginPage(driver);
		lp.signin.click();
		
		
		
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() {
		LoginPage.userName.sendKeys("Lalitha");
		LoginPage.Password.sendKeys("password123");
	}
	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
		driver.findElement(By .name("Login")).click();
		
	}

}
