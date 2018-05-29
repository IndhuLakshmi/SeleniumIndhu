package grid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class seleniumDragAndDrop {
	
	@Test
	public void actionsDrag()
	{
		
		//Run as XML - SeleniumActions.xml
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Sortable").click();
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item4 =driver.findElementByXPath("//li[text()='Item 4']");
		
		//To get the location of Y axis of the particular item
		int y4 = item4.getLocation().getY();
		
		//Advanced user interActions
		Actions act = new Actions(driver); 
		//Here we are moving the item y axis (downwards) so x axis-0
		act.dragAndDropBy(item1, 0,y4 ).perform();
	}

}
