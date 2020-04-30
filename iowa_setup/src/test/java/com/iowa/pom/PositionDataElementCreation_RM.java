package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PositionDataElementCreation_RM {
	
	public static WebDriver driver;
	
	@FindBy(xpath=("//option[contains(text(),'Position')]"))
	private WebElement clickPosition;
	
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
	
	public PositionDataElementCreation_RM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getClickPosition() {
		return clickPosition;
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
