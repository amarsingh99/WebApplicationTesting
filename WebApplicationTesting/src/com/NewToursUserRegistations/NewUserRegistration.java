package com.NewToursUserRegistations;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewUserRegistration {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Amar");
		driver.findElement(By.name("lastName")).sendKeys("HEllo");
		driver.findElement(By.name("phone")).sendKeys("85858");
		driver.findElement(By.id("userName")).sendKeys("Amar@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("HiTEch");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("50001");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("Amaaaaar");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		driver.findElement(By.name("register")).click();
		
		String ExpectedUserName = "Amaaaaar";
		
		String UserNameRegisteredText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		if(UserNameRegisteredText.contains(ExpectedUserName))
		{
			System.out.println("user registered Successfully -- Pass");
		}
		else
		{
			System.out.println("User registration Failed -- FAIL");
		}
		
		driver.close();
		
		

	}

}
