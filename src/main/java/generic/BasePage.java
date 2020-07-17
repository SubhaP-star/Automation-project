package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {

	 public static WebDriver driver;
	 public BasePage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public static void verifyTitle(String eTitle)
	 {
		 try
		 {
			 WebDriverWait wait = new WebDriverWait(driver,20);
			 wait.until(ExpectedConditions.titleIs(eTitle));
			 Reporter.log("Title is Matched"+eTitle,true);	
		 }
	 catch(Exception e)
		 {
		 Reporter.log("Title is not Matched",true);
	 }
	 }
	
public static void ElementisPresent(WebElement element)
{
	try
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is visible"+element,true);
	}
	catch(Exception e)
	{
		Reporter.log("Element is not visible",true);
	}
	}
}
	 

