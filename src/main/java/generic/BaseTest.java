package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst  {
	public static WebDriver driver;
	
	

	@BeforeMethod
	public void precondition()
	{	
		System.setProperty(CHROME_KEY, CHROME_VALUE); 
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@AfterMethod
	
	public void PostCondition()
	{
		driver.close();
	}
	}