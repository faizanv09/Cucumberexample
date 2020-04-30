import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	
	public ArrayList<String> getData(String testcaseName ) throws IOException {
		
        ArrayList<String> a = new ArrayList();	
        
		FileInputStream fis =new FileInputStream("C://Faizan//Selenium//DD//Datadriven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		//Gets the no of sheets
		int sheets =workbook.getNumberOfSheets();
		
		//Traverse through each no of sheets and gets sheet if it eqals to "Test"
		
		for(int i=0;i<sheets;i++){
			
		if(	workbook.getSheetName(i).equalsIgnoreCase("Test"))
			
		{
		//Get the the desired sheet and it will be on the first or any given row
			XSSFSheet sheet=workbook.getSheetAt(i);
	     
			
		//To iterate on each rows on the sheet and it will be on the first sheet
			Iterator<Row> rows =sheet.iterator();//sheet is collection of rows
			Row firstrow =rows.next();
			//Collections methods to traverse through each cell in the excel
			
			Iterator <Cell> ce=firstrow.cellIterator();//column is collection of cells
			//Traverse through each cell in the column
			int k=0;
			int column = 0;
			while(ce.hasNext())
			{
				Cell value=ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("testcases")){
					
					//desired column
					column =k;
					
				}
				k++;
			}
				System.out.println(column);
			
			
			
			while(rows.hasNext()){
				
			  Row r =rows.next();
			  if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)){
				  
				  Iterator <Cell> cv= r.cellIterator();
				  while(cv.hasNext()){
					   //Cell c= cv.next();				  
					   a.add(cv.next().getStringCellValue());
					  
					  
				  }
				  
				 
			  }
			}
			
		}
			
		}
		return a;
		
		
			
	}
	public static void main(String[] args) throws IOException {
	
}
	
}






