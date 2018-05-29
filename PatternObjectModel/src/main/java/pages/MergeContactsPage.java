package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeContactsPage extends ProjectMethods{
	
	public MergeContactsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		

	}
	
	//click From Icon
		@FindBy(how=How.XPATH,using="//img[@src='/images/fieldlookup.gif']")
		private WebElement eleFromIcon;
		public MergeContactLookupPage clickFromIcon()
		{
			click(eleFromIcon);
			switchToWindow(2);
			return new MergeContactLookupPage(driver, test);
		}
		
		//click To Icon
		@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
		private WebElement eleToIcon;
		public MergeContactLookupPage clickToIcon()
		{
			click(eleToIcon);
			switchToWindow(2);
			return new MergeContactLookupPage(driver, test);
		}
		
		//click Merge Button
			@FindBy(how=How.LINK_TEXT,using="Merge")
			private WebElement eleMergeButton;
			public MergeContactsPage clickMergeButton()
			{
				click(eleMergeButton);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				return this;
	}
			//get Alert
			public ViewContactPage mergeAlert()
			{
				alertText = getAlertText();
				if(alertText.equalsIgnoreCase("Are you sure?"))
				{
					acceptAlert();
				}
				
				return new ViewContactPage(driver, test);
			}

	
}
