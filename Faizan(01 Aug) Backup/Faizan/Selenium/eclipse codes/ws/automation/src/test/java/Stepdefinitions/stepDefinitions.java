package Stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import cucumber.deps.com.thoughtworks.xstream.io.xml.Dom4JDriver;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class stepDefinitions {
	
	WebDriver driver;

    @Given("^An external and internal user needs to be added to a 3pm tenant$")
    public void an_external_and_internal_user_needs_to_be_added_to_a_3pm_tenant() throws Throwable {
    	
    	    System.setProperty("webdriver.chrome.driver","F:\\Faizan(01 Aug) Backup\\Faizan\\Selenium\\Gecko\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://rportalbuild.hiperos.com/");
			

          	
    	
    }

    @When("^A valid first name, last name, email and any required fields are entered into the add user page and save is clicked$")
    public void a_valid_first_name_last_name_email_and_any_required_fields_are_entered_into_the_add_user_page_and_save_is_clicked() throws Throwable {
        
    	driver.findElement(By.id("txtUsername")).sendKeys("faizan_mobius@coupa.com");
    	
    }

    @Then("^the new users are created, external users display under the supplier, can be viewed in the users grid, and appears with the same information when the edit user page is opened$")
    public void the_new_users_are_created_external_users_display_under_the_supplier_can_be_viewed_in_the_users_grid_and_appears_with_the_same_information_when_the_edit_user_page_is_opened() throws Throwable {
       
    	
    	
    }

}




