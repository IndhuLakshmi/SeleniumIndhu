package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{

	public MyHomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		

	}

	//Click Leads
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;
	public MyLeadsPage clickLeads() {
		click(eleLeads);
		return new MyLeadsPage(driver, test);
	}

	//Click Create Contact
	@FindBy(how=How.LINK_TEXT,using="Create Contact")
	private WebElement eleCreateContact;
	public CreateContactPage clickCreateContact() {
		click(eleCreateContact);
		return new CreateContactPage(driver, test);
	}
	
	//Click Contacts Link
		@FindBy(how=How.LINK_TEXT,using="Contacts")
		private WebElement eleContacts;
		public ContactsPage clickContacts() {
			click(eleContacts);
			return new ContactsPage(driver, test);
		}
}
