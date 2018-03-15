package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelComeMercuryTours
{
	
	/*WebElement register=driver.findElement(By.linkText("REGISTER"));
	register.click();*/
	
	@FindBy(linkText="REGISTER")  
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
				
	}
	
	@FindBy(name="userName")
	WebElement Uname;
	
	@FindBy(name="password")
	WebElement Pwd;
	@FindBy(name="login")
	WebElement SignIN;
	
	public void LogIn(String UserName,String Password)
	{
		Uname.sendKeys(UserName);
		Pwd.sendKeys(Password);
		SignIN.click();
	}
	
	
}


