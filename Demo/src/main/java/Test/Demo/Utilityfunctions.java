 package Test.Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Utilityfunctions extends BrowserSetup  
{
	public static  String  TestConfiguration(String key) throws IOException
	{
		String filepath="./TestConfiguration/Config.properties";
		FileInputStream fis= new FileInputStream(filepath);
		
		//properties
		Properties prpofile= new Properties();
		prpofile.load(fis);
		String value =prpofile.getProperty(key);
		return value;
		
		
	}

	public static void Sendkeys(WebElement element ,String value)
	{
		element.sendKeys(value);
	}

	public static void Req(WebElement element1)
	{
		element1.click();
    }

	public static void Select_byindex(WebElement element , int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public static void Select_bytext(WebElement element , String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);;
	}
	public static void Select_byvalue(WebElement element , String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	
}
