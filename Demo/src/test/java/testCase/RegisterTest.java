package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Test.Demo.Utilityfunctions;

public class RegisterTest extends Utilityfunctions
{

	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
	Object[][] data=new Object[2][4];
	
		//List iteration
	    data[0][0]="Gokul"; 
	     
	    data[0][1]="king";
		data[0][2]="king1998@gmail.com";
		data[0][3]="king@1998";
		
		
		//@nd iteration
		data[1][0]="Jitthan";
		data[1][1]="king";
		data[1][2]="kingking@gmail.com";
		data[1][3]="kdind";
		return data;
	}
	
	
	@Test(dataProvider="TestData")
	public void Tc_01(String FirstName, String LastName,String Email, String Password)
	{
		
		drive.findElement(By.xpath("//a[text()='Register']")).click();
		drive.findElement(By.xpath("(//input[@name='Gender'])[1]")).click();
	 
		drive.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(FirstName);
		
        drive.findElement(By.xpath("//input[@name='LastName']")).sendKeys(LastName);
		
		 drive.findElement(By.xpath("//input[@name='Email']")).sendKeys(Email);
		
		drive.findElement(By.xpath("//input[@name='Password']")).sendKeys(Password);
		
		 drive.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(Password);
		//Utilityfunctions.Sendkeys(snd5,"King");
		drive.findElement(By.xpath("//input[@name='register-button']")).click();
		
	}
}
