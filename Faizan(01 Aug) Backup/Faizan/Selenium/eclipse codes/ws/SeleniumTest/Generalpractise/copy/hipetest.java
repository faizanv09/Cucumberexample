package Generalpractise.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hipetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Faizan\\Selenium\\Driver\\74\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rportalbuild.hiperos.com/");
			driver.findElement(By.id("txtUsername")).sendKeys("faizan_mobius@coupa.com");
			driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("coupa21");
			driver.findElement(By.id("btnLogin")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'Personal')]")).click();
			 driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Widget']")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='add-new-widget']/div[2]/div[2]/div[2]/div[13]/a/img")).click();
			
	}

}
