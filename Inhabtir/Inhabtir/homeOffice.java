package Inhabtir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class homeOffice {
	
	public void hoff(WebDriver driver, By by) throws InterruptedException {
		

				Actions FS = new Actions(driver);
				FS.moveToElement(driver.findElement(By.xpath("//body/main/header/div[@id='header']/nav[@class='navbar navbar-expand-lg']/div[@class='container-fluid']/div[@id='navbarSupportedContenta']/nav[@id='furnitureMenu']/ul/li[5]/a[1]"))).perform();
				
				driver.findElement(By.xpath("//a[contains(text(),'Office Chair')]")).click();
				
				driver.findElement(By.xpath("//div[2]//div[1]//div[1]//a[1]//img[1]")).click();
				
				driver.findElement(By.xpath("//button[@class='i_button button']")).click();
				
				Thread.sleep(3000);
				Actions lr = new Actions(driver);
				lr.moveToElement(driver.findElement(By.xpath("//body/main/header/div[@id='header']/nav[@class='navbar navbar-expand-lg']/div[@class='container-fluid']/div[@id='navbarSupportedContenta']/nav[@id='furnitureMenu']/ul/li[5]/a[1]"))).perform();
				
				driver.findElement(By.xpath("//a[contains(text(),'Book Shelves')]")).click();
				
				driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/button[1]")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='i_button float-left']")).click();
				
	}
	
	

}
