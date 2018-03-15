package excelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReading {

	public static void main(String[] args) throws IOException
	{
	FileInputStream file = new FileInputStream("C:\\Users\\amarpreet\\Desktop\\TestData.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	
	Row r=sheet.getRow(0);
	Cell c=r.getCell(0);
	
	String data=c.getStringCellValue();
	System.out.println(data);
	
	
	}

}
