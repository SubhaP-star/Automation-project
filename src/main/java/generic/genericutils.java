package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class genericutils extends BaseTest {
	public static void gselectbyindex(WebElement element,int n)
	{
		Select select = new Select(element);
		select.selectByIndex(n);
	}
	
	public static void gselectbyvalue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void gselectbyvisibletext(WebElement element, String v)
	{
		Select select = new Select(element);
		select.selectByVisibleText(v);
	}

	public static void hover(WebDriver driver,WebElement toelement)
	{
		Actions action = new Actions(driver);
		action.moveToElement(toelement).perform();
	}
}
