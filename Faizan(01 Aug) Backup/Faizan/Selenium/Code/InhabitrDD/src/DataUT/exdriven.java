package DataUT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
@Test
public class exdriven {
	
	public void newdriven() throws IOException{
		File src = new File("F:\\Faizan(01 Aug) Backup\\Faizan\\ExcelData\\Test.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String myusername = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("My user name is" + myusername);
		
		
	
	}

}
