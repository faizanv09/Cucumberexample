package com.iowa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataSubmissionDeadline_MD {
	public static WebDriver driver;

	@FindBy(xpath = ("//a[contains(text(),'Data Submission Deadline')]"))
	private WebElement DataSubmissionDeadline;

	@FindBy(xpath = ("//a[contains(text(),'+')]"))
	private WebElement AddButton;

	@FindBy(xpath = ("//span[contains(text(),'- -Select- -')]"))
	private WebElement selectcollege;

	@FindBy(xpath = ("(//span[contains(text(),'07-Hawkeye Community College')])[2]"))
	private WebElement scrolldown;

	@FindBy(xpath = ("(//li[@aria-label='15-Indian Hills Community College'])[2]"))
	private WebElement clickcollege;

	@FindBy(xpath = ("//input[@id='period']"))
	private WebElement selectperiod;

	@FindBy(xpath = ("//input[@name='startDateconfig']"))
	private WebElement clickstartdate;

	@FindBy(xpath = ("//button[contains(text(),'April')]"))
	private WebElement clickselectmonth;

	@FindBy(xpath = ("//button[contains(text(),'Mar')]"))
	private WebElement choosestartmonth;

	@FindBy(xpath = ("//button[contains(text(),'05')]"))
	private WebElement choosestartdate;

	@FindBy(xpath = ("//input[@name='endDate']"))
	private WebElement clickenddate;

	@FindBy(xpath = ("(//button[contains(text(),'April')])[1]"))
	private WebElement clickselectendmonth;

	@FindBy(xpath = ("//button[contains(text(),'May')]"))
	private WebElement chooseendmonth;

	@FindBy(xpath = ("(//button[contains(text(),'20')])[2]"))
	private WebElement chooseenddate;

	@FindBy(xpath = ("(//span[(@class='ui-multiselect-label ui-corner-all')])[2]"))
	private WebElement selectfiles;

	@FindBy(xpath = ("//span[contains(text(),'Course')]"))
	private WebElement clickcourse;

	@FindBy(xpath = ("//span[contains(text(),'Student')]"))
	private WebElement clickstudent;

	@FindBy(xpath = ("//span[contains(text(),'Awards')]"))
	private WebElement clickawards;

	@FindBy(xpath = ("//span[contains(text(),'NCCourse')]"))
	private WebElement clickNCcourse;

	@FindBy(xpath = ("//span[contains(text(),'NCStudent')]"))
	private WebElement clickNCstudent;

	@FindBy(xpath = ("//span[contains(text(),'NCAwards')]"))
	private WebElement clickNCawards;

	@FindBy(xpath = ("//button[contains(text(),'Add')]"))
	private WebElement clickAdd;

	@FindBy(xpath = ("//td[contains(text(),'15-Indian Hills Community College')]"))
	private WebElement validateAddPeriod;

	@FindBy(xpath = ("//span[contains(text(),'Reporting Year')]"))
	private WebElement reportingperiod;

	@FindBy(xpath = ("(//input[@name='startDate'])"))
	private WebElement periodstartdate;

	@FindBy(xpath = ("(//button[contains(text(),'April')])[3]"))
	private WebElement clickPeriodStartMonth;

	@FindBy(xpath = ("(//button[contains(text(),'Mar')])[1]"))
	private WebElement choosePeriodStartMon;

	@FindBy(xpath = ("(//button[contains(text(),'05')])[5]"))
	private WebElement choosePeriodStartDate;

	@FindBy(xpath = ("(//input[@name='endDate'])[2]"))
	private WebElement periodenddate;

	@FindBy(xpath = ("(//button[contains(text(),'April')])[3]"))
	private WebElement clickperiodEndmonth;

	@FindBy(xpath = ("//button[contains(text(),'May')]"))
	private WebElement choosePeriodEndMonth;

	@FindBy(xpath = ("(//button[contains(text(),'20')])[4]"))
	private WebElement choosePeriodEndDate;

	@FindBy(xpath = ("//button[contains(text(),'Change')]"))
	private WebElement clickchange;

	@FindBy(xpath = ("//button[contains(text(),'Update')]"))
	private WebElement clickupdate;

	@FindBy(xpath = ("//button[contains(text(),'Yes, change it')]"))
	private WebElement clickchangeit;

	@FindBy(xpath = ("//div[contains(text(),'AY 2020 - 2021')]"))
	private WebElement checkreportyear;

	public DataSubmissionDeadline_MD(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getDataSubmissionDeadline() {
		return DataSubmissionDeadline;
	}

	public WebElement getAddButton() {
		return AddButton;
	}

	public WebElement getSelectcollege() {
		return selectcollege;
	}

	public WebElement getscrolldown() {
		return scrolldown;
	}

	public WebElement getClickcollege() {
		return clickcollege;
	}

	public WebElement getSelectperiod() {
		return selectperiod;
	}

	public WebElement getClickstartdate() {
		return clickstartdate;
	}

	public WebElement getclickSelectmonth() {
		return clickselectmonth;
	}

	public WebElement getChoosestartmonth() {
		return choosestartmonth;
	}

	public WebElement getChoosestartdate() {
		return choosestartdate;
	}

	public WebElement getClickenddate() {
		return clickenddate;
	}

	public WebElement getclickSelectendmonth() {
		return clickselectendmonth;
	}

	public WebElement getChooseendmonth() {
		return chooseendmonth;
	}

	public WebElement getChooseenddate() {
		return chooseenddate;
	}

	public WebElement getSelectfiles() {
		return selectfiles;
	}

	public WebElement getClickcourse() {
		return clickcourse;
	}

	public WebElement getClickstudent() {
		return clickstudent;
	}

	public WebElement getClickawards() {
		return clickawards;
	}

	public WebElement getClickNCcourse() {
		return clickNCcourse;
	}

	public WebElement getClickNCstudent() {
		return clickNCstudent;
	}

	public WebElement getClickNCawards() {
		return clickNCawards;
	}

	public WebElement getClickAdd() {
		return clickAdd;
	}

	public WebElement getValidateAddPeriod() {
		return validateAddPeriod;
	}

	public WebElement getReportingperiod() {
		return reportingperiod;
	}

	public WebElement getPeriodstartdate() {
		return periodstartdate;
	}

	public WebElement getClickPeriodStartMonth() {
		return clickPeriodStartMonth;
	}

	public WebElement getChoosePeriodStartMon() {
		return choosePeriodStartMon;
	}

	public WebElement getChoosePeriodStartDate() {
		return choosePeriodStartDate;
	}

	public WebElement getPeriodenddate() {
		return periodenddate;
	}

	public WebElement getClickperiodEndmonth() {
		return clickperiodEndmonth;
	}

	public WebElement getChoosePeriodEndMonth() {
		return choosePeriodEndMonth;
	}

	public WebElement getChoosePeriodEndDate() {
		return choosePeriodEndDate;
	}

	public WebElement getClickchange() {
		return clickchange;
	}

	public WebElement getClickupdate() {
		return clickupdate;
	}

	public WebElement getClickchangeit() {
		return clickchangeit;
	}

	public WebElement getCheckreportyear() {
		return checkreportyear;
	}

}
