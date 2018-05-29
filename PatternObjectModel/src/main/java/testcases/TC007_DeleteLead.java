package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DeleteLead extends ProjectMethods{

	@BeforeClass
	public void setData()
	{
		dataSheetName = "TC007";
		testCaseName = "TC006_DeleteLead";
		testDescription = "Delete the Lead ID";
		category= "Smoke";
		authors	="IndhuLakshmi";
		browserName ="chrome";
	}


	@Test(dataProvider="fetchData")
	public void deleteLead(String userName,String passWord,String countryCode,String areaCode,String phoneNumber)
	{
		FindLeadsPage flobj = new LoginPage(driver, test)	
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.clickPhoneTab()
		.enterCountryCode(countryCode)
		.enterAreaCode(areaCode)
		.enterPhoneNumber(phoneNumber)
		.clickFindLeadButton();
		String firstLeadID = flobj.getDeleteLeadID();
		flobj.clickFirstLeadId()
		.clickDelete()
		.clickFindLead()
		.enterDeleteLeadID_FindLeadPage(firstLeadID)	
		.clickFindLeadButton()
		.verifyExactText("No records to display");
	}
}

