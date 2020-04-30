package TestCasaes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IOWAlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Faizan(01 Aug) Backup\\Faizan\\Selenium\\Gecko\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://63.251.104.125/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("mohammed.faizan@mobiusservices.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mobius@123");
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys("testuserj");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		/*masterData md = new masterData();
		md.masterData(driver, By.xpath("//a[contains(text(),'Master Data')]"));
		md.AddUserManagement(driver, By.xpath("//a[contains(text(),'Master Data')]"));*/
		
		DataManagement dm = new DataManagement();
		dm.dataMange(driver, By.xpath("//a[contains(text(),'Data Management')]"));
		//dm.setClipboardData("F:\\Faizan(01 Aug) Backup\\Faizan\\Projects\\IOWA\\Upload\\Course.xlsx");
		//dm.uploadFile(null);

		

		
		
	}

}
