package com.iowa.stepdefinition;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EE_EmployeeDataElementCreation_RM extends BaseClassIowa {

	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(EE_EmployeeDataElementCreation_RM.class);

	@When("^user choose employee report from select report drop down$")
	public void user_choose_employee_report_from_select_report_drop_down() throws Throwable {

		log.debug("user selecting employee from select report dropdown");
		waitforvisibilityofelement(pom.getDSD().getAddButton());
		clickOnElement(pom.getEDEC().getClickEmployee());
		waitforvisibilityofelement(pom.getEDEC().getClickEmployee());
		log.info("user successfully selected employee file from select report option");
	}

	@When("^user click on \\+ button to add new data element in employee grid$")
	public void user_click_on_button_to_add_new_data_element_in_employee_grid() throws Throwable {

		log.debug("user clicking on + add button");
		clickOnElement(pom.getDSD().getAddButton());
		log.info("user clicked add button and popup box displayed");
	}

	@When("^user entering data element title \"([^\"]*)\"$")
	public void user_entering_data_element_title(String arg1) throws Throwable {

		log.debug("user entering Data Element title  in text field");
		inputOnElement(pom.getEDEC().getEnterDataElementTitle(), arg1);
		log.info("user successfully entered data element tiltle of comcollege");
	}

	@When("^user entering warning threshold \"([^\"]*)\"$")
	public void user_entering_warning_threshold(String arg1) throws Throwable {

		log.debug("user entering warning threshold value in text field");
		inputOnElement(pom.getEDEC().getEnterThreShold(), arg1);
		log.info("user successfully entered threshold vale of data element");
	}

	@When("^User choosing data type from drop down\"([^\"]*)\"$")
	public void user_choosing_data_type_from_drop_down(String arg1) throws Throwable {

		log.debug("user selecting data type from drop down menu");
		Select s = new Select(pom.getEDEC().getSelectDataType());
		List<WebElement> DataTypes = s.getOptions();
		for (WebElement DataType : DataTypes) {
			if (DataType.getText().equals(arg1)) {
				DataType.click();
			}

		}
		log.info("user successfully selected data type from drop down menu");
	}

	@When("^user entering max length of allowed of data element \"([^\"]*)\"$")
	public void user_entering_max_length_of_allowed_of_data_element(String arg1) throws Throwable {

		log.debug("user entering max length of data element");
		inputOnElement(pom.getEDEC().getEnterMaxLength(), arg1);
		log.info("user entered max length of data element");

	}

	@When("^user entering data element description \"([^\"]*)\"$")
	public void user_entering_data_element_description(String arg1) throws Throwable {

		log.debug("user entering data element description in text field");
		inputOnElement(pom.getEDEC().getEnterDataElementDescription(), arg1);
		log.info("user successfully entered data element description");

	}

	@Then("^User click on add button$")
	public void user_click_on_add_button() throws Throwable {

		log.debug("user clicking on add button in popup window for completing data element creation");
		clickOnElement(pom.getEDEC().getClickAdd());
		clickOnElement(pom.getEDEC().getClickCancel());
		log.info("user successfully created dataelement by clicked on  add button");
		Thread.sleep(9000);
	}
}
