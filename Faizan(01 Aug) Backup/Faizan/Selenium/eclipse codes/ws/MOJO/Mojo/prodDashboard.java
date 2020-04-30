package Mojo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.Test;

public class prodDashboard {

	@Test

	public void prod(WebDriver driver, By by) {

		Actions Prod = new Actions(driver);
		Prod.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Manage Project')]"))).perform();

		driver.findElement(By.xpath("//a[contains(text(),'Production Dashboard')]")).click();

		driver.findElement(By.xpath("//button[@id='check_submit']")).click();

		// Searching the lease ID

		/*
		 * Select cltid = new Select(driver.findElement(By.id("ClientId")));
		 * cltid.selectByValue("1");
		 */

		Select projid = new Select(driver.findElement(By.xpath("//select[@name='ProjectId']")));
		projid.selectByValue("3369");

		driver.findElement(By.xpath("//input[@placeholder='Lease ID']")).sendKeys("Automation013");

		driver.findElement(By.xpath("//button[contains(text(),'VIEW')]")).click();

		// driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automation001");
		
		

		WebElement autotext = driver.findElement(By.xpath("//td[contains(text(),'Automation013')]"));
		autotext.getText();
		// System.out.println(autotext.getText());

		String Actualdata = "Automation013";

		Assert.assertEquals(autotext.getText(), Actualdata);

		System.out.println(autotext.getText());

		// driver.findElement(By.xpath("//input[contains(@id,'priority')]")).click();
		// driver.findElement(By.xpath("//input[@class='Pri_ids']")).click();

		// Parent child combination to click check box
		// using java script to scroll down to locate elements
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		//WebDriverWait w1 = new WebDriverWait(driver,20);
		
		//w1.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//td[contains(text(),'Hugo Boss')] / preceding-sibling::td/input[contains(@id,'priority')]"),"Hugo Boss"));
		
		driver.findElement(By
				.xpath("//td[contains(text(),'Hugo Boss')] / preceding-sibling::td/input[contains(@id,'priority')]"))
				.click();

		driver.findElement(By.id("prioritize")).click();

		Select dqcuser = new Select(driver.findElement(By.xpath("//select[@name='UserId[1][]']")));
		dqcuser.selectByValue("104545");

		Select abst = new Select(driver.findElement(By.xpath("//select[@name='UserId[2][]']")));
		abst.selectByValue("104546");
		
		Select rvw = new Select(driver.findElement(By.xpath("//select[@name='UserId[3][]']")));
		rvw.selectByValue("105802");

		Select sense = new Select(driver.findElement(By.xpath("//select[@name='UserId[4][]']")));
		sense.selectByValue("105852");

		JavascriptExecutor jd = (JavascriptExecutor) driver;
		jd.executeScript("window.scrollBy(0,1000)");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[3]/input[1]")).click();

		Actions logicon = new Actions(driver);
		logicon.moveToElement(driver.findElement(By.xpath("//img[contains(@src,'oneblack')]"))).perform();
		
		//driver.findElement(By.xpath("//img[contains(@src,'oneblack')]")).click();
		

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

	}

}
