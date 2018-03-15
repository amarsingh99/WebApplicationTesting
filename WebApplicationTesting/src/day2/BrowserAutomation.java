package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAutomation {

	public static void main(String[] args)
	{
		FirefoxDriver hi = new FirefoxDriver();
		hi.get("http://facebook.com");
		hi.close();
		
		

	}

}
