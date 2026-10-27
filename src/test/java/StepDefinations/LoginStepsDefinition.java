package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition {
	
	public static WebDriver driver;
	
	@Given("User is on the login page of automationexcercise application")
	public void user_is_on_the_login_page_of_automationexcercise_application() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://automationexercise.com/");
	   driver.findElement(By.linkText("Signup / Login")).click();
	   
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("suchit@test.com");
		driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys("Suchit@123");
	    
	}
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
				driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys(string);
				driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys(string2);
	}

	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
	    
	}

	@Then("User should be navigated to the home page of automationexercise application")
	public void user_should_be_navigated_to_the_home_page_of_automationexercise_application() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loggedInUser = driver.findElement(By.cssSelector("a[href='/logout']"));
		loggedInUser.isDisplayed();
		
	    
	}
	
	@And("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
			    driver.quit();
	     
	}

}
