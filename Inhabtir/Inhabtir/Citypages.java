package Inhabtir;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Citypages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Faizan(01 Aug) Backup\\Faizan\\Selenium\\Gecko\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://internaltesting.inhabitr.com");
		
		driver.findElement(By.xpath("//div[@class='row']//div[2]//div[1]//div[1]//div[1]//div[2]//form[1]//button[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body[@class='modal-open']/footer/div[@id='askCitySelect']/div[@class='modal-dialog modal-xl']/div[@class='modal-content']/div[@class='modal-body p-sm-5']/div[@id='cityListInAsk']/div[@id='owl-five']/div[@class='owl-stage-outer']/div[@class='owl-stage']/div[1]/div[1]/a[1]/div[1]")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Mesmerize Dining Room')]")).click();
		
		driver.findElement(By.xpath("//button[@class='i_button button']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='i_button float-left']")).click();
		
		Thread.sleep(4000);
		
		JavascriptExecutor sr = (JavascriptExecutor) driver;
		sr.executeScript("window.scrollBy(0,2000)");
		
		driver.findElement(By.linkText("Phoenix")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
		
		//Again order the same product
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Mesmerize Dining Room')]")).click();
		
		driver.findElement(By.xpath("//button[@class='i_button button']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='i_button float-left']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@id='ajaxDropdownCityList']//a[@class='nav-link']")).click();

		driver.findElement(By.xpath("//a[contains(@class,'dropdown-item')][contains(text(),'Chicago')]")).click();
		
		driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
		
		driver.findElement(By.xpath("//a[@id='cart']")).click();
		
		
		
				
		
		
		
		

	}
	
	

}
