package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Excel;
import pom.HomePage;

public class TestScripts extends BaseTest {
	@Test (enabled=true)
	public void EmployeeTestCase() throws EncryptedDocumentException, IOException
	{
		HomePage p = new HomePage(driver);
		p.setUsertextbox(Excel.readData("Sheet1", 0, 1));
		p.setuserpassword(Excel.readData("Sheet1", 1, 1));
		p.setSubmitButton();
		BasePage.verifyTitle("OrangeHRM");
		p.setPIM();
		p.setAddEmployee();
		p.setFirstName("Subha");
		p.setLastName("Periasamy");
		p.setSave();
		
	}

}
