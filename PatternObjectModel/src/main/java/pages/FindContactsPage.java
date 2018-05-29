package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindContactsPage extends ProjectMethods{
	public FindContactsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		

	}
	
	//Enter first name
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFCFirstName;
	public FindContactsPage enterFCFirstName(String dataFCFirstName)
	{
		type(eleFCFirstName,dataFCFirstName);
		return this;
	}

	//Click Find Contacts button
	@FindBy(how=How.XPATH,using="//button[text()='Find Contacts']")
	private WebElement eleFindContactsButton;
	public FindContactsPage clickFindContactsButton()
	{
		click(eleFindContactsButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	//Click on first resulting Contacts
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")
	private WebElement eleFirstContact;
	public ViewContactPage clickFirstContact()
	{
		click(eleFirstContact);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ViewContactPage(driver, test);
}

	//Get First Resulting Lead id
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")
	private WebElement eleFirstContactLeadID;
	private String FirstContactLeadID;
	public String getFirstContactLeadID()
	{
		FirstContactLeadID = getText(eleFirstContactLeadID);
		return FirstContactLeadID;
	}
	
	//Enter Contacts ID
	
	@FindBy(how=How.XPATH,using="//div[@class='x-form-element']/input[@name='id']")
	private WebElement eleContactId;
	public FindContactsPage enterContactId(String dataContactId)
	{
		type(eleContactId,dataContactId);
		return new FindContactsPage(driver, test);
	}
	
	//Verify No records to display msg
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement eleVerifyMsg;
	public FindContactsPage verifyMsg(String dataVerifyMsg)
	{
		verifyExactText(eleVerifyMsg, dataVerifyMsg);
		return this;
	}
	
}
