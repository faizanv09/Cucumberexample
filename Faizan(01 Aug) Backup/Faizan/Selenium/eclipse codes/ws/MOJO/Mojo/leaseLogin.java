package Mojo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class leaseLogin {

	@Test
	public void lease(WebDriver driver, By by) throws InterruptedException {

		driver.findElement(By.name("login")).sendKeys("LeaseDQCUserA");
		driver.findElement(By.name("password")).sendKeys("mobius123");
		driver.findElement(By.name("commit")).click();

		if (!driver
				.findElements(By.xpath("//b[contains(text(),'Are You Sure? Your previous session is still active')]"))
				.isEmpty()) {
			driver.findElement(By.xpath("//input[@id='activeYes']")).click();

		}

		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.findElement(By.id("1325")).click();

		Select ml = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11110,this.value,,4670,123,1); autoSave(4670, 123, 1);')]")));
		ml.selectByValue("Yes");

		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();

		driver.findElement(By.xpath("//textarea[contains(@id,'qry')]")).sendKeys("test");

		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@id='Query']")).click();
		
		
		Select icl = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11112,this.value,,4672,123,1); autoSave(4672, 123, 1);')]")));
		icl.selectByValue("No");
		
		Select il = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11113,this.value,,4673,123,1); autoSave(4673, 123, 1);')]")));
		il.selectByValue("No");
		
		Select pal = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11114,this.value,,4674,123,1); autoSave(4674, 123, 1);')]")));
		pal.selectByValue("No");
		
		Select par = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11115,this.value,,4675,123,1); autoSave(4675, 123, 1);')]")));
		par.selectByValue("No");
		
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,1000)");

		
		Select lt = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11116,this.value,,4676,123,1); autoSave(4676, 123, 1);')]")));
		lt.selectByValue("No");
		
						
		Select rcd = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11119,this.value,,4679,123,1); autoSave(4679, 123, 1);')]")));
		rcd.selectByValue("No");
		
		Select br = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11120,this.value,,4680,123,1); autoSave(4680, 123, 1);')]")));
		br.selectByValue("No");
		
		Select dl = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11124,this.value,,4684,123,1); autoSave(4684, 123, 1);')]")));
		dl.selectByValue("No");
		
		JavascriptExecutor sr = (JavascriptExecutor) driver;
		sr.executeScript("window.scrollBy(0,1000)");

		
		Select tg = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11126,this.value,,4686,123,1); autoSave(4686, 123, 1);')]")));
		tg.selectByValue("No");
		
		Select Uo = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11128,this.value,,4688,123,1); autoSave(4688, 123, 1);')]")));
		Uo.selectByValue("No");
		
		Select doc = new Select(driver.findElement(By.xpath("//select[contains(@onchange,'LoadValue(11127,this.value,,4687,123,1); autoSave(4687, 123, 1);')]")));
		doc.selectByValue("No");
		
	
		
		//driver.findElement(By.xpath("//button[@id='save_btn']")).click();
		
		Thread.sleep(2000);
		
		/*WebDriverWait w1 = new WebDriverWait(driver,3);
		//w.until(ExpectedConditions.textToBePresentInElement("//button[@id='ctl00_cntBody_weButtons_weButtonsibtnNext']", "next"));
		w1.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[@value='saveandcontinue']]"),"Next"));
		driver.findElement(By.xpath("//button[@id='ctl00_cntBody_weButtons_weButtonsibtnNext']")).click();*/
		
		driver.findElement(By.xpath("//button[@value='saveandcontinue']")).click();
		
		
		//driver.findElement(By.xpath("//img[contains(@src,'oneblack')]")).click();
		
		Actions logpic = new Actions(driver);
		logpic.moveToElement(driver.findElement(By.xpath("//img[contains(@src,'oneblack')]"))).perform();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

	}
}
