package com.iowa.helper;

import org.openqa.selenium.WebDriver;

import com.iowa.pom.DataSubmissionDeadline_MD;
import com.iowa.pom.EmployeeDataElementCreation_RM;
import com.iowa.pom.RuleByDataElement_RM;
import com.iowa.pom.LoginModule;
import com.iowa.pom.PositionDataElementCreation_RM;
import com.iowa.pom.RuleByFile_RM;
import com.iowa.pom.UserManagement_MD;
import com.iowa.stepdefinition.E_RuleByDataElement_RM;

public class PageObjectManager {

	public static WebDriver driver;

	private LoginModule LM;
	private UserManagement_MD UM;
	private DataSubmissionDeadline_MD DSD;
	private RuleByFile_RM RBF;
	private RuleByDataElement_RM RBD;
	private EmployeeDataElementCreation_RM EDEC;
	private PositionDataElementCreation_RM PDEC;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;

	}

	public LoginModule getLM() {
		LM = new LoginModule(driver);
		return LM;
	}

	public UserManagement_MD getUM() {
		UM = new UserManagement_MD(driver);
		return UM;

	}

	public DataSubmissionDeadline_MD getDSD() {
		DSD = new DataSubmissionDeadline_MD(driver);
		return DSD;
	}

	public RuleByFile_RM getRBF() {
		RBF = new RuleByFile_RM(driver);
		return RBF;
	}
	
	public RuleByDataElement_RM getRBD() {
		RBD = new RuleByDataElement_RM(driver);
		return RBD;
		
	}
	
	public EmployeeDataElementCreation_RM getEDEC() {
		EDEC = new EmployeeDataElementCreation_RM(driver);
		return EDEC;
		
	}
	
	public PositionDataElementCreation_RM getPDEC() {
		PDEC = new PositionDataElementCreation_RM(driver);
		return PDEC;
	}
}
