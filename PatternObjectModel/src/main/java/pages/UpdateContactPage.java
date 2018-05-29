package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class UpdateContactPage extends ProjectMethods{
	public UpdateContactPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver= driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	//Change the first name
	@FindBy(how=How.ID,using="updateContactForm_firstName")
	private WebElement eleUpdateFirstName;
	public UpdateContactPage enterUpdateFirstName(String dataUpdateFirstName)
	{
		type(eleUpdateFirstName, dataUpdateFirstName);
		return this;
	}
	
	//Click Update
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement eleUpdate;
	public ViewContactPage clickContactUpdate()
	{
		click(eleUpdate);
		return new ViewContactPage(driver, test);
	}
	
}
