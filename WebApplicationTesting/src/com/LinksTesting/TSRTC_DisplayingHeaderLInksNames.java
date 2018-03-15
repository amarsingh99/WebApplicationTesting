package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_DisplayingHeaderLInksNames {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap")); // identifing header block
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a")); // getting into Header Block and finding all the Elements in it and saving in an Array
		
		System.out.println(HeaderBlockLinks.size()); // finding the Size of the Array
		
		for(int i=0;i<HeaderBlockLinks.size();i++)
		{
		System.out.println(HeaderBlockLinks.get(i).getText());
		}
		
		driver.close();

	}

}
