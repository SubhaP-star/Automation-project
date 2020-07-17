package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement Usertextbox;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement userpassword;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement SubmitButton;
	
	@FindBy(xpath="//b[.='PIM']")
	private WebElement PIM;
	
	@FindBy(xpath="//a[@id='menu_pim_addEmployee']")
	private WebElement AddEmployee;
	
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement Save;	
	

	public void setUsertextbox(String un)
	{
		Usertextbox.sendKeys(un);
	}
	public void setuserpassword(String pwd)
	{
		 userpassword.sendKeys(pwd);
	}
	public void setAddEmployee()
	{
		AddEmployee.click();
	}
	
	public void setPIM()
	{
		PIM.click();
	}
	public void setSubmitButton()
	{
		SubmitButton.click();
	}
	
	
	public void setFirstName(String fn)
	{
		FirstName.sendKeys(fn);
	}
	public void setLastName(String ln)
	{
		LastName.sendKeys(ln);
	}
	public void setSave()
	{
		Save.click();
	}

}
