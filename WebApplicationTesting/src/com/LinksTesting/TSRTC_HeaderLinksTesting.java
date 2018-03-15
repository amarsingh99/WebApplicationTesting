package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderLinksTesting {

	public static void main(String[] args) 
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap")); // identifing header block
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a")); // getting into Header Block and finding all the Elements in it and saving in an Array
		
		System.out.println(HeaderBlockLinks.size()); // finding the Size of the Array
		
		for(int i=0;i<HeaderBlockLinks.size();i++)
		{
		System.out.println(i+" "+HeaderBlockLinks.get(i).getText());
		
		HeaderBlockLinks.get(i).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		
		Sleeper.sleepTightInSeconds(10);
		
		HeaderBlock=driver.findElement(By.className("menu-wrap")); // identifing header block
		HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a")); // getting into Header Block and finding all the Elements in it and saving in an Array
		
		}
		
		driver.close();

	}

}
