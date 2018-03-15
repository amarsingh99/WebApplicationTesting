package testinggmaillogin;

import static org.junit.Assert.assertArrayEquals;

import java.sql.Driver;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class TestGmailLogin {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	 
		System.out.println();
		
		driver.close();
	}		
     
}
