package TestNGprac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;



public class Mainclass extends Generic  {
    @BeforeTest
	public void Centraized() throws IOException {
		// TODO Auto-generated method stub
    	  Properties pro = new Properties();
    	FileInputStream fis = new FileInputStream("D:\\dev\\ws\\SeleniumTest\\TestNGprac\\datafile.properties");
    	pro.load(fis);
    	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Faizan\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://rportalbuild.hiperos.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//driver.get("https://rportalbuild.hiperos.com/");
		driver.get(pro.getProperty("url"));
		
		//driver.findElement(By.id("txtUsername")).sendKeys("faizan_rpdh@mobiusservices.com");
		driver.findElement(By.id("txtUsername")).sendKeys(pro.getProperty("username"));
		//driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("coupa11");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(pro.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		
		
		CreateSupplier(driver, By.xpath("//*[@id='header-nav-ContxtSupplier']"));
		

	}
}


