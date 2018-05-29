package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_EditLead extends ProjectMethods{

	
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005";
		testCaseName = "TC005_EditLead";
		testDescription = "To Edit Company Name";
		category= "Smoke";
		authors	="IndhuLakshmi";
		browserName ="chrome";
	}
	
	@Test(dataProvider = "fetchData")
	public void editLead(String userName,String passWord,String firstName,String title,String CompanyName,String expectedText)
	{
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(firstName)
		.clickFindLeadButton()
		.clickFirstLead()
		.verifyViewLeadTitle(title)
		.clickEdit()
		.updateCompanyName(CompanyName)
		.clickSubmit()
		.verifyCompanyName(expectedText);	
	}
}
