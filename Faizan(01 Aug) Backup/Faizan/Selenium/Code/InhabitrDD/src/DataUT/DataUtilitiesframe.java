package DataUT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataUtilitiesframe {
	
	WebDriver driver;
	@Test(dataProvider="inhabitr")
	public void dataUT(String Username,String Password) throws Exception {
		/*File src = new File ("F:\\Faizan(01 Aug) Backup\\Faizan\\ExcelData\\Test.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);*/
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Faizan(01 Aug) Backup\\Faizan\\Selenium\\Gecko\\chromedriver.exe");
 driver
		 = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://internaltesting.inhabitr.com");

		driver.findElement(By.xpath("//a[@id='login']")).click();
		
		//String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();  
	  	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Username);
		
		//String data1 = sheet1.getRow(0).getCell(1).getStringCellValue(); 

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@id='login_button']")).click();

		System.out.println(driver.getTitle());
		
		
		Assert.assertTrue(driver.getTitle().contains("Account"));
		
		driver.findElement(By.xpath("//span[@class='currentCityDisplay']")).click();

		driver.findElement(By.xpath("//a[contains(@class,'dropdown-item')][contains(text(),'Chicago')]")).click();

		Thread.sleep(3000);

		Actions FS = new Actions(driver);
		FS.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Furniture Sets')]"))).perform();

		driver.findElement(By.xpath("//a[contains(text(),'Bedroom Sets')]")).click();

		driver.findElement(By.xpath("//div[2]//div[1]//div[1]//a[1]//img[1]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Rent Now')]")).click();

		Thread.sleep(6000);
		
		//driver.findElement(By.xpath("//div[@class='overlay jx_ui_Widget']")).click();
		// driver.findElement(By.xpath("//div[@class='input-group
		// product-quantity']//button[@class='btn btn-secondary
		// qUp'][contains(text(),'+')]")).click();

		driver.findElement(By.xpath("//button[@class='i_button float-left']")).click();

		// driver.findElement(By.xpath("//div[@class='input-group
		// product-quantity']//button[@class='btn btn-secondary
		// qUp'][contains(text(),'+')]")).click();

		Thread.sleep(2000);

		driver.findElement(By
				.xpath("/html[1]/body[1]/main[1]/section[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);

		// Delivery date
		
		//driver.findElement(By.xpath("//div[@class='box']//a[@class='next'][contains(text(),'Next')]")).click();
		Thread.sleep(2000);

		

		driver.findElement(By.xpath("//span[contains(text(),'18')]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='timeSlot slots-18-11-2019 showThis']//span[contains(text(),'11:00am (+$0)')]"))
				.click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@id='li-19-11-2019']//span[contains(text(),'19')]")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//div[@class='timeSlot slots-19-11-2019 showThis']//span[contains(text(),'05:00pm (+$0)')]"))
				.click();
		
		driver.findElement(By.xpath("//li[@id='li-20-11-2019']//span[contains(text(),'20')]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='timeSlot slots-20-11-2019 showThis']//span[contains(text(),'05:00pm (+$0)')]"))
				.click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/form[1]/div[2]/div[2]/button[1]")).click();

		// Delivery Adress
		
		driver.findElement(By.xpath("//input[@id='Address']")).sendKeys("new street");
		
		driver.findElement(By.xpath("//input[@id='AptNo']")).sendKeys("new apt");
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("cigo");
		
		driver.findElement(By.xpath("//input[@id='zip_code']")).sendKeys("60611");
		
		//driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("");
		
		driver.findElement(By.xpath("//span[@class='custom-control-label custom-control-description']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/form[1]/div[1]/div[2]/div[1]/div[10]/div[1]/button[1]")).click();
		
		Thread.sleep(3000);
		
		
		
		
		Thread.sleep(2000);
		
		Actions pm = new Actions(driver);
		pm.moveToElement(driver.findElement(By.xpath("//button[@id='bankAccount']"))).perform();
		driver.findElement(By.xpath("//button[@id='bankAccount']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='plaid-link-container']/div/div[1]/div/div/div[2]/div[2]/div/button[1]")).click();
		
				 
		
		

	
		
		
		
	
	  	
		
	}
	@AfterMethod
	public void tearDown(){
		
		 driver.quit();	
	}
	
	@DataProvider(name= "inhabitr")
     public Object[][] passData(){
    	 
    	 Object[][] data = new Object [3][2];
    	 
    	 data [0][0] = "faizan@inhabitr.in"; 
    	 
    	 data [0][1]="Mobius@123";
    	 
         data [1][0] = "faizan@inhabitr.in"; 
    	 
    	 data [1][1]="Mobius@123";
    	 
         data [2][0] = "faizan@inhabitr.in"; 
    	 
    	 data [2][1]="Mobius@12";
    	 
    	 return data;
    	 
     }
	

}
