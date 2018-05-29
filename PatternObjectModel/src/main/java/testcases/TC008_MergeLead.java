package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MergeLeadLookupPage;
import wdMethods.ProjectMethods;

public class TC008_MergeLead extends ProjectMethods{
	@BeforeClass
	public void setData()
	{
		dataSheetName = "TC008";
		testCaseName = "TC008_MergeLead";
		testDescription = "Merge Lead ID's";
		category= "Smoke";
		authors	="IndhuLakshmi";
		browserName ="chrome";
	}
	@Test(dataProvider="fetchData")
	public void mergeLead(String userName,String passWord,String firstName_From)
	{
	
		MergeLeadLookupPage mlobj = new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickMergeLead()
		.clickFromIcon()
		.enterFirstName_From1(firstName_From)
		.clicklookupFindLeadButton();
		String fromLeadId = mlobj.getLookup_FirstLead();
		mlobj.clickfirstlead_Lookup()
		.clickToIcon1()
		.enterFirstName_From1(firstName_From)
		.clicklookupFindLeadButton()
		.clickSecondlead_Lookup()
		.clickMergeButton()
		.mergeAlert()
		.clickFindLeadLink()
		.enterDeleteLeadID_FindLeadPage(fromLeadId)
		.clickFindLeadButton()
		.verifyExactText("No records to display");	
}
}