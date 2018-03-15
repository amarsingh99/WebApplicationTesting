package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotations1 
{

	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This is used to automate FireFox Browser");
	}
	
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("THis is used to test LogIn Functionality");
	}
	
	@Test(enabled=false)
	public void ComposeMail()
	{
		System.out.println("Thi is used to test Compose Mail functionality");
	}
	

}
