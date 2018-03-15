package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingURL_Gmail {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
