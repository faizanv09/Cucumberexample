package com.iowa.stepdefinition;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class EE_PositionDataElementCreation_RM extends BaseClassIowa {
	public static WebDriver driver = RunnerIowa.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(EE_PositionDataElementCreation_RM.class);
	
	
	@When("^user choose position file from select report drop down$")
	public void user_choose_position_file_from_select_report_drop_down() throws Throwable {
	   
		log.debug("user selecting position from select report dropdown");
		waitforvisibilityofelement(pom.getDSD().getAddButton());
		clickOnElement(pom.getPDEC().getClickPosition());
		waitforvisibilityofelement(pom.getPDEC().getClickPosition());
		log.info("user successfully selected position file from select report option");
	    
	}

	@When("^user click on \\+ button to create data element for position file$")
	public void user_click_on_button_to_create_data_element_for_position_file() throws Throwable {
	    
		log.debug("user clicking on + add button");
		clickOnElement(pom.getDSD().getAddButton());
		log.info("user clicked add button and popup box displayed");
	}

	@When("^user entering \"([^\"]*)\" in text field$")
	public void user_entering_in_text_field(String arg1) throws Throwable {
	   
		log.debug("user entering Data Element title  in text field");
		inputOnElement(pom.getPDEC().getEnterDataElementTitle(), arg1);
		log.info("user successfully entered data element tiltle of comcollege");
	    
	}

	@When("^user entering \"([^\"]*)\" value in text field$")
	public void user_entering_value_in_text_field(String arg1) throws Throwable {
	   
		log.debug("user entering warning threshold value in text field");
		inputOnElement(pom.getPDEC().getEnterThreShold(), arg1);
		log.info("user successfully entered threshold vale of data element");
	    
	}

	@When("^user select \"([^\"]*)\" from drop down$")
	public void user_select_from_drop_down(String arg1) throws Throwable {
	    
		log.debug("user selecting data type from drop down menu");
		Select s = new Select(pom.getPDEC().getSelectDataType());
		List<WebElement> DataTypes = s.getOptions();
		for (WebElement DataType : DataTypes) {
			if (DataType.getText().equals(arg1)) {
				DataType.click();
			}

		}
		log.info("user successfully selected data type from drop down menu");
	    
	}

	@When("^user entering \"([^\"]*)\" of Data element we given$")
	public void user_entering_of_Data_element_we_given(String arg1) throws Throwable {
	    
		log.debug("user entering max length of data element");
		inputOnElement(pom.getPDEC().getEnterMaxLength(), arg1);
		log.info("user entered max length of data element");

	    
	}
	
	@When("^user entering \"([^\"]*)\"$")
	public void user_entering(String arg1) throws Throwable {
		
		log.debug("user entering data element description in text field");
		inputOnElement(pom.getPDEC().getEnterDataElementDescription(), arg1);
		log.info("user successfully entered data element description");

	}



	@Then("^user click on Add button in popup data elemnt creation popup window$")
	public void user_click_on_Add_button_in_popup_data_elemnt_creation_popup_window() throws Throwable {
	  
		log.debug("user clicking on add button in popup window for completing data element creation");
		clickOnElement(pom.getPDEC().getClickAdd());
		clickOnElement(pom.getPDEC().getClickCancel());
		log.info("user successfully created dataelement by clicked on  add button");
		Thread.sleep(9000);
	    
	}



}
