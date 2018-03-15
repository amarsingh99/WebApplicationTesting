package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CaputringFacebook_Title {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		

	}

}
