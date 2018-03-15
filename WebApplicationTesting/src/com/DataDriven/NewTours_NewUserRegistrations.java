package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistrations
{
	FirefoxDriver driver;
		
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		
	}
	
	@Test(priority=2)
	public void UserRegistration() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\amarpreet\\Desktop\\AmarpreetSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\NewUserRegistrationTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		
		for(int a=1;a<=RowCount;a++)
		{
			Row r=sheet.getRow(a);
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		
		double d=r.getCell(2).getNumericCellValue();
		long x=(long)d;
		String PhoneNumber=Long.toString(x);
		
		driver.findElement(By.name("phone")).sendKeys(PhoneNumber);
		driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		
		double p=r.getCell(7).getNumericCellValue();
		long y=(long)p;
		String PostalCode=Long.toString(y);
		
		driver.findElement(By.name("postalCode")).sendKeys(PostalCode);
		driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		driver.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		
		driver.findElement(By.name("register")).click();
		
		String ExpectedUserName = r.getCell(9).getStringCellValue();
		
		String UserNameRegisteredText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		if(UserNameRegisteredText.contains(ExpectedUserName))
		{
			System.out.println("user registered Successfully -- Pass");
			r.createCell(12).setCellValue("user registered Successfully -- Pass");
		}
		else
		{
			System.out.println("User registration Failed -- FAIL");
			r.createCell(12).setCellValue("User registration Failed -- FAIL");
		}
		
		driver.navigate().back();
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\amarpreet\\Desktop\\AmarpreetSelenium\\WebApplicationTesting\\src\\com\\ExcelResultFiles\\UserRegistrationResultfile.xlsx");
		workBook.write(file1);
	}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
