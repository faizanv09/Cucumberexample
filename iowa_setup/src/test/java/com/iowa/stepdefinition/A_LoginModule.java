package com.iowa.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.FileReaderManager;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class A_LoginModule extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	private static Logger log = LogManager.getLogger(A_LoginModule.class.getName());

	@Given("^Enter the Url to navigate webpage$")
	public void enter_the_Url_to_navigate_webpage() throws Throwable {

		log.debug("navigate to the url page");
		String url = FileReaderManager.getInstance().getcrInstance().getUrl();
		getUrl(url);
		log.info("successfuly entered into login page");

	}

	@When("^User enter the email \"([^\"]*)\"$")
	public void user_enter_the_email(String arg1) throws Throwable {

		log.debug("user entering the valid email credential");
		waitforvisibilityofelement(pom.getLM().getUsername());
		inputOnElement(pom.getLM().getUsername(), arg1);
		log.info("user successfully entered email details");
	}

	@And("^User enter the \"([^\"]*)\"$")
	public void user_enter_the(String arg1) throws Throwable {

		log.debug("user enter the valid password into textfield");
		inputOnElement(pom.getLM().getPassword(), arg1);
		log.info("user entered the password  successfully");
	}

	@And("^user enter the valid captcha$")
	public void user_enter_the_valid_captcha() throws Throwable {

		log.debug("user enter the text which is displayed in captcha field");
		clickOnElement(pom.getLM().getCaptcha());
		Thread.sleep(9000);
		log.info("captcha textfield entered successfully");

	}

	@And("^User click the Login button$")
	public void user_click_the_Login_button() throws Throwable {

		log.debug("user clicking on the login button");
		clickOnElement(pom.getLM().getLogin());
		log.info("login button clicked successfully");
	}

	@Then("^validate user enter into the Home page of Iowa\"([^\"]*)\"$")
	public void validate_user_enter_into_the_Home_page_of_Iowa(String arg1) throws Throwable {

		log.debug("validating successfull entry into home page");
		waitforvisibilityofelement(pom.getLM().getValidateLoginModule());
		log.info("user validating the Home text displaying in left corner of Homepage:" + "   "
				+ pom.getLM().getValidateLoginModule().getText());
		log.info("user successfully entered into the homepage");

	}
}
