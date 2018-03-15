package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCompleteData {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");

		
		// html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]
		// html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[36]/td[8]
		
		String part1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		for(int i=1;i<=36;i++) // Row
		{
			for(int k=1;k<=8;k++) // Column
			{
				String data=driver.findElement(By.xpath(part1+i+part2+k+part3)).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
				
		}
		
		driver.close();
		
		

	}

}
