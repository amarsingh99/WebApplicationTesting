package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DrandAndDrop_Operations {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
	WebElement	Source=driver.findElement(By.id("draggable"));
	WebElement Targert=driver.findElement(By.id("droppable"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(Source, Targert).perform();
	
	
	

	}

}
