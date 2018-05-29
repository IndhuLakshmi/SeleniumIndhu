package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC009_CreateContact extends ProjectMethods{
	
	@BeforeClass
	public void setData()
	{
		dataSheetName = "TC009";
		testCaseName = "TC009_CreateContact";
		testDescription = "Create Contact";
		category= "Smoke";
		authors	="IndhuLakshmi";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createContact(String userName,String passWord,String contactFirstName,String contactLastName,String firstNameLocal,String lastNameLocal,String contactSalutation,String contactTitle,String contactDept,String contactCurrency,String contactDesc,String contactNote,String contactAreaCode,String contactExtn,String contactEmail,String contactPhone,String contactAskForName,String contactToNameField,String contactAddress1,String contactCity,String contactZip,String contactZipExtn,String contactAttentionName,String contactAddr2,String contactCountry,String contactState)
	{
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickCreateContact()
		.enterContactFirstName(contactFirstName)
		.enterContactLastName(contactLastName)
		.enterContactfirstNameLocal(firstNameLocal)
		.enterContactlastNameLocal(lastNameLocal)
		.enterContactSalutation(contactSalutation)
		.enterContactTitle(contactTitle)
		.enterContactDept(contactDept)
		.selectContactCurrency(contactCurrency)
		.enterContactDesc(contactDesc)
		.enterContactNote(contactNote)
		.enterContactAreaCode(contactAreaCode)
		.enterContactExtn(contactExtn)
		.enterContactEmail(contactEmail)
		.enterContactPhone(contactPhone)
		.enterContactAskForName(contactAskForName)
		.verifyContactToNameField(contactToNameField)
		.enterContactAddress1(contactAddress1)
		.enterContactCity(contactCity)
		.enterContactZip(contactZip)
		.enterContactZipExtn(contactZipExtn)
		.enterContactAttentionName(contactAttentionName)
		.enterContactAddr2(contactAddr2)
		.selectContactCountry(contactCountry)
		.selectContactState(contactState)
		.clickCreateContactbutton()
		.verifyFirstName(contactFirstName);
		
	}

}
