package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ContactsPage extends ProjectMethods{
	
	public ContactsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		

	}

	//Click Find Contacts
	@FindBy(how=How.LINK_TEXT,using="Find Contacts")
	private WebElement eleFindContacts;
	public FindContactsPage clickFindContacts() {
		click(eleFindContacts);
		return new FindContactsPage(driver, test);
	}
	
	//Click Find MergeContacts
		@FindBy(how=How.LINK_TEXT,using="Merge Contacts")
		private WebElement eleMergeContacts;
		public MergeContactsPage clickMergeContacts() {
			click(eleMergeContacts);
			return new MergeContactsPage(driver, test);
		}
}
