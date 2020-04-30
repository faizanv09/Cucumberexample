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

public class C_DataSubmissionDeadline_MD extends BaseClassIowa {
	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	private static Logger log = LogManager.getLogger(A_LoginModule.class.getName());

	@Given("^User is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {

		log.info("user is on Home Page");
	}

	@When("^user click on master data element$")
	public void user_click_on_master_data_element() throws Throwable {

		log.debug("user clicking on master data ");
		Thread.sleep(9000);
		clickOnElement(pom.getUM().getMasterData());
		log.info("user successfully clicked on master data ");
	}

	@When("^user click on data submission menu which is displayed under masterdata$")
	public void user_click_on_data_submission_menu_which_is_displayed_under_masterdata() throws Throwable {

		log.debug("user clicking on datasubmission menu");
		clickOnElement(pom.getDSD().getDataSubmissionDeadline());
		log.info("user successfully clicked on datasubmission menu");
	}

	@When("^user click on plus add button$")
	public void user_click_on_plus_add_button() throws Throwable {

		log.debug("user clicking on + add button");
		clickOnElement(pom.getDSD().getAddButton());
		log.info("user clicked add button and popup box displayed");

	}

	@When("^user select college from addperiod option which is popuped while clicking on add button$")
	public void user_select_college_from_addperiod_option_which_is_popuped_while_clicking_on_add_button()
			throws Throwable {

		log.debug("user clicking on select college option");
		clickOnElement(pom.getDSD().getSelectcollege());
		waitforclicktoelement(pom.getDSD().getscrolldown());
		scroll(pom.getDSD().getscrolldown());
		clickOnElement(pom.getDSD().getClickcollege());
		log.info("user selected college successfully");
	}

	@When("^user entering the period$")
	public void user_entering_the_period() throws Throwable {

		log.debug("user entering period in textfield");
		clickOnElement(pom.getDSD().getSelectperiod());
		inputOnElement(pom.getDSD().getSelectperiod(), "QATest");
		log.info("user successfullly entered period in textfield");
	}

	@When("^user select the start date from calender$")
	public void user_select_the_start_date_from_calender() throws Throwable {

		log.debug("user selecting start date and month from add period column");
		clickOnElement(pom.getDSD().getClickstartdate());
		clickOnElement(pom.getDSD().getclickSelectmonth());
		clickOnElement(pom.getDSD().getChoosestartmonth());
		log.info("user selected start month successfully");
		clickOnElement(pom.getDSD().getChoosestartdate());
		log.info("user successfully selected date");
	}

	@When("^user select the end date from calender$")
	public void user_select_the_end_date_from_calender() throws Throwable {

		log.debug("user selecting end date and month from add period column");
		clickOnElement(pom.getDSD().getClickenddate());
		clickOnElement(pom.getDSD().getclickSelectendmonth());
		clickOnElement(pom.getDSD().getChooseendmonth());
		log.info("user successfully selected endmonth");
		clickOnElement(pom.getDSD().getChooseenddate());
		log.info("user succeffully selected end date");
	}

	@When("^user choose the files to be submitted by clicking on checkboxes$")
	public void user_choose_the_files_to_be_submitted_by_clicking_on_checkboxes() throws Throwable {

		log.debug("user chossing files to be submitted");
		clickOnElement(pom.getDSD().getSelectfiles());
		clickOnElement(pom.getDSD().getClickcourse());
		clickOnElement(pom.getDSD().getClickstudent());
		clickOnElement(pom.getDSD().getClickawards());
		clickOnElement(pom.getDSD().getClickNCcourse());
		clickOnElement(pom.getDSD().getClickNCstudent());
		clickOnElement(pom.getDSD().getClickNCawards());
		log.info("user successfully done with file choosen");
	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws Throwable {

		log.debug("user clicking on Add button ");
		clickOnElement(pom.getDSD().getClickAdd());
		Thread.sleep(5000);
		log.info("User successfully clicked on add button");
	}

	@When("^user validate data submission period updated successfully$")
	public void user_validate_data_submission_period_updated_successfully() throws Throwable {

		log.debug("user validating added college displying in datasubmission grid");
		waitforvisibilityofelement(pom.getDSD().getValidateAddPeriod());
		log.info("user validated successful submission of deadline by getting college name from grid:" + "  "
				+ pom.getDSD().getValidateAddPeriod().getText());

	}

	@When("^user click on plus add button again to change reporting period$")
	public void user_click_on_plus_add_button_again_to_change_reporting_period() throws Throwable {

		log.debug("user clicking on plus add button again to change reporting period");
		waitforvisibilityofelement(pom.getDSD().getAddButton());
		clickOnElement(pom.getDSD().getAddButton());
		log.info("user successfully clicked on plus add button ");
	}

	@When("^user switch to reporting year column$")
	public void user_switch_to_reporting_year_column() throws Throwable {

		log.debug("user switch to reporting period column in popup box");
		clickOnElement(pom.getDSD().getReportingperiod());
		log.info("user successfully switch to reporting period column");
	}

	@When("^user choose  start date from calender$")
	public void user_choose_start_date_from_calender() throws Throwable {

		log.debug("user choosing start date from calender");
		clickOnElement(pom.getDSD().getPeriodstartdate());
		clickOnElement(pom.getDSD().getClickPeriodStartMonth());
		clickOnElement(pom.getDSD().getChoosePeriodStartMon());
		clickOnElement(pom.getDSD().getChoosePeriodStartDate());
		log.info("user successfully entered start data and month");
	}

	@When("^user chosse end date from calender$")
	public void user_chosse_end_date_from_calender() throws Throwable {

		log.debug("user choosing end date from calender");
		clickOnElement(pom.getDSD().getPeriodenddate());
		clickOnElement(pom.getDSD().getClickperiodEndmonth());
		clickOnElement(pom.getDSD().getChoosePeriodEndMonth());
		clickOnElement(pom.getDSD().getChoosePeriodEndDate());
		log.info("user successfully entered end data and month");

	}

	@When("^user click on change button$")
	public void user_click_on_change_button() throws Throwable {

		log.debug("user clicking on change button");
		clickOnElement(pom.getDSD().getClickchange());
		log.info("user successfully clicked on change button");
	}

	@When("^user click on update button$")
	public void user_click_on_update_button() throws Throwable {

		log.debug("user clicking on update button ");
		clickOnElement(pom.getDSD().getClickupdate());
		log.info("user successfully clicked update button");
		clickOnElement(pom.getDSD().getClickchangeit());
		log.info("user clicked on change it button in popup box which is displayed while click on update button");
	}

	@Then("^validate reporting period displayed in data submission deadline grid$")
	public void validate_reporting_period_displayed_in_data_submission_deadline_grid() throws Throwable {

		log.debug("user validating whether reporing year updated successfully");
		waitforvisibilityofelement(pom.getDSD().getCheckreportyear());
		log.info("user validated reporting year updation by getting year which is displayed top left corner in grid:"
				+ "  " + pom.getDSD().getCheckreportyear().getText());
	}

}