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
	
	
	@FindBy(xpath="//*[contains(@id,'mat-select-14')]")
	WebElement rolefield;
	
	@FindBy(xpath="//*[contains(text(),'3.COORDIN')]")
	WebElement role3coordin;
	
	@FindBy(xpath="//*[contains(@id,'mat-select-15')]")
	WebElement operatingfield;
	
	@FindBy(xpath="//*[contains(text(),'5.OPER DEV')]")
	WebElement operating5operdev;
	
	@FindBy(xpath="//*[contains(@id,'mat-select-16')]")
	WebElement competencefield;
	
	@FindBy(xpath="//*[contains(text(),'GURU')]")
	WebElement competenceguru;
	
	@FindBy(xpath="//*[contains(@id,'mat-select-17')]")
	WebElement performancefield;
	
	@FindBy(xpath="//*[contains(text(),'HIGH')]")
	WebElement performancehigh;
	
	
	@FindBy(xpath="//*[contains(@id,'mat-select-18')]")
	WebElement talentfield;
	
	@FindBy(xpath="//*[contains(text(),'RISING')]")
	WebElement talentrising;
	
	
	
	@FindBy(xpath="//*[contains(@id,'mat-select-19')]")
	WebElement visionfield;
	
	@FindBy(xpath="//*[contains(text(),'MODEL')]")
	WebElement visionmodel;

	@FindBy(xpath="//*[contains(@id,'mat-select-20')]")
	WebElement attritionfield;
	
	@FindBy(xpath="//*[contains(text(),'LOW')]")
	WebElement attritionlow;
	
	@FindBy(xpath="//*[contains(@id,'mat-select-22')]")
	WebElement timeinrolefield;
	
	@FindBy(xpath="//*[contains(text(),'1-2')]")
	WebElement Timeinrole12;
	
	public Teamscanfield(WebDriver driver) {
		this.driver = driver;

	    //This initElements method will create all WebElements

	    PageFactory.initElements(driver, this);
		
		
	}
	
	public void addnew() {
		
		//newfield.click();
		namefield.sendKeys("Testname app");
		rolefield.click();
		role3coordin.click();
		operatingfield.click();
		operating5operdev.click();
		competencefield.click();
		competenceguru.click();
		performancefield.click();
		performancehigh.click();
		visionfield.click();
		visionmodel.click();
		talentfield.click();
		talentrising.click();
		attritionfield.click();
		attritionlow.click();
		timeinrolefield.click();
		Timeinrole12.click();
		
	}

}
