package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	//Run As - Convert To TestNg - XML
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLead";
		testDescription = "To Enter Mandatory details in Create Leads Page";
		category= "Sanity";
		authors	="Indhu";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord,String cmpyName,String frstName, String lstName,String exactText) {
		
	
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.typeComapnyName(cmpyName)
		.typeFirstName(frstName)
		.typeLastName(lstName)
		.clickCreateLeadSubmit()
		.verifyViewLeadFirstName(exactText);
		System.out.println("Successfully completed Create Lead _ TC003");
	
		
	}

}
