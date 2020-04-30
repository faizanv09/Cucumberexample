package com.iowa.stepdefinition;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class D_RuleByFile_RM extends BaseClassIowa {
	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(D_RuleByFile_RM.class);

	@Given("^User is on Home page$")
	public void user_is_on_Home_page() throws Throwable {

		log.info("user is on Home page");
	}

	@When("^user click on master data module$")
	public void user_click_on_master_data_module() throws Throwable {

		log.debug("user clicking on Master Data module");
		Thread.sleep(9000);
		clickOnElement(pom.getUM().getMasterData());
		log.info("user successfully clicked on master data ");

	}

	@When("^user click rule under master data module$")
	public void user_click_rule_under_master_data_module() throws Throwable {

		log.debug("user clicking on rule option which is displaying under Master Data");
		clickOnElement(pom.getRBF().getClickRule());
		log.info("user successfully clicked on rule ");

	}

	@When("^user click on rule and choose rulesbyfile module$")
	public void user_click_on_rule_and_choose_rulesbyfile_module() throws Throwable {

		log.debug("user clicking on rulebyfile option under rule ");
		waitforclicktoelement(pom.getRBF().getClickRulesByFile());
		clickOnElement(pom.getRBF().getClickRulesByFile());
		log.info("user successfully clicked on RulesByFile Field");
	}

	@When("^user verifying that Hash sign, File Name, Actions are present in RuleByFile page$")
	public void user_verifying_that_Hash_sign_File_Name_Actions_are_present_in_RuleByFile_page() throws Throwable {

		log.debug("user verifying that header fields of RulesByField by getting text");
		 waitforvisibilityofelement(pom.getRBF().getClickview());
		log.info("user successfully verified that headersfields display under RulesByField by printing that in console:"
				+ "=============HeaderFields===========");

		for (WebElement tablehead : pom.getRBF().getTableHead()) {
			log.info(tablehead.getText());
		}

	}

	@When("^user verifying that rule numbers are displaying under HashSign field$")
	public void user_verifying_that_rule_numbers_are_displaying_under_HashSign_field() throws Throwable {

		log.debug("user verifying  rule numbers display under HashSign by getting text");
		log.info("user successfully verified rule numbers display under hashsign by printing that in console:" + "  "
				+ "============ # Field ==============");
		for (WebElement HashSign : pom.getRBF().getHashSignField()) {
			log.info(HashSign.getText());
		}

	}

	@When("^user verifying that file names are displaying under FileName field$")
	public void user_verifying_that_file_names_are_displaying_under_FileName_field() throws Throwable {

		log.debug("user verifying file names display under filename field by getting text");
		log.info("user successfully verified file names display under filename field by printing that in console:"
				+ "  " + "============ FileName Field ============");
		for (WebElement FileName : pom.getRBF().getFileNameField()) {
			log.info(FileName.getText());
		}
	}

	@When("^user verifying that View and download options are present under Actions field$")
	public void user_verifying_that_View_and_download_options_are_present_under_Actions_field() throws Throwable {

		log.debug("user verifying view and download option display under Action field by taking screenshot");
		screenshotForParticularElement();

		log.info(
				"user successfuly verified view n download optiond disply under ActionField by taking particular element screenshot:"
						+ " ===============Screenshot in view nd download name under project==========");
	}

	@When("^user click on view option$")
	public void user_click_on_view_option() throws Throwable {

		log.debug("user clicking on view option under Actions Field");
		clickOnElement(pom.getRBF().getClickview());
		log.info("user successfully clicked on view option");

	}

	@When("^user verifying that internal integrity displaying in popup box opened when clicked on view$")
	public void user_verifying_that_internal_integrity_displaying_in_popup_box_opened_when_clicked_on_view()
			throws Throwable {
		waitforvisibilityofelement(pom.getRBF().getInternalIntegrity());
		log.debug("user verifying that internal Integrity disply in popupBox which is opened clicking on view button");
		log.info("user successfully verified Internal Integrity display by taking text:"+"  "+pom.getRBF().getInternalIntegrity().getText());
	}

	@When("^user verifying that Data Element title, Data element Description, Error Description,Warning Description,Type of Error options are displaying under internal integrity field$")
	public void user_verifying_that_Data_Element_title_Data_element_Description_Error_Description_Warning_Description_Type_of_Error_options_are_displaying_under_internal_integrity_field()
			throws Throwable {
		
		log.debug("user verifying that HeaderField of Internal Integrity");
		log.info("user sucessfully verified that HeaderField of Internal Integrity display by getting text");
		for (WebElement IIFields : pom.getRBF().getIIFields()) {
			log.info("\n"+IIFields.getText() +"\n");
			
		}

	}

	@When("^user click on Referential Integrity which is displayed in popup box while click on view button$")
	public void user_click_on_Referential_Integrity_which_is_displayed_in_popup_box_while_click_on_view_button()
			throws Throwable {
		
		log.debug("user clicking on Referential Integrity(RI) which is next to Internal Integrity");
		clickOnElement(pom.getRBF().getReferentialIntegrity());
		log.info("user successfully clicked on Referential Integrity:"+"  " +pom.getRBF().getReferentialIntegrity().getText());

	}

	@When("^user verifying that RuleName,Error description,Warning Description,Type of error fields displayed under Referential Integrity$")
	public void user_verifying_that_RuleName_Error_description_Warning_Description_Type_of_error_fields_displayed_under_Referential_Integrity()
			throws Throwable {
		
		log.debug("user verifying that HeaderFields of Referential Integrity ");
		log.info("user successfully verified that HeaderFields of RI by getting text");
		for (WebElement RIFields : pom.getRBF().getRIFields()) {
			log.info("\n" +RIFields.getText() +"\n " );
			
		}

	}

	@When("^user click on cancel button$")
	public void user_click_on_cancel_button() throws Throwable {
		
		log.debug("user clicking on cancel button");
		clickOnElement(pom.getRBF().getClickCancel());
		log.info("user Successfully clicked on cancel button");

	}

	@Then("^click on download button and verify downloading corressponding file$")
	public void click_on_download_button_and_verify_downloading_corressponding_file() throws Throwable {
		
		log.info("user click on download button");
		clickOnElement(pom.getRBF().getClickDownload());
		Thread.sleep(9000);
		log.info("user successfully clicked on download button and verifying downloaded file corresponding to specific filename");
	}
	
	

}
