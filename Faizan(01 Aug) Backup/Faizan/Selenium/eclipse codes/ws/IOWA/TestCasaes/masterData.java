package TestCasaes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class masterData {
	
	public void masterData(WebDriver driver,By by)
	{
		
	driver.findElement(By.xpath("//a[contains(text(),'Master Data')]")).click();
	
	}
	
	public void AddUserManagement(WebDriver driver,By by){
		
		driver.findElement(By.xpath("//a[contains(text(),'User Management')]")).click();
		driver.findElement(By.xpath("//a[@class='btn-add']")).click();
		Select se =new Select(driver.findElement(by.xpath("//select[@id='roleId']")));
		se.selectByValue("3");
		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("visheshjain18@gmail.com");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vishesh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("jain");
		driver.findElement(By.xpath("//input[@id='workPhone']")).sendKeys("9632587414");
		
		Select Clg =new Select(driver.findElement(by.xpath("//select[@id='college']")));
		Clg.selectByValue("3");
		
		driver.findElement(By.xpath("//input[@id='expiry']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
	}
}
