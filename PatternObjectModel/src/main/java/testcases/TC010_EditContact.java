package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC010_EditContact extends ProjectMethods{

	@BeforeClass
	public void setData()
	{
		dataSheetName = "TC010";
		testCaseName = "TC010_EditContact";
		testDescription = "Edit Contact";
		category= "Smoke";
		authors	="IndhuLakshmi";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void editContact(String userName,String passWord,String fCFirstName,String vCTitle,String updateFirstName)
	{
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickContacts()
		.clickFindContacts()
		.enterFCFirstName(fCFirstName)
		.clickFindContactsButton()
		.clickFirstContact()
		.verifyVCTitle(vCTitle)
		.clickEdit()
		.enterUpdateFirstName(updateFirstName)
		.clickContactUpdate()
		.verifyName(updateFirstName);
	}
}
