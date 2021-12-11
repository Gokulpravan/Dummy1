package Test.Demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BrowserSetup {

	public WebDriver drive;
	String link="http://demowebshop.tricentis.com/";
	
	@BeforeClass
	public void Browser1() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
	    drive=new ChromeDriver();
		String Url = Utilityfunctions.TestConfiguration("AppUrl");
		drive.get(Url);
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void Ends()
	{
		drive.close();
	}

}
