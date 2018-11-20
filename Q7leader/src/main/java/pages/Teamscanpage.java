package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teamscanpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[contains(text(),'Automation')]")
	WebElement appname;

	
	
	public Teamscanpage(WebDriver driver) {
		this.driver = driver;

	    //This initElements method will create all WebElements

	    PageFactory.initElements(driver, this);
		
		
	}
	
	
	public void appclick()
	{
		appname.click();
	}
}

