package com.iowa.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.*;

public class E_RuleByDataElement_RM extends BaseClassIowa{
	
	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = LogManager.getLogger(E_RuleByDataElement_RM.class);
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    
	  log.info("user is on home page");  
	}
	
	@When("^user click on master data$")
	public void user_click_on_master_data() throws Throwable {
		
		log.debug("user clicking on Master Data module");
		Thread.sleep(9000);
		waitforclicktoelement(pom.getUM().getMasterData()); 
		clickOnElement(pom.getUM().getMasterData());
		log.info("user successfully clicked on master data ");
	}

	@When("^user click on rule under master data$")
	public void user_click_on_rule_under_master_data() throws Throwable {
		
		log.debug("user clicking on rule option which is displaying under Master Data");
		waitforclicktoelement(pom.getRBF().getClickRule());
		clickOnElement(pom.getRBF().getClickRule());
		log.info("user successfully clicked on rule ");
	    
	}

	@When("^user click on Rules By Data Element under Master data$")
	public void user_click_on_Rules_By_Data_Element_under_Master_data() throws Throwable {
	    
		log.debug("user clicking on rules by data element under rule ");
		waitforclicktoelement(pom.getRBD().getClickRuleByDataElement());
		clickOnElement(pom.getRBD().getClickRuleByDataElement());
		log.info("user successfully clicked on RulesByDataElement ");
	    
	}

	@Then("^user click on select report drop down$")
	public void user_click_on_select_report_drop_down() throws Throwable {
	   
		log.debug("user clicking on select report dropdown to select employee report");
		waitforvisibilityofelement(pom.getRBD().getCommcollege());
		waitforclicktoelement(pom.getRBD().getSelectReport());
		clickOnElement(pom.getRBD().getSelectReport());
		log.info("user successfully clicked on select report dropdown");
		}
	
}
