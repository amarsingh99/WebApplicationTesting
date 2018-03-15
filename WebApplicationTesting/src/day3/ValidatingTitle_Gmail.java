package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Gmail {

	public static void main(String[] args)
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://gmail.com");
		
		String ExpectedTitle="Gmail Application"; // tester
		
		String ActualTitle=driver.getTitle(); // Developer
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title Matched -- PASS");
		}
		else
		{
			System.out.println("Title Not Matched - FAIL");
		}
		
		driver.close();
		

	}

}
