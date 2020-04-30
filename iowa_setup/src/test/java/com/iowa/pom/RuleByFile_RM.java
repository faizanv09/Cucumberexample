package com.iowa.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class RuleByFile_RM {
	public static WebDriver driver;
	@FindBy(xpath = ("//a[contains(text(),'Rule')]"))
	private WebElement clickRule;

	@FindBy(xpath = ("//a[contains(text(),'Rules by File')]"))
	private WebElement clickRulesByFile;

	@FindBy(xpath = ("//table/thead/tr/th"))
	private List<WebElement> tableHead;

	@FindBy(xpath = ("//tr//td[1]"))
	private List<WebElement> HashSignField;

	@FindBy(xpath = ("//table/tbody/tr/td[2]"))
	private List<WebElement> FileNameField;

	@FindBy(xpath = ("//table/tbody/tr/td[3]"))
	private List<WebElement> ActionsField;

	@FindBy(xpath = ("(//i[@title='View'])[1]"))
	private WebElement clickview;

	@FindBy(xpath = ("//span[contains(text(),'Internal Integrity')]"))
	private WebElement InternalIntegrity;

	@FindBy(xpath = ("(//thead[@class='ui-table-thead'])[1]"))
	private List<WebElement> IIFields;

	@FindBy(xpath = ("//span[contains(text(),'Referential Integrity')]"))
	private WebElement ReferentialIntegrity;

	@FindBy(xpath = ("(//thead[@class='ui-table-thead'])[2]"))
	private List<WebElement> RIFields;

	@FindBy(xpath = ("//span[@class='pi pi-times']"))
	private WebElement clickCancel;

	@FindBy(xpath = ("//i[@title='Download']"))
	private WebElement clickDownload;

	public RuleByFile_RM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getClickRule() {
		return clickRule;
	}

	public WebElement getClickRulesByFile() {
		return clickRulesByFile;
	}

	public List<WebElement> getTableHead() {
		return tableHead;
	}

	public List<WebElement> getHashSignField() {
		return HashSignField;
	}

	public List<WebElement> getFileNameField() {
		return FileNameField;
	}

	public List<WebElement> getActionsField() {
		return ActionsField;
	}

	public WebElement getClickview() {
		return clickview;
	}

	public WebElement getInternalIntegrity() {
		return InternalIntegrity;
	}

	public List<WebElement> getIIFields() {
		return IIFields;
	}

	public WebElement getReferentialIntegrity() {
		return ReferentialIntegrity;
	}

	public List<WebElement> getRIFields() {
		return RIFields;
	}

	public WebElement getClickCancel() {
		return clickCancel;
	}

	public WebElement getClickDownload() {
		return clickDownload;
	}

}
