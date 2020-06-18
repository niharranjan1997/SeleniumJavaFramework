package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	public ExcelUtils(String excelPath, String sheetName)
	{
		try 
		{
			wb = new XSSFWorkbook(excelPath);
			sh = wb.getSheet(sheetName);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		//getRowCount();
		//getCellDataString(0,0);
		//getCellDataNumber(1,1);
	}
	
	public static int getRowCount() 
	{
		int rowCount = 0;
		try 
		{
			rowCount = sh.getPhysicalNumberOfRows();
			System.out.println("No. of Rows : "+rowCount);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}
	
	public static int getcolCount() 
	{
		int colCount = 0;
		try 
		{
			colCount = sh.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No. of columns : "+colCount);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colCount;
	}
	
	public static String getCellDataString(int rowNum, int colNum) 
	{
		String cellData = null;
		try 
		{
			cellData = sh.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;
	}
	
	public static void getCellDataNumber(int rowNum, int colNum) 
	{
		try 
		{
			double cellData = sh.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
