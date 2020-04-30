package DataLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	@Test
	public ExcelDataConfig(String excelpath){
	try {
		File src = new File (excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new  XSSFWorkbook(fis);
		
	}  catch (IOException e) {
		System.out.println(e.getMessage());
	}
	
	}
	
  @Test
  public String getData(int sheetnumber,int row, int column ){
	sheet1 = wb.getSheetAt(0);
	String data = sheet1.getRow(row).getCell(column).getStringCellValue(); 
	return data;
	
  }
  
  public int getRowcount(int sheetindex){
	  
	  int row =wb.getSheetAt(sheetindex).getLastRowNum();
	  
	  row = row+1;
	  
	  return row;
  }
}