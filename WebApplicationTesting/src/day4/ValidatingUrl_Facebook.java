package day4;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingUrl_Facebook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String ExpectedUrl="facebook.com";//Req
		
		String ActualUrl=driver.getCurrentUrl();//Dev
		
		System.out.println(ExpectedUrl);
		System.out.println(ActualUrl);
		
		if(ActualUrl.contains(ExpectedUrl))
		{
			System.out.println("URL Matched - PASS");
		}
		else
		{
			System.out.println("URL Not Matched - FAIL");
		}
		
		System.out.println();
		
		String ExpectedTitle="Facebook";
		String Actualtitle=driver.getTitle();
		
		System.out.println(ExpectedTitle);
		System.out.println(Actualtitle);
		
		if(Actualtitle.equals(ExpectedTitle))
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
