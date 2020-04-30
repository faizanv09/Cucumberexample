package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagement_MD {
	public static WebDriver driver;

	@FindBy(xpath = ("//a[contains(text(),'Master Data')]"))
	private WebElement MasterData;

	@FindBy(xpath = ("//a[contains(text(),'User Management')]"))
	private WebElement UserManagement;

	@FindBy(xpath = ("//a[@class='btn-add']"))
	private WebElement AddButton;

	@FindBy(xpath = ("//select[@id='roleId']"))
	private WebElement roleId;

	@FindBy(xpath = ("//input[@id='emailId']"))
	private WebElement EmailId;

	@FindBy(xpath = ("//input[@id='firstName']"))
	private WebElement firstname;

	@FindBy(xpath = ("//input[@id='lastName']"))
	private WebElement lastname;

	@FindBy(xpath = ("//input[@id='workPhone']"))
	private WebElement workphone;

	@FindBy(id = ("college"))
	private WebElement SelectCollege;

	@FindBy(xpath = ("//button[@class='btn btn-blue btn-sm']\r\n"))
	private WebElement clickadd;

	@FindBy(xpath = ("//button[contains(text(),'Cancel')]"))
	private WebElement clickcancel;
	
	@FindBy(xpath=("//td[contains(text(),' Maha Lakshmi ')]"))
	private WebElement validateAccCreation;

	public UserManagement_MD(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getMasterData() {
		return MasterData;
	}

	public WebElement getUserManagement() {
		return UserManagement;
	}

	public WebElement getAddButton() {
		return AddButton;
	}
	public WebElement getValidateAccCreation() {
		return validateAccCreation;
	}
	public WebElement getRoleId() {
		return roleId;
	}

	public WebElement getEmailId() {
		return EmailId;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getWorkphone() {
		return workphone;
	}

	public WebElement getSelectCollege() {
		return SelectCollege;
	}

	public WebElement getClickadd() {
		return clickadd;
	}

	public WebElement getClickcancel() {
		return clickcancel;
	}

}
