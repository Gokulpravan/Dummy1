package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Test.Demo.Utilityfunctions;

public class Select extends Utilityfunctions
{
	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
	Object[][] data=new Object[2][2];
	
		//List iteration
		data[0][0]=1;
		data[0][1]=2;
		
		data[1][0]=3;
		data[1][1]=4;
		
		
		return data;
	}

	@Test(dataProvider="TestData")
	public void Tc_03(int Index1,int Index2)
	{
		drive.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		
	    WebElement Sort =drive.findElement(By.xpath("//select[@name='products-orderby']"));
        
	    org.openqa.selenium.support.ui.Select SortBy = new org.openqa.selenium.support.ui.Select(Sort);
	    
	    Utilityfunctions.Select_byindex(Sort,Index1);
		
	}
}
