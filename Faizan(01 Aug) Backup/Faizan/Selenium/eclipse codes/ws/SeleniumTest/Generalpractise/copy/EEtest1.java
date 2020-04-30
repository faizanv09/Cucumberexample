package Generalpractise.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EEtest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Faizan\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://52.18.92.26:83/");
		driver.findElement(By.id("loginemail")).sendKeys("admin@mobiusservices.com");
		driver.findElement(By.xpath("//*[@id='loginpassword']")).sendKeys("Mobius@123");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("//a[@class='sitemenuitem current']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Configuration')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//ul[@id='responsive']//li[4]//ul[1]//li[3]")).click();
		driver.findElement(By.xpath("//ul[@id='responsive']//li[3]//ul[1]//li[3]")).click();
		driver.findElement(By.id("categoryName")).sendKeys("testcateg9998");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#categorySave")).click();
		//driver.findElement(By.xpath("//*[text()='Save']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		
		Thread.sleep(4000);
		
		
		
		

	}

}
