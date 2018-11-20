package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teamscanfield {
WebDriver driver;
	
	@FindBy(xpath="//*[contains(@class,'btn btn-block')]")
	WebElement newfield;
	
	
	////*[contains(@class,'mat-input-element mat-form-field-autofill-control ng-valid ng-touched ng-dirty')]
	////*[contains(@id,'mat-input-3')]
	@FindBy(xpath="//*[@id=\"mat-input-3\"]")
	WebElement namefield;
	

	public Teamscanfield(WebDriver driver) {
		this.driver = driver;

	    //This initElements method will create all WebElements

	    PageFactory.initElements(driver, this);
		
		
	}
	
	public void addnew() {
		
		newfield.click();
		namefield.sendKeys("Testname app");
		
	}

}
