package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class UpdateLeadPage extends ProjectMethods{
	
	public UpdateLeadPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test= test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='companyName'])[2]")
	private WebElement eleCompanyName;
	public UpdateLeadPage updateCompanyName(String dataCompanyName)
	{
		type(eleCompanyName,dataCompanyName);
		return this;
	}

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmit;
	public ViewLeadPage clickSubmit()
	{
		click(eleSubmit);
		return new ViewLeadPage(driver, test);
	}
}
