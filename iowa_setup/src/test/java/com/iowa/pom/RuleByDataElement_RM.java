package com.iowa.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RuleByDataElement_RM {
	public static WebDriver driver;

	@FindBy(xpath = ("//a[contains(text(),'Rules by Data Element')]"))
	private WebElement clickRuleByDataElement;

	@FindBy(tagName = ("select"))
	private WebElement selectReport;

	@FindBy(xpath = "//a[contains(text(),'Commcollege')]")
	private WebElement Commcollege;

	

	public RuleByDataElement_RM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickRuleByDataElement() {
		return clickRuleByDataElement;
	}

	public WebElement getSelectReport() {
		return selectReport;
	}

	public WebElement getCommcollege() {
		return Commcollege;
	} 

	
}
