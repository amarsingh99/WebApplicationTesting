package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterValueIntoEmail_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("hunnypreet@gmail.com");
		
		driver.findElementById("pass").sendKeys("amar1234");
        
		
		driver.findElementById("loginbutton").click();
	}

}
