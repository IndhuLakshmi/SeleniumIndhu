package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateContactPage extends ProjectMethods{
	public CreateContactPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver = driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	//Enter First Name
	@FindBy(how=How.ID,using="firstNameField")
	private WebElement eleContactFirstName;
	public CreateContactPage enterContactFirstName(String dataContactFirstName) {
		type(eleContactFirstName,dataContactFirstName);
		return this;
	}

	//Enter Last Name
	@FindBy(how=How.ID,using="lastNameField")
	private WebElement eleContactLastName;
	public CreateContactPage enterContactLastName(String dataContactLastName) {
		type(eleContactLastName,dataContactLastName);
		return this;
	}

	//Enter firstNameLocal
	@FindBy(how=How.ID,using="createContactForm_firstNameLocal")
	private WebElement elefirstNameLocal;
	public CreateContactPage enterContactfirstNameLocal(String datafirstNameLocal) {
		type(elefirstNameLocal,datafirstNameLocal);
		return this;
	}

	//Enter lastNameLocal
	@FindBy(how=How.ID,using="createContactForm_lastNameLocal")
	private WebElement elelastNameLocal;
	public CreateContactPage enterContactlastNameLocal(String datalastNameLocal) {
		type(elelastNameLocal,datalastNameLocal);
		return this;
	}

	//Enter Salutation

	@FindBy(how=How.ID,using="createContactForm_personalTitle")
	private WebElement eleContactSalutation;
	public CreateContactPage enterContactSalutation(String dataContactSalutation) {
		type(eleContactSalutation,dataContactSalutation);
		return this;
	}

	//Enter Title
	@FindBy(how=How.ID,using="createContactForm_generalProfTitle")
	private WebElement eleContactTitle;
	public CreateContactPage enterContactTitle(String dataContactTitle) {
		type(eleContactTitle,dataContactTitle);
		return this;
	}

	//Enter Department
	@FindBy(how=How.ID,using="createContactForm_departmentName")
	private WebElement eleContactDept;
	public CreateContactPage enterContactDept(String dataContactDept) {
		type(eleContactDept,dataContactDept);
		return this;
	}

	//Choose Preferred Currency
	//INR - Indian Rupee
	@FindBy(how=How.ID,using="createContactForm_preferredCurrencyUomId")
	private WebElement eleContactCurrency;
	public CreateContactPage selectContactCurrency(String dataContactCurrency) {
		selectDropDownUsingText(eleContactCurrency,dataContactCurrency );
		return this;
	}

	//Enter Description
	@FindBy(how=How.ID,using="createContactForm_description")
	private WebElement eleContactDesc;
	public CreateContactPage enterContactDesc(String dataContactDesc) {
		type(eleContactDesc,dataContactDesc);
		return this;
	}

	//Enter Important Note
	@FindBy(how=How.ID,using="createContactForm_importantNote")
	private WebElement eleContactNote;
	public CreateContactPage enterContactNote(String dataContactNote) {
		type(eleContactNote,dataContactNote);
		return this;
	}

	//Enter Area Code
	@FindBy(how=How.ID,using="createContactForm_primaryPhoneAreaCode")
	private WebElement eleContactAreaCode;
	public CreateContactPage enterContactAreaCode(String dataContactAreaCode) {
		type(eleContactAreaCode,dataContactAreaCode);
		return this;
	}

	//Enter Extension	
	@FindBy(how=How.ID,using="createContactForm_primaryPhoneExtension")
	private WebElement eleContactExtn;
	public CreateContactPage enterContactExtn(String dataContactExtn) {
		type(eleContactExtn,dataContactExtn);
		return this;
	}

	//Enter E-Mail Address
	@FindBy(how=How.ID,using="createContactForm_primaryEmail")
	private WebElement eleContactEmail;
	public CreateContactPage enterContactEmail(String dataContactEmail) {
		type(eleContactEmail,dataContactEmail);
		return this;
	}

	//Enter Phone Number
	@FindBy(how=How.ID,using="createContactForm_primaryPhoneNumber")
	private WebElement eleContactPhone;
	public CreateContactPage enterContactPhone(String dataContactPhone) {
		type(eleContactPhone,dataContactPhone);
		return this;
	}

	//Enter Person to Ask For
	@FindBy(how=How.ID,using="createContactForm_primaryPhoneAskForName")
	private WebElement eleContactAskForName;
	public CreateContactPage enterContactAskForName(String dataContactAskForName) {
		type(eleContactAskForName,dataContactAskForName);
		return this;
	}

	//Verify firstName and lestName Appers in To Name field
	@FindBy(how=How.ID,using="generalToNameField")
	private WebElement eleContactToNameField;
	public CreateContactPage verifyContactToNameField(String dataContactToNameField) {

		verifyExactAttribute(eleContactToNameField, "value", dataContactToNameField);
		//If we use getText it ll display it in  report.GetText will not use to display the textbox value.By using ele.getAttribute("value") - we can display the value whatever present in the textbox
//		String Text = getText(eleContactToNameField);
//		if(Text.equals(dataContactToNameField))
//		{
//			System.out.println("passed_To name field");
//		}
//		else
//		{
//			System.out.println("Failed");
//		}
		return this;

	}

	//Enter the Address Line 1
	@FindBy(how=How.ID,using="createContactForm_generalAddress1")
	private WebElement eleContactAddress1;
	public CreateContactPage enterContactAddress1(String dataContactAddress1) {
		type(eleContactAddress1,dataContactAddress1);
		return this;
	}


	//Enter the City name
	@FindBy(how=How.ID,using="createContactForm_generalCity")
	private WebElement eleContactCity;
	public CreateContactPage enterContactCity(String dataContactCity) {
		type(eleContactCity,dataContactCity);
		return this;
	}

	//Enter Zip/Postal Code
	@FindBy(how=How.ID,using="createContactForm_generalPostalCode")
	private WebElement eleContactZip;
	public CreateContactPage enterContactZip(String dataContactZip) {
		type(eleContactZip,dataContactZip);
		return this;
	}

	//Enter Zip/Postal Code Extension
	@FindBy(how=How.ID,using="createContactForm_generalPostalCodeExt")
	private WebElement eleContactZipExtn;
	public CreateContactPage enterContactZipExtn(String dataContactZipExtn) {
		type(eleContactZipExtn,dataContactZipExtn);
		return this;
	}

	//Enter Attention Name
	@FindBy(how=How.ID,using="createContactForm_generalAttnName")
	private WebElement eleContactAttentionName;
	public CreateContactPage enterContactAttentionName(String dataContactAttentionName) {
		type(eleContactAttentionName,dataContactAttentionName);
		return this;
	}

	//Enter Address Line 2 (optional)
	@FindBy(how=How.ID,using="createContactForm_generalAddress2")
	private WebElement eleContactAddr2;
	public CreateContactPage enterContactAddr2(String dataContactAddr2) {
		type(eleContactAddr2,dataContactAddr2);
		return this;
	}

	//Choose Country
	@FindBy(how=How.ID,using="createContactForm_generalCountryGeoId")
	private WebElement eleContactCountry;
	public CreateContactPage selectContactCountry(String dataContactCountry) {
		selectDropDownUsingText(eleContactCountry,dataContactCountry);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	//Choose State/Province	
	@FindBy(how=How.ID,using="createContactForm_generalStateProvinceGeoId")
	private WebElement eleContactState;
	public CreateContactPage selectContactState(String dataContactState) {
		selectDropDownUsingIndex(eleContactState,Integer.parseInt(dataContactState));
		return this;
	}

	//Click Create Contact button
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleCreatecontact;
	public ViewContactPage clickCreateContactbutton() {
		click(eleCreatecontact);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ViewContactPage(driver, test);
	}
}





















