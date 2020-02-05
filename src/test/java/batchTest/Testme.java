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
	@Given("Admin navigated to login page")
	public void admin_navigated_to_login_page() {
		driver=Drivers.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		LoginPage lp=new LoginPage(driver);
		lp.signin.click();
		
	}
	@When("Admin enters username and password")
	public void admin_enters_username_and_password() {
		LoginPage.userName.sendKeys("admin");
		LoginPage.Password.sendKeys("Password456");
	}
	@Then("Admin logged in successfully")
	public void admin_logged_in_successfully() {
		driver.findElement(By .name("Login")).click();
		
	}
	@Given("admin adds category")
	public void admin_adds_category() {
		driver.findElement(By .name("Add Category")).click();
//		driver.findElement(By .xpath("//h4[text()='Add Category']")).click();
		driver.findElement(By .id("catgName")).sendKeys("sports");
		driver.findElement(By .id("catgDesc")).sendKeys("outdoor");
		driver.findElement(By .name("btn btn-lg btn-success btn-block")).click();
		driver.findElement(By .linkText("Home")).click();
		
	}
	@When("admin is able to add category")
	public void admin_is_able_to_add_category() {
	
	}
	@Then("admin adds subcategory")
	public void admin_adds_subcategory() {
		//driver.findElement(By .linkText("Home")).click();
		driver.findElement(By .name("btn btn-nav")).click();
		driver.findElement(By .id("subCatgId")).sendKeys("sports");
		driver.findElement(By .id("subCatgName")).sendKeys("Basketball");
		driver.findElement(By .id("subCatgDesc")).sendKeys("abc");
		driver.findElement(By .name("btn btn-lg btn-success btn-block")).click();
		driver.findElement(By .id("subCatgId")).sendKeys("sports");
		driver.findElement(By .id("subCatgName")).sendKeys("Volleyball");
		driver.findElement(By .id("subCatgDesc")).sendKeys("xyz");
		driver.findElement(By .name("btn btn-lg btn-success btn-block")).click();
		
	}

}
