package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeContactLookupPage extends ProjectMethods{

	public MergeContactLookupPage(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver= driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	
	//enter name
	@FindBy(how=How.NAME,using="firstName")
	private WebElement elefirstName;
	public MergeContactLookupPage enterFirstName(String datafirstName)
	{
		type(elefirstName,datafirstName);
		return this;
	}
	
	//click findContactsbutton_lookup
	@FindBy(how=How.XPATH,using="//button[text()='Find Contacts']")
	private WebElement elelookupFindContactButton;
	public MergeContactLookupPage clicklookupFindContactButton()
	{
		click(elelookupFindContactButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	//get firstName_MergeLookup_FirstLeadId
		@FindBy(how=How.XPATH,using="//a[@class='linktext']")
		private WebElement eleMergelookup_FirstLeadId;
		String mergeLContactLookup_LeadId = "";
		public String getLookup_FirstLead()
		{
			mergeLContactLookup_LeadId = getText(eleMergelookup_FirstLeadId);
			return mergeLContactLookup_LeadId;
		}
		
		//click First Lead Id
		@FindBy(how=How.XPATH,using="//a[@class='linktext']")
		private WebElement elefirstlead_Lookup;
		public MergeContactsPage clickfirstlead_Lookup()
		{
			clickWithNoSnap(elefirstlead_Lookup);
			switchToWindow(0);
			return new MergeContactsPage(driver, test);
		}
		
		//click Second Lead Id
			@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")
			private WebElement elesecondlead_Lookup;
			public MergeContactsPage clickSecondlead_Lookup()
			{
				clickWithNoSnap(elesecondlead_Lookup);
				switchToWindow(0);
				return new MergeContactsPage(driver, test);
			}
}


