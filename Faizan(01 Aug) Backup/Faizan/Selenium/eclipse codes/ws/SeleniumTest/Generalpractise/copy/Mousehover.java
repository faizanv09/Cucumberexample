package Generalpractise.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Faizan\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://52.18.92.26:83/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("loginemail")).sendKeys("admin@mobiusservices.com");
		driver.findElement(By.xpath("//*[@id='loginpassword']")).sendKeys("Mobius@123");
		driver.findElement(By.id("loginButton")).click();
		
		Actions docM = new Actions(driver);
		docM.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Doc Management')]"))).build().perform();
		
		driver.findElement(By.xpath("//ul[@id='responsive']//li[4]//ul[1]//li[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='allocatedDoc_filter']//input[@placeholder='Search:']")).sendKeys("test");
		
		
		
		//driver.findElement(By.xpath("//a[contains(text(),'5192_test.pdf')]")).click();
		
		//driver.findElement(By.xpath("//button[@id='btnNext']")).click();
		
		//driver.findElement(By.xpath("//a[contains(@id,'menu1')]")).click();
		
		//driver.findElement(By.xpath("//a[contains(@id,'menu1')]")).click();
		
		driver.findElement(By.xpath("//div[@id='header'] //*[text()='Search']")).click();
		           
		//driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='custom-table'][1]")));
		
		//driver.findElement(By.xpath("//div[@id='listing-item_672_0']//div[@class='showProdDiv checkboxes']")).click();
		
		//driver.findElement(By.xpath("//div[@id='custom-table'][1] //div[@id='listing-item_672_0']//div[@class='showProdDiv checkboxes']")).click();
		
		driver.findElement(By.xpath("//div[@id='custom-table'][1] //div[@id='listing-item_672_0']")).click();
	}

}
