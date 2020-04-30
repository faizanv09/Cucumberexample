package com.iowa.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeDataElementCreation_RM {

	public static WebDriver driver;

	@FindBy(xpath = ("//option[contains(text(),'Employee')]"))
	private WebElement clickEmployee;

	@FindBy(xpath = ("//input[@id='fieldName']"))
	private WebElement enterDataElementTitle;

	@FindBy(xpath = ("//input[@id='fieldThreshold']"))
	private WebElement EnterThreShold;

	@FindBy(xpath = ("//select[@id='dataType']"))
	private WebElement selectDataType;

	@FindBy(xpath = ("//input[@id='fieldLength']"))
	private WebElement enterMaxLength;

	@FindBy(xpath = ("//textarea[@name='fieldDescription']"))
	private WebElement enterDataElementDescription;

	@FindBy(xpath = ("//button[contains(text(),'Add')]"))
	private WebElement clickAdd;
	
	@FindBy(xpath=("//button[contains(text(),'Cancel')]"))
	private WebElement clickCancel;

	public EmployeeDataElementCreation_RM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickEmployee() {
		return clickEmployee;
	}

	public WebElement getEnterDataElementTitle() {
		return enterDataElementTitle;
	}

	public WebElement getEnterThreShold() {
		return EnterThreShold;
	}

	public WebElement getSelectDataType() {
		return selectDataType;
	}

	public WebElement getEnterMaxLength() {
		return enterMaxLength;
	}

	public WebElement getEnterDataElementDescription() {
		return enterDataElementDescription;
	}

	public WebElement getClickAdd() {
		return clickAdd;
	}
	public WebElement getClickCancel() {
		return clickCancel;
	}
}
