package testCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Test.Demo.Utilityfunctions;



public class LoginTest extends Utilityfunctions
{

	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
	Object[][] data=new Object[1][2];
	
		//List iteration
		data[0][0]="king1998@gmail.com";
		data[0][1]="king@1998";
		
		return data;
		
	}
	
		@Test(dataProvider="TestData")
		public void Tc_02(String Email, String Password) throws IOException
		{  
	     WebElement	login =	drive.findElement(By.xpath("//a[@href='/login']"));
	     Utilityfunctions.Req(login);
		drive.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		
		 drive.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);;
		
		WebElement login1 =drive.findElement(By.xpath("//input [@value='Log in']"));
	    Utilityfunctions.Req(login1);
	    
	   
	    
		}
}
