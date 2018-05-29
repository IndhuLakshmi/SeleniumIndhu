package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewContactPage extends ProjectMethods{
	
	public ViewContactPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver= driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}
	
	//Verify the First name appears
	@FindBy(how=How.ID,using="viewContact_fullName_sp")
	private WebElement eleFullName;
	public ViewContactPage verifyFirstName(String dataFirstName)
	{
		verifyPartialText(eleFullName, dataFirstName);
		return this;
	}

	//Verify title of the page
	public ViewContactPage verifyVCTitle(String dataVCTitle)
	{
		verifyTitle(dataVCTitle);
		return this;
	}

	//Click Edit
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleVCEdit;
	public UpdateContactPage clickEdit()
	{
		click(eleVCEdit);
		return new UpdateContactPage(driver,test);
	}
	
	//Confirm the changed name appears
	@FindBy(how=How.ID,using="viewContact_fullName_sp")
	private WebElement eleUpdateFullName;
	public ViewContactPage verifyName(String dataFullName)
	{
		verifyPartialText(eleUpdateFullName, dataFullName);
		return this;
	}
	
	//Click Deactivate Contact
	@FindBy(how=How.LINK_TEXT,using="Deactivate Contact")
	private WebElement eleVCDeactivateContact;
	public ViewContactPage clickVCDeactivateContact()
	{
		click(eleVCDeactivateContact);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;	
	}
	
	//Accept Alert
	public ViewContactPage acceptDeactiveContact()
	{
		acceptAlert();
		return this;
	}
	
	//Confirm the message is Contact deactivated
	//This contact was deactivated as of
	@FindBy(how=How.XPATH,using="//span[@class='subSectionWarning']")
	private WebElement eleDeactivateMsg;
	public ViewContactPage DeactivateMsg(String dataDeactivateMsg)
	{
		verifyPartialText(eleDeactivateMsg, dataDeactivateMsg);
		return this;
	}
	
	//Click Find Contacts
	@FindBy(how=How.LINK_TEXT,using="Find Contacts")
	private WebElement eleVCFindContacts;
	public FindContactsPage clickVCFindContacts()
	{
		click(eleVCFindContacts);
		return new FindContactsPage(driver, test);
	}
}
