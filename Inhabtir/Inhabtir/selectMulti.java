package Inhabtir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class selectMulti {
	@Test
	public void sltMult(WebDriver driver, By by) throws InterruptedException{
		
				
		
		driver.findElement(By.xpath("//span[@class='currentCityDisplay']")).click();

		driver.findElement(By.xpath("//a[contains(@class,'dropdown-item')][contains(text(),'Chicago')]")).click();

		Thread.sleep(3000);

		Actions FS = new Actions(driver);
		FS.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Furniture Sets')]"))).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Bedroom Sets')]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/div[1]/div[1]/div[6]/div[1]/div[2]/form[1]/button[1]")).click();
		
		Thread.sleep(3000);
		Actions lr = new Actions(driver);
		lr.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Furniture Sets')]"))).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Living Room Sets')]")).click();
		
			
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/button[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='el middle']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/div[1]/div[1]/div[11]/div[1]/div[2]/form[1]/button[1]")).click();

		
	}

}
