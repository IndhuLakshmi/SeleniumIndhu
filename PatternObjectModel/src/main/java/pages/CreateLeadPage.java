package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	//Create constructor to get Driver and ExtentTest - Run sequentially no need to give driver and test use default constructor
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	public CreateLeadPage typeComapnyName(String dataCompanyName) {
		type(eleCompanyName,dataCompanyName);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	public CreateLeadPage typeFirstName(String dataFirstName) {
		type(eleFirstName,dataFirstName);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastName;
	public CreateLeadPage typeLastName(String dataLastName) {
		type(elelastName,dataLastName);
		return this;
	}

	//Source
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")

	private WebElement eleSourceID;
	public CreateLeadPage selectSource(String dataSourceID)
	{
		selectDropDownUsingText(eleSourceID, dataSourceID);
		takeSnap();
		return this;
	}

	//MarketComapign
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	private WebElement eleCampaignId;
	public CreateLeadPage selectmarketingCampaignId(String dataMarketingCampaignId)
	{
		selectDropDownUsingText(eleCampaignId, dataMarketingCampaignId);
		takeSnap();
		return this;

	}

	//firstNameLocal
	@FindBy(how=How.ID,using="createLeadForm_firstNameLocal")
	private WebElement eleFirstNameLocal;
	public CreateLeadPage typeFirstLocalName(String dataFirstNameLocal)
	{
		type(eleFirstNameLocal,dataFirstNameLocal);
		takeSnap();
		return this;
	}
	//lastNameLocal
	@FindBy(how=How.ID,using="createLeadForm_lastNameLocal")
	private WebElement eleLastNameLocal;
	public CreateLeadPage typedataLastNameLocal(String dataLastNameLocal)
	{
		type(eleLastNameLocal,dataLastNameLocal);
		takeSnap();
		return this;
	}

	//personalTitle
	@FindBy(how=How.ID,using="createLeadForm_personalTitle")
	private WebElement elepersonalTitle;
	public CreateLeadPage typepersonalTitle(String datapersonalTitle)
	{
		type(elepersonalTitle,datapersonalTitle);
		takeSnap();
		return this;
	}
	//generalProfTitle
	@FindBy(how=How.ID,using="createLeadForm_generalProfTitle")
	private WebElement elegeneralProfTitle;
	public CreateLeadPage typegeneralProfTitle(String datageneralProfTitle)
	{
		type(elegeneralProfTitle,datageneralProfTitle);
		takeSnap();
		return this;
	}
	//departmentName
	@FindBy(how=How.ID,using="createLeadForm_departmentName")
	private WebElement eledepartmentName;
	public CreateLeadPage typedepartmentName(String datadepartmentName)
	{
		type(eledepartmentName,datadepartmentName);
		takeSnap();
		return this;
	}
	//annualRevenue
	@FindBy(how=How.ID,using="createLeadForm_annualRevenue")
	private WebElement eleannualRevenue;
	public CreateLeadPage typeannualRevenue(String dataannualRevenue)
	{
		type(eleannualRevenue,dataannualRevenue);
		takeSnap();
		return this;
	}

	//createLeadForm_currencyUomId
	@FindBy(how=How.ID,using="createLeadForm_currencyUomId")
	private WebElement elecurrencyUomId;
	public CreateLeadPage selectCurrencyUomId(String dataCurrencyUomId)
	{
		selectDropDownUsingIndex(elecurrencyUomId, Integer.parseInt(dataCurrencyUomId));
		takeSnap();
		return this;
	}
	//createLeadForm_industryEnumId
	@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement eleindustryEnumId;
	public CreateLeadPage selectindustryEnumId(String dataindustryEnumId)
	{
		selectDropDownUsingIndex(eleindustryEnumId, Integer.parseInt(dataindustryEnumId));
		takeSnap();
		return this;
	}

	//numberEmployees
	@FindBy(how=How.ID,using="createLeadForm_numberEmployees")
	private WebElement elenumberEmployees;
	public CreateLeadPage typenumberEmployees(String datanumberEmployees)
	{
		type(elenumberEmployees,datanumberEmployees);
		takeSnap();
		return this;
	}

	//tickerSymbol
	@FindBy(how=How.ID,using="createLeadForm_tickerSymbol")
	private WebElement eletickerSymbol;
	public CreateLeadPage typetickerSymbol(String datatickerSymbol)
	{
		type(eletickerSymbol,datatickerSymbol);
		takeSnap();
		return this;
	}

	//ownershipEnumId
	@FindBy(how=How.ID,using="createLeadForm_ownershipEnumId")
	private WebElement eleownershipEnumId;
	public CreateLeadPage typeownershipEnumId(String dataownershipEnumId)
	{
		selectDropDownUsingText(eleownershipEnumId,dataownershipEnumId);
		takeSnap();
		return this;
	}

	//sicCode
	@FindBy(how=How.ID,using="createLeadForm_sicCode")
	private WebElement elesicCode;
	public CreateLeadPage typesicCode(String datasicCode)
	{
		type(elesicCode,datasicCode);
		takeSnap();
		return this;
	}

	//createLeadForm_description
	@FindBy(how=How.ID,using="createLeadForm_description")
	private WebElement eledescription;
	public CreateLeadPage typedescription(String datadescription)
	{
		type(eledescription,datadescription);
		takeSnap();
		return this;
	}

	//createLeadForm_importantNote
	@FindBy(how=How.ID,using="createLeadForm_importantNote")
	private WebElement eleimportantNote;
	public CreateLeadPage typeimportantNote(String dataimportantNote)
	{
		type(eleimportantNote,dataimportantNote);
		takeSnap();
		return this;
	}

	//createLeadForm_primaryPhoneCountryCode
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneCountryCode")
	private WebElement eleprimaryPhoneCountryCode;
	public CreateLeadPage typeprimaryPhoneCountryCode(String dataprimaryPhoneCountryCode)
	{
		type(eleprimaryPhoneCountryCode,dataprimaryPhoneCountryCode);
		takeSnap();
		return this;
	}
	//primaryPhoneAreaCode
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneAreaCode")
	private WebElement eleprimaryPhoneAreaCode;
	public CreateLeadPage typeprimaryPhoneAreaCode(String dataprimaryPhoneAreaCode)
	{
		type(eleprimaryPhoneAreaCode,dataprimaryPhoneAreaCode);
		takeSnap();
		return this;
	}
	//primaryPhoneExtension
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneExtension")
	private WebElement eleprimaryPhoneExtension;
	public CreateLeadPage typeprimaryPhoneExtension(String dataprimaryPhoneExtension)
	{
		type(eleprimaryPhoneExtension,dataprimaryPhoneExtension);
		takeSnap();
		return this;
	}
	//primaryPhoneNumber
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement eleprimaryPhoneNumber;
	public CreateLeadPage typeprimaryPhoneNumber(String dataprimaryPhoneNumber)
	{
		type(eleprimaryPhoneNumber,dataprimaryPhoneNumber);
		takeSnap();
		return this;
	}
	//primaryPhoneAskForName
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneAskForName")
	private WebElement eleprimaryPhoneAskForName;
	public CreateLeadPage typeprimaryPhoneAskForName(String dataprimaryPhoneAskForName)
	{
		type(eleprimaryPhoneAskForName,dataprimaryPhoneAskForName);
		takeSnap();
		return this;
	}
	//primaryEmail
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleprimaryEmail;
	public CreateLeadPage typeprimaryEmail(String dataprimaryEmail)
	{
		type(eleprimaryEmail,dataprimaryEmail);
		takeSnap();
		return this;
	}

	//primaryWebUrl
	@FindBy(how=How.ID,using="createLeadForm_primaryWebUrl")
	private WebElement eleprimaryWebUrl;
	public CreateLeadPage typeprimaryWebUrl(String dataprimaryWebUrl)
	{
		type(eleprimaryWebUrl,dataprimaryWebUrl);
		takeSnap();
		return this;
	}
	
	//generalToName
	@FindBy(how=How.ID,using="createLeadForm_generalToName")
	private WebElement elegeneralToName;
	public CreateLeadPage typegeneralToName(String datageneralToName)
	{
		type(elegeneralToName,datageneralToName);
		takeSnap();
		return this;
	}
	
	//generalAttnName
	@FindBy(how=How.ID,using="createLeadForm_generalAttnName")
	private WebElement elegeneralAttnName;
	public CreateLeadPage typegeneralAttnName(String datageneralAttnName)
	{
		type(elegeneralAttnName,datageneralAttnName);
		takeSnap();
		return this;
	}
	
	//generalAddress1
	@FindBy(how=How.ID,using="createLeadForm_generalAddress1")
	private WebElement elegeneralAddress1;
	public CreateLeadPage typegeneralAddress1(String datageneralAddress1)
	{
		type(elegeneralAddress1,datageneralAddress1);
		takeSnap();
		return this;
	}
	
	//generalAddress2
	@FindBy(how=How.ID,using="createLeadForm_generalAddress2")
	private WebElement elegeneralAddress2;
	public CreateLeadPage typegeneralAddress2(String datageneralAddress2)
	{
		type(elegeneralAddress2,datageneralAddress2);
		takeSnap();
		return this;
	}
	
	//generalCity
	@FindBy(how=How.ID,using="createLeadForm_generalCity")
	private WebElement elegeneralCity;
	public CreateLeadPage typegeneralCityl(String datageneralCity)
	{
		type(elegeneralCity,datageneralCity);
		takeSnap();
		return this;
	}
	//generalPostalCode
	@FindBy(how=How.ID,using="createLeadForm_generalPostalCode")
	private WebElement elegeneralPostalCode;
	public CreateLeadPage typegeneralPostalCode(String datageneralPostalCode)
	{
		type(elegeneralPostalCode,datageneralPostalCode);
		takeSnap();
		return this;
	}
	//generalPostalCodeExt
	@FindBy(how=How.ID,using="createLeadForm_generalPostalCodeExt")
	private WebElement elegeneralPostalCodeExt;
	public CreateLeadPage typegeneralPostalCodeExt(String datageneralPostalCodeExt)
	{
		type(elegeneralPostalCodeExt,datageneralPostalCodeExt);
		takeSnap();
		return this;
	}
	//generalCountryGeoId
	@FindBy(how=How.ID,using="createLeadForm_generalCountryGeoId")
	private WebElement elegeneralCountryGeoId;
	public CreateLeadPage typegeneralCountryGeoId(String datageneralCountryGeoId)
	{
		selectDropDownUsingText(elegeneralCountryGeoId,datageneralCountryGeoId);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		takeSnap();
		return this;
	}
	
	//createLeadForm_generalStateProvinceGeoId
	@FindBy(how=How.ID,using="createLeadForm_generalStateProvinceGeoId")
	private WebElement elegeneralStateProvinceGeoId;
	public CreateLeadPage typegeneralStateProvinceGeoId(String datageneralStateProvinceGeoId)
	{
		selectDropDownUsingText(elegeneralStateProvinceGeoId,datageneralStateProvinceGeoId);
		takeSnap();
		return this;
	}
	
	//Submit Button
	@FindBy(how=How.CLASS_NAME, using="smallSubmit")
	private WebElement eleCreateLeadSubmit;
	public ViewLeadPage clickCreateLeadSubmit() {
		click(eleCreateLeadSubmit);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ViewLeadPage(driver, test);
	}
	
}
