package DataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic {
	public static String getData(String pathname,String sheet_name,int rn,int cn)

	{
		try
		{
			FileInputStream file = new FileInputStream(new File(pathname));
			String data = WorkbookFactory.create(file).getSheet(sheet_name).getRow(rn).getCell(cn).toString();
			return data;
		}
		catch (Exception e) 
		{
			return null;
		}
	}
	public static int getRowCount(String pathname,String sheet_name)
	{
		try
		{
			FileInputStream file = new FileInputStream(new File(pathname));
			int rc = WorkbookFactory.create(file).getSheet(sheet_name).getLastRowNum();
			return rc;
		}
		catch (Exception e) 
		{
			return 0;
		}

	}

	public static int getCellCount(String pathname, String sheet_name, int rn)
	{
		try
		{
			FileInputStream file = new FileInputStream(new File(pathname));
			int cc = WorkbookFactory.create(file).getSheet(sheet_name).getRow(rn).getLastCellNum();;
			return cc ;
		}
		catch (Exception e) 
		{
			return 0;
		}
	}
}