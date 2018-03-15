package com.TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3
{
	@BeforeMethod
	public void BrowserLaunchAndLogIn()
	{
		System.out.println("Browser launch and LogIn");
	}
	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("THis is used to test InBox Functionality");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("This is used to test Compose Mail functionality");
	}
	
  @AfterMethod
  public void ApplicationClose()
  {
	  System.out.println("Closing the Application");
  }
}
