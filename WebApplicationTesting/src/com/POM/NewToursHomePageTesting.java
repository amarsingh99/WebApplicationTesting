package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePageTesting 
{
	@Test
	public void HomePageTesting()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelComeMercuryTours Amar = PageFactory.initElements(driver, WelComeMercuryTours.class);
		
		Amar.Register();
		driver.navigate().back();
		
		Amar.Support();
		driver.navigate().back();
		
		Amar.LogIn("tutorial", "tutorial");
		
		
		
		driver.close();
		
	}
	
}
