package ifcondition;

import java.sql.Driver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class IfconditionandGettingURlandTitle 

{

	private static final String Else = null;

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/gmail/about/");
        
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
       String ExpectedTitle = "email";
      
       System.out.println();
       
       String actualtitle = driver.getTitle();
       if (actualtitle.equals(ExpectedTitle));
      
       {
    	   System.out.println("TitleMached--Pass");
       }
	}
    {
       System.out.println("TitlenotMatched--Fail");
	}
	
}
