package GenericTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass extends Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Faizan(01 Aug) Backup\\Faizan\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://34.248.199.184:81/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("faizan_mobius@coupa.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("coupa21");
		driver.findElement(By.id("btnLogin")).click();
		
	
		

	}

}
