package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindContactsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC011_ContactDeactivated extends ProjectMethods{
	
	@BeforeClass
	public void setData()
	{
		dataSheetName = "TC011";
		testCaseName = "TC011_ContactDeactivated";
		testDescription = "ContactDeactivated";
		category= "Smoke";
		authors	="IndhuLakshmi";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void contactDeactivated(String userName,String passWord,String fCFirstName,String vCTitle,String deactivateMsg)
	{
		FindContactsPage fCObj = new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickContacts()
		.clickFindContacts()
		.enterFCFirstName(fCFirstName)
		.clickFindContactsButton();
		String firstLeadId = fCObj.getFirstContactLeadID();
		fCObj.clickFirstContact()
		.verifyVCTitle(vCTitle)
		.clickVCDeactivateContact()
		.acceptDeactiveContact()
		.DeactivateMsg(deactivateMsg)
		.clickVCFindContacts()
		.enterContactId(firstLeadId)
		.clickFindContactsButton()
		.verifyMsg("No records to display");
		
	}

}
