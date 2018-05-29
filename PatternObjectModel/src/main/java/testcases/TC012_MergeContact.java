package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindContactsPage;
import pages.LoginPage;
import pages.MergeContactLookupPage;
import pages.MergeLeadLookupPage;
import wdMethods.ProjectMethods;

public class TC012_MergeContact extends ProjectMethods{
	
	@BeforeClass
	public void setData()
	{
		dataSheetName = "TC012";
		testCaseName = "TC012_MergeContact";
		testDescription = "MergeContact";
		category= "Smoke";
		authors	="IndhuLakshmi";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void mergeContact(String userName,String passWord,String firstName)
	{
		MergeContactLookupPage obj = new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickContacts()
		.clickMergeContacts()
		.clickFromIcon()
		.enterFirstName(firstName)
		.clicklookupFindContactButton();
		String leadId = obj.getLookup_FirstLead();
		obj.clickfirstlead_Lookup()
		.clickToIcon()
		.enterFirstName(firstName)
		.clicklookupFindContactButton()
		.clickSecondlead_Lookup()
		.clickMergeButton()
		.mergeAlert()
		.clickVCFindContacts()
		.enterContactId(leadId)
		.clickFindContactsButton()
		.verifyMsg("No records to display");
}
}
