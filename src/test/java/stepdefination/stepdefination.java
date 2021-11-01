package stepdefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdefination {
	public WebDriver driver;

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		 driver = new ChromeDriver();  
    }
    @And("^Naviagate to \"([^\"]*)\" site$")
    public void naviagate_to_something_site(String strArg1) throws Throwable {
     driver.get(strArg1);  
    }

    @And("^Click on login to home page to land on secure sign in page$")
    public void click_on_login_to_home_page_to_land_on_secure_sign_in_page() throws Throwable {
    	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();  
    }

    @When("^user enteres (.+) and (.+) and logs in$")
    public void user_enteres_and_and_logs_in(String username, String password) throws Throwable {
    	driver.findElement(By.id("user_email")).sendKeys(username);
    	driver.findElement(By.id("user_password")).sendKeys(password);   
    }

    @Then("^Verify that user is succesfully signed in$")
    public void verify_that_user_is_succesfully_signed_in() throws Throwable {
       
    }

  

}
