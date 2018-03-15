package newToursApplicationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewToursApplicationLogInTest 
{
	FirefoxDriver driver;
	
	@Given("^Open Firefox Browser and Navigate to NewTours Application$")
	public void Open_Firefox_Browser_and_Navigate_to_NewTours_Application() throws Throwable
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}

	@When("^User enters Valid UserName and Password and click no SingIn  button$")
	public void User_enters_Valid_UserName_and_Password_and_click_no_SingIn_button() throws Throwable 
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
		
	}

	@Then("^User should be able to Successfully LogIn to the Application and Close the Application$")
	public void User_should_be_able_to_Successfully_LogIn_to_the_Application_and_Close_the_Application() throws Throwable 
	{
		String ExpectedTitle="Find";
		String ActualTitle=driver.getTitle();
		
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("Successfully logged into the Application -- PASS");
		}
		else
		{
			System.out.println("LogIn Failed -- FAIL");
		}
		
		driver.close();
	}
}
