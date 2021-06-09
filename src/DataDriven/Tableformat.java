package DataDriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tableformat {

	public static void main(String[] args) throws Exception

	{
		FileInputStream fis = new FileInputStream("./data/input.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("Sheet1");

		//In order to get all the values from excel rows and cells we need to iterate the excel file until it matches all conditions	
		// First we are getting max no of rows
		int rowCount = sh.getLastRowNum();

		//iterating the rows first
		for (int i = 0; i < rowCount+1; i++) {

			//whenever condition is true functionality will go inside and get the first row and save in row object
			Row row = sh.getRow(i);

			//Create a loop to print cell values in a row
			for (int j = 0; j < row.getLastCellNum(); j++) {

				System.out.print(row.getCell(j).getStringCellValue()+"\t");

			}

			System.out.println();
		} 

	}

}
