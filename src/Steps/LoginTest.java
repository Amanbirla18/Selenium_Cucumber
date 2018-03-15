package Steps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.sun.jna.platform.FileUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

	WebDriver driver;
	@Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver = new FirefoxDriver();
	   driver.get("https://www.facebook.com/");
	}
	   
	   


	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("email")).sendKeys("testeratibm1234@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Sunny@1234");
	    
	    //*[@class='_1vp5']
		
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("loginbutton")).click();
		String LoginValidation= driver.findElement(By.xpath(".//*[@class='_1vp5']")).getText();
		String Validationbyname = "Sunny";
		Assert.assertEquals(LoginValidation, Validationbyname);
		driver.close();
	}
	
		@When("^I enter valid username and Invalid password$")
		public void i_enter_valid_username_and_Invalid_password() throws Throwable {
			  driver.findElement(By.id("email")).sendKeys("testeratibm1234@gmail.com");
			  driver.findElement(By.id("pass")).sendKeys("tester@ibm121121");
			  driver.findElement(By.id("loginbutton")).click();
		}

		@Then("^user should not be able to login successfully$")
		public void user_should_not_be_able_to_login_successfully() throws Throwable {
		String actualmessage = driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div")).getText(); 
		String expectedmessage = "The password you’ve entered is incorrect. Forgot Password";
		Assert.assertEquals(actualmessage, expectedmessage);
		}

	    
	}



