package Mojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class queryCheck {
	
	@Test
	public void queryck(WebDriver driver, By by) {
		
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username or email']")).sendKeys("LeaseTeamLeaderA");
		driver.findElement(By.name("password")).sendKeys("mobius123");
		driver.findElement(By.name("commit")).click();
		
		if (!driver
				.findElements(By.xpath("//b[contains(text(),'Are You Sure? Your previous session is still active')]"))
				.isEmpty()) {
			driver.findElement(By.xpath("//input[@id='activeYes']")).click();
			
		}
			
			Actions gtproj = new Actions(driver);
			gtproj.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Manage Project')]"))).perform();	
		
		driver.findElement(By.xpath("//a[contains(text(),'Query')]")).click();
		
		Select projd = new Select(driver.findElement(By.xpath("//select[@name='ProjectId']")));
		projd.selectByValue("3369");
		
		Select mid = new Select(driver.findElement(By.xpath("//select[@id='ModuleId']")));
		mid.selectByValue("6694025");
		
		driver.findElement(By.xpath("//input[@id='QueryDateFrom']")).click();
		
		driver.findElement(By.xpath("//td[@class='dp_current']")).click();
		
		driver.findElement(By.xpath("//button[@name='check_submit']")).click();
		
		Select slt = new Select(driver.findElement(By.xpath("//select[@id='status6433']")));
		slt.selectByValue("3");
		
		driver.findElement(By.xpath("//textarea[@id='cl_resp6433']")).sendKeys("good");
		
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		
		Actions logpic = new Actions(driver);
		logpic.moveToElement(driver.findElement(By.xpath("//img[contains(@src,'oneblack')]"))).perform();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		
	}
	}



