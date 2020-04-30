package Generalpractise.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Faizan\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rportalbuild.hiperos.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.get("https://rportalbuild.hiperos.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("faizan_rpdh@mobiusservices.com");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("coupa11");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//a[@id='header-nav-ContxtAdmin']")).click();
		driver.findElement(By.id("ctl00_cntBody_lkbUserManagement")).click();

	}

}
