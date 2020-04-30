package Inhabtir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class bedRoom {
	
	@Test
	public void bdrm(WebDriver driver, By by) throws InterruptedException{
		
		Actions FS = new Actions(driver);
		FS.moveToElement(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='header']/nav[@class='navbar navbar-expand-lg nav-bg']/div[@class='container-fluid']/div[@id='navbarSupportedContenta']/nav[@id='furnitureMenu']/ul/li[2]/a[1]"))).perform();
		
		driver.findElement(By.xpath("//li[2]//ul[1]//div[1]//div[1]//li[2]//a[1]")).click();
		
		driver.findElement(By.xpath("//div[2]//div[1]//div[1]//a[1]//img[1]")).click();
		
		driver.findElement(By.xpath("//button[@class='i_button button']")).click();
		
		Thread.sleep(3000);
		Actions lr = new Actions(driver);
		lr.moveToElement(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='header']/nav[@class='navbar navbar-expand-lg nav-bg']/div[@class='container-fluid']/div[@id='navbarSupportedContenta']/nav[@id='furnitureMenu']/ul/li[2]/a[1]"))).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Nightstand')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/div[1]/div[1]/div[5]/div[1]/div[2]/form[1]/div[1]/button[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='el middle']")).click();
		
		//driver.findElement(By.xpath("//div[@class='input-group product-quantity']//button[@class='btn btn-secondary qUp'][contains(text(),'+')]")).click();
		
		
	}
	
	

}
