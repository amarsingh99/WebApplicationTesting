package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Vacations")).click();
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		driver.close();

	}

}
