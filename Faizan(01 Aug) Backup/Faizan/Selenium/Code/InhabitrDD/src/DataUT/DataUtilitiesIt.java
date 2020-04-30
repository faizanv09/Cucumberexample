package DataUT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataUtilitiesIt {
	@Test
	public void dataUT() throws Exception {
		File src = new File ("F:\\Faizan(01 Aug) Backup\\Faizan\\ExcelData\\Test.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Faizan(01 Aug) Backup\\Faizan\\Selenium\\Gecko\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://internaltesting.inhabitr.com");

		driver.findElement(By.xpath("//a[@id='login']")).click();
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue(); 
		
	
			  	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data0);
		
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue(); 

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data1);
		
		sheet1.getRow(1).createCell(2).setCellValue("Pass");

		driver.findElement(By.xpath("//button[@id='login_button']")).click();
		
		FileOutputStream fout = new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
		
	 	
	
		 

		
	}

}
