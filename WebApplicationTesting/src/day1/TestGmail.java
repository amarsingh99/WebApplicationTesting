package day1;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class TestGmail 
{

	public static void main(String[] args) 
	{
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.get("https://facebook.com");
	 
 System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
     
     String ExpectedTitle="Facebook"; // tester
     
     String ActualTitle=driver.getTitle(); //Developer
     
     if(ActualTitle.equals(ExpectedTitle))
    	
	{
		System.out.println("Title Matched -- Pass");
	}
	else
	{
		System.out.print("TitlenotMatched-Failed");
	}
    

	}
}
   
