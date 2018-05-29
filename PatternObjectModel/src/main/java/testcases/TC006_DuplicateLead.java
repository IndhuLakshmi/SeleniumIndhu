package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	
	@BeforeClass
	public void setData()
	{
		dataSheetName = "TC006";
		testCaseName = "TC006_DuplicateLead";
		testDescription = "Create DuplicateLead";
		category= "Smoke";
		authors	="IndhuLakshmi";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName,String passWord,String email,String expectedTitle,String firstNameView,String lastName)
	{
		FindLeadsPage flobj = new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.clickEmailTab()
		.enterEmail(email)
		.clickFindLeadButton();
		String firstName = flobj.getFirstName();
		flobj.verifyPartialText_DuplicateLead(firstName)
		.clickFirstlink()
		.clickDuplicate()
		.verifyTitle_DuplicateLead(expectedTitle)
		.clickCreateLead()
		.verifyViewLeadFirstName(firstNameView)
		.verifyViewLeadLirstName(lastName);	
	}
}
