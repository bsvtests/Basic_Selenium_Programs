package DataDriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleExcel {

	public static void main(String[] args) throws Exception

	{
		//Create and read the excel file
		FileInputStream fis = new FileInputStream("./data/input.xlsx");

		//Create the workbook(group of multiple sheets)
		Workbook wb = WorkbookFactory.create(fis);

		//Get the sheet
		Sheet sh = wb.getSheet("Sheet1");

		//Get the row 
		Row r = sh.getRow(3);

		//To get cell 
		Cell c = r.getCell(4);
		
		//get data
		String data = c.getStringCellValue();
		System.out.println(data);
		
		//output is D5

	}
}