package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

//Extends Project Methods
public class TC004_CreateLeadAllFields extends ProjectMethods{
	
	//At very first we need to give all the information related to this test case like below
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004";
		testCaseName = "TC004_CreateLeadAllFields";
		testDescription = "To Enter All details in Create Leads Page";
		category= "Smoke";
		authors	="Indhu";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadAllFileds(String userName,String passWord,String companyName,String firstName,String lastName,String source,String marketingCampaignId,String firstNameLocal,String lastNameLocal,String personalTitle,String generalProfTitle,String departmentName,String annualRevenue,String currencyUomId,String industryEnumId,String numberEmployees,String tickerSymbol,String ownershipEnumId,String sicCode,String description,String importantNote,String primaryPhoneCountryCode,String primaryPhoneAreaCode,String primaryPhoneExtension,String primaryPhoneNumber,String primaryPhoneAskForName,String primaryEmail,String primaryWebUrl,String generalToName,String generalAttnName,String generalAddress1,String generalAddress2,String generalCity,String generalPostalCode,String generalPostalCodeExt,String generalCountryGeoId,String generalStateProvinceGeoId,String expectedText)
	{
		//need to call the first page what we need to have first for our test case
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.typeComapnyName(companyName)
		.typeFirstName(firstName)
		.typeLastName(lastName)
		.selectSource(source)
		.selectmarketingCampaignId(marketingCampaignId)
		.typeFirstLocalName(firstNameLocal)
		.typedataLastNameLocal(lastNameLocal)
		.typepersonalTitle(personalTitle)
		.typegeneralProfTitle(generalProfTitle)
		.typedepartmentName(departmentName)
		.typeannualRevenue(annualRevenue)
		.selectCurrencyUomId(currencyUomId)
		.selectindustryEnumId(industryEnumId)
		.typenumberEmployees(numberEmployees)
		.typetickerSymbol(tickerSymbol)
		.typeownershipEnumId(ownershipEnumId)
		.typesicCode(sicCode)
		.typedescription(description)
		.typeimportantNote(importantNote)
		.typeprimaryPhoneCountryCode(primaryPhoneCountryCode)
		.typeprimaryPhoneAreaCode(primaryPhoneAreaCode)
		.typeprimaryPhoneExtension(primaryPhoneExtension)
		.typeprimaryPhoneNumber(primaryPhoneNumber)
		.typeprimaryPhoneAskForName(primaryPhoneAskForName)
		.typeprimaryEmail(primaryEmail)
		.typeprimaryWebUrl(primaryWebUrl)
		.typegeneralToName(generalToName)
		.typegeneralAttnName(generalAttnName)
		.typegeneralAddress1(generalAddress1)
		.typegeneralAddress2(generalAddress2)
		.typegeneralCityl(generalCity)
		.typegeneralPostalCode(generalPostalCode)
		.typegeneralPostalCodeExt(generalPostalCodeExt)
		//select Country(wait 5 min till state has loaded) then select State
		.typegeneralCountryGeoId(generalCountryGeoId)
		.typegeneralStateProvinceGeoId(generalStateProvinceGeoId)
		.clickCreateLeadSubmit()
		.verifyViewLeadFirstName(expectedText);
	}
}
