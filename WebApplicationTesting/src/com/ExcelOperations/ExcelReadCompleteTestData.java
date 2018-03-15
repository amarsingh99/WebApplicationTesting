package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadCompleteTestData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\amarpreet\\Desktop\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);;
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum(); // identifying the rows count in the sheet with testdata 
		for(int a=0;a<=RowCount;a++)// Rows
		{
			Row r=sheet.getRow(a);// moving to a particular row
			int cellCount=r.getLastCellNum(); // in the row indentifying the cell count which the data
			for(int b=0;b<cellCount;b++)// Cells
			{
				Cell c=r.getCell(b); // moving toa particular row of a cell
				String data=c.getStringCellValue(); // getting data from the row of a cell
				System.out.print(data+"  "); // printing the data
			}
			System.out.println();
		}
		
		

	}

}
