package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadLookupPage extends ProjectMethods{
	
	public MergeLeadLookupPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME,using="firstName")
	private WebElement elefirstName_From;
	public MergeLeadLookupPage enterFirstName_From1(String datafirstName_From)
	{
		type(elefirstName_From,datafirstName_From);
		return this;
	}
	
	//click findleadbutton_lookup
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elelookupFindLeadButton;
	public MergeLeadLookupPage clicklookupFindLeadButton()
	{
		click(elelookupFindLeadButton);
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
	public String getLookup_FirstLead()
	{
		mergeLeadLookup_LeadId = getText(eleMergelookup_FirstLeadId);
		return mergeLeadLookup_LeadId;
	}
	
	//click First Lead Id
	@FindBy(how=How.XPATH,using="//a[@class='linktext']")
	private WebElement elefirstlead_Lookup;
	public MergeLeadPage clickfirstlead_Lookup()
	{
		clickWithNoSnap(elefirstlead_Lookup);
		switchToWindow(0);
		return new MergeLeadPage(driver, test);
	}
	
	//click Second Lead Id
		@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")
		private WebElement elesecondlead_Lookup;
		public MergeLeadPage clickSecondlead_Lookup()
		{
			clickWithNoSnap(elesecondlead_Lookup);
			switchToWindow(0);
			return new MergeLeadPage(driver, test);
		}
	
	
}
