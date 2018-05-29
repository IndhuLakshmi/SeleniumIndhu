package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

	public FindLeadsPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	public FindLeadsPage enterFirstName(String dataFirstName) {
		type(eleFirstName,dataFirstName);
		return this;
	}

	//clickFindLeadButton
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadButton;
	public FindLeadsPage clickFindLeadButton() {
		click(eleFindLeadButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	//click first resulting lead
	@FindBy(how=How.XPATH,using="(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")
	private WebElement eleFirstLead;
	public ViewLeadPage clickFirstLead() {
		click(eleFirstLead);
		return new ViewLeadPage(driver, test); //what page u need to navigate
	}

	//Click Email Tab
	@FindBy(how=How.XPATH,using="(//span[@class='x-tab-strip-text '])[3]")
	private WebElement eleClickEmail;
	public FindLeadsPage clickEmailTab() {
		click(eleClickEmail);
		return this;
	}

	//enter Email
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEmail;
	public FindLeadsPage enterEmail(String dataEmail) {
		type(eleEmail,dataEmail);
		return this;
	}

	//Get Text of First Name
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")
	private WebElement eleGetFirstName;
	public String getFirstName() {
		//I need to get the First Link Id name. so declare "public static String firstNameText" -- in SeMethods
		firstNameText = getText(eleGetFirstName);
		System.out.println("FirstNameText_Email: "+firstNameText );
		return firstNameText;
	}

	//click First lead
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")
	private WebElement eleFirstLink;
	public ViewLeadPage clickFirstlink() {
		click(eleFirstLink);
		return new ViewLeadPage(driver, test);
	}

	//verifyPartialText

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")
	private WebElement eleFirstLinkName;
	public FindLeadsPage verifyPartialText_DuplicateLead(String firstNameText1) {
		verifyPartialText(eleFirstLinkName, firstNameText1);
		return this;
	}

	//Click Phone Tab
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhoneTab;
	public FindLeadsPage clickPhoneTab() {
		click(elePhoneTab);
		return this;
	}


	//enter Country code
	@FindBy(how=How.NAME,using="phoneCountryCode")
	private WebElement eleCountryCode;
	public FindLeadsPage enterCountryCode(String dataCountryCode) {
		type(eleCountryCode,dataCountryCode);
		return this;
	}

	//enter Area code
	@FindBy(how=How.NAME,using="phoneAreaCode")
	private WebElement eleAreaCode;
	public FindLeadsPage enterAreaCode(String dataAreaCode) {
		type(eleAreaCode,dataAreaCode);
		return this;
	}

	//enter PhoneNumber
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elePhoneNumber;
	public FindLeadsPage enterPhoneNumber(String dataPhoneNumber) {
		type(elePhoneNumber,dataPhoneNumber);
		return this;
	}
	//get Deleteleadid
	@FindBy(how=How.XPATH,using="(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")
	private WebElement eleLeadID;
	public String getDeleteLeadID() {
		deleteleadLeadID = getText(eleLeadID);
		return deleteleadLeadID;
		}
	
	//Click First LeadId
	@FindBy(how=How.XPATH,using="(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")
	private WebElement eleFirstLeadID;
	public ViewLeadPage clickFirstLeadId() {
		click(eleFirstLeadID);
		return new ViewLeadPage(driver, test);
				
		}
	
	//enterLeadID
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eledeleteLeadID;
	public FindLeadsPage enterDeleteLeadID_FindLeadPage(String datadeleteLeadID) {
		type(eledeleteLeadID,datadeleteLeadID);
		return this;
				
		}
	
	//verifyExactText

		@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
		private WebElement eleNorecordsText;
		public FindLeadsPage verifyExactText(String dataexactText) {
			verifyExactText(eleNorecordsText,dataexactText);
			return this;
		}
	
	
}
