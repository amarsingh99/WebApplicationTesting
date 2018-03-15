package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingLinkNames_NewToursHomePage {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		//driver.get("http://gmail.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		/*System.out.println(links.get(0).getText());
		System.out.println(links.get(1).getText());*/
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
		}
		
		
		driver.close();

	}

}
