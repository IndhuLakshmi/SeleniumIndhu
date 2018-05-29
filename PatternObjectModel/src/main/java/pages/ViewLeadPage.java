package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	//Verify First name
	@FindBy(how=How.ID, using="viewLead_firstName_sp")
	private WebElement eleViewLeadFirstName;
	public ViewLeadPage verifyViewLeadFirstName(String dataexpectedText) {
	verifyPartialText(eleViewLeadFirstName, dataexpectedText);
	return this;
	}

	//Verify last name
	@FindBy(how=How.ID, using="viewLead_lastName_sp")
	private WebElement eleViewLeadLastName;
	public ViewLeadPage verifyViewLeadLirstName(String dataexpectedText) {
	verifyPartialText(eleViewLeadLastName, dataexpectedText);
	return this;
	}
	
	
	public ViewLeadPage verifyViewLeadTitle(String title)
	{
		verifyTitle(title);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleClickEdit;
	public UpdateLeadPage clickEdit() {
	click(eleClickEdit);
	return new UpdateLeadPage(driver,test);
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyName;
	public ViewLeadPage verifyCompanyName(String dataexpectedText ) {	
	verifyPartialText(eleCompanyName, dataexpectedText);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return this;
	}
	
	//Click duplicate
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleduplicateButton;
	public DuplicateLeadPage clickDuplicate() {
	click(eleduplicateButton);
	return new DuplicateLeadPage(driver,test);
	}
	
	//Click delete
		@FindBy(how=How.XPATH,using="//a[text()='Delete']")
		private WebElement eledeleteButton;
		public MyLeadsPage clickDelete() {
		click(eledeleteButton);
		return new MyLeadsPage(driver, test);
		}
		
		//Click findLeads Link
				@FindBy(how=How.LINK_TEXT,using="Find Leads")
				private WebElement elefindLeadLink;
				public FindLeadsPage clickFindLeadLink() {
				click(elefindLeadLink);
				return new FindLeadsPage(driver, test);
				}
}
