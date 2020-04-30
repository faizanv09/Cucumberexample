package com.iowa.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\iowa\\feature",
glue = "com\\iowa\\stepdefinition" ,

plugin= {"pretty:target/cucumber.pretty.txt","html:target/cucumber.html.Report",
		"json:target/Cucumber_report/cucumber.json","usage:target/cucumber.usage.json","junit:target/cucumber.xml",
		//"com.cucumber.listener.ExtentCucumberFormatter:CucumberReport/reports.html"
},
monochrome = true, 
dryRun = false, 
strict = true,
tags = {"@Login,@RuleByDataElement_RM,@RuleByDataElement2_RM"}
)
public class RunnerIowa {
	public static WebDriver driver;

	@BeforeClass
	public static void browserSetup() throws IOException {
		String browserName = FileReaderManager.getInstance().getcrInstance().BrowserName();
		driver = BaseClassIowa.browserLaunch(browserName);

	}

	@AfterClass
	public static void browserquit() {
		driver.quit();

	}
}
