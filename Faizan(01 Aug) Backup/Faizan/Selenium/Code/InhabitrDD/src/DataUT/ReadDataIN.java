package DataUT;

import org.testng.annotations.Test;

import DataLibrary.ExcelDataConfig;
@Test
public class ReadDataIN {
	
	public void exdata(){
	ExcelDataConfig exceldata = new ExcelDataConfig("F:\\Faizan(01 Aug) Backup\\Faizan\\ExcelData\\Test.xlsx");
	 System.out.println(exceldata.getData(0, 0, 0));
	 System.out.println(exceldata.getData(0, 0, 1));
	}
	
	
	
	
	
	
     
	
	

}
