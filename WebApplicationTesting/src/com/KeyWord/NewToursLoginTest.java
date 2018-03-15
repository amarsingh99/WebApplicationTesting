package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLoginTest 
{

	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LogIn() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\amarpreet\\Desktop\\AmarpreetSelenium\\WebApplicationTesting\\NewTours.properties");
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		
		driver.findElement(By.xpath(pr.getProperty("SignIn"))).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String ExpectedTitle = "Find";
		String ActualTitle=driver.getTitle();
		
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("Title matched --pass");
		}
		else
		{
			System.out.println("Title Not Matched --Fail");
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
