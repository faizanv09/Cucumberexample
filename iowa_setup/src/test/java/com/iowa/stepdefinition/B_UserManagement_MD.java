package com.iowa.stepdefinition;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class B_UserManagement_MD extends BaseClassIowa {
	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	private static Logger log = LogManager.getLogger(A_LoginModule.class.getName());

	@Given("^check user is on home page$")
	public void check_user_is_on_home_page() throws Throwable {

		log.info("user is on home page");
	}

	@When("^user serach and click on master data element$")
	public void user_serach_and_click_on_master_data_element() throws Throwable {

		log.debug("user clicking on master data ");
		Thread.sleep(9000);
		clickOnElement(pom.getUM().getMasterData());
		log.info("user successfully clicked on master data ");
	}

	@When("^user click on user management menu$")
	public void user_click_on_user_management_menu() throws Throwable {

		log.debug("user clicking on user managenent under master data menu");
		clickOnElement(pom.getUM().getUserManagement());
		log.info("user successfully clicked on user management menu");
	}

	@When("^user click on add user button$")
	public void user_click_on_add_user_button() throws Throwable {

		log.debug("user click on add user button");
		waitforclicktoelement(pom.getUM().getAddButton());
		clickOnElement(pom.getUM().getAddButton());
		log.info("user successfully clicked on add user button");
	}

	@When("^user select menu from dropdown$")
	public void user_select_menu_from_dropdown() throws Throwable {

		log.debug("user selecting the roleid from dropdown menu");
		waitforclicktoelement(pom.getUM().getRoleId());
		Select s = new Select(pom.getUM().getRoleId());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		s.selectByVisibleText("College Admin");
		log.info("user successfully selected roleid ");
	}

	@When("^user enter valid mailid$")
	public void user_enter_valid_mailid() throws Throwable {

		log.debug("user entering valid email id");
		inputOnElement(pom.getUM().getEmailId(), "mahalakshmiu51@gmail.com");
		log.info("user successfully entered email id");
	}

	@When("^user enter firstname$")
	public void user_enter_firstname() throws Throwable {

		log.debug("user entering first name");
		inputOnElement(pom.getUM().getFirstname(), "Maha");
		log.info("user entered first name successfully");
	}

	@When("^user enter lastnames$")
	public void user_enter_lastnames() throws Throwable {

		log.debug("user entering last name");
		inputOnElement(pom.getUM().getLastname(), "Lakshmi");
		log.info("user entered last name successfuly");
	}

	@When("^user enter mobile no in work column$")
	public void user_enter_mobile_no_in_work_column() throws Throwable {

		log.debug("user entering mobile no");
		inputOnElement(pom.getUM().getWorkphone(), "9597074778");
		log.info("user entered mobile no successfully");
	}

	@When("^user select college from dropdown menu$")
	public void user_select_college_from_dropdown_menu() throws Throwable {

		log.debug("user select the college from dropdown menu");
		clickOnElement(pom.getUM().getSelectCollege());
		Select s1 = new Select(pom.getUM().getSelectCollege());
		s1.selectByVisibleText("15 - Indian Hills Community College");
		log.info("user successfully selected college from menu");
	}

	@When("^click add button$")
	public void click_add_button() throws Throwable {

		log.debug("user clicking on add button");
		clickOnElement(pom.getUM().getClickadd());
		log.info("user successfully clicked add button");
	}

	@Then("^verify user created account successfully$")
	public void verify_user_created_account_successfully() throws Throwable {

		log.debug("user validating successfull account creation");
		clickOnElement(pom.getUM().getClickcancel());
		log.info("validating the user name displaying in usermanagement grid:" + "  "
				+ pom.getUM().getValidateAccCreation().getText());
		log.info("user successfully created account");
	}

}
