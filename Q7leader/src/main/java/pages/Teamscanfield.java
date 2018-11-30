package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	//@FindBy(xpath="//*[contains(text(),'3.COORDIN')]")
	@FindBy(xpath="//*[contains(@class, 'mat-option-text') and text()='3.COORDIN']")
	WebElement role3coordin;
	
	@FindBy(xpath="//*[contains(@id,'mat-select-15')]")
	
	WebElement operatingfield;
	
	//@FindBy(xpath="//*[contains(text(),'5.OPER DEV')]")
	@FindBy(xpath="//*[contains(@class, 'mat-option-text') and text()='5.OPER DEV ']")
	WebElement operating5operdev;
	
	@FindBy(xpath="//*[contains(@id,'mat-select-16')]")
	WebElement competencefield;
	
	//@FindBy(xpath="//*[contains(text(),'GURU')]")
	@FindBy(xpath="//*[contains(@class, 'mat-option-text') and text()='GURU']")
	WebElement competenceguru;
	
	@FindBy(xpath="//*[contains(@id,'mat-select-17')]")
	WebElement performancefield;
	
	//@FindBy(xpath="//*[contains(text(),'HIGH')]")
	@FindBy(xpath="//*[contains(@class, 'mat-option-text') and text()='HIGH']")
	WebElement performancehigh;
	
	
	@FindBy(xpath="//*[contains(@id,'mat-select-18')]")
	WebElement talentfield;
	
	//@FindBy(xpath="//*[contains(text(),'RISING')]")
	@FindBy(xpath="//*[contains(@class, 'mat-option-text') and text()='RISING']")
	WebElement talentrising;
	
	
	
	@FindBy(xpath="//*[contains(@id,'mat-select-19')]")
	WebElement visionfield;
	
	//@FindBy(xpath="//*[contains(text(),'MODEL')]")
	@FindBy(xpath="//*[contains(@class, 'mat-option-text') and text()='MODEL']")
	WebElement visionmodel;

	@FindBy(xpath="//*[contains(@id,'mat-select-20')]")
	WebElement attritionfield;
	
	//@FindBy(xpath="//*[contains(text(),'LOW')]")
	@FindBy(xpath="//*[contains(@class, 'mat-option-text') and text()='LOW']")
	WebElement attritionlow;
	
	@FindBy(xpath="//*[contains(@id,'mat-select-22')]")
	WebElement timeinrolefield;
	
	//@FindBy(xpath="//*[@id=\"mat-option-212\"]")
	//@FindBy(xpath="//*[@id=\"mat-option-197\"]/span")
	@FindBy(xpath="//*[contains(@class, 'mat-option-text') and text()='2-3']")
	WebElement Timeinrole12;
	
	@FindBy(xpath="//*[contains(text(),'Team Scan')]")
	WebElement teamscanscore;
	
	@FindBy(xpath="//*[@id=\"mat-tab-content-0-2\"]/div/mat-body/div/div/table/tbody/tr[2]/td[3]")
	WebElement globalscore;
	
	//@FindBy(xpath="//*[@id='mat-tab-label-1-2' and @class ='mat-tab-label mat-ripple ng-star-inserted']")
	@FindBy(xpath="//*[contains(@class, 'mat-tab-label mat-ripple ng-star-inserted') and text()='Team Scan']")
	
	WebElement teamscanoption;
	
	
	
	//@FindBy(xpath="//*[@id=\"mat-tab-content-1-2\"]/div/mat-body/div/div/table/tbody/tr[1]/td[3]")
	@FindBy(xpath="//*[@class='reg-col px-0.5 ng-star-inserted']")
	WebElement score1;
	
	
	
	
	
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
	
	public String colortest() {

		WebDriverWait wait=new WebDriverWait(driver,30);
		 WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='reg-col px-0.5 ng-star-inserted']")));
		
		 String color =score1.getCssValue("background-color").trim();    
		 System.out.println("RGB_Color: " + color);
		 
		 return color;
	}
	
public void teamscansection(){
	
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	 WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'mat-tab-label mat-ripple ng-star-inserted') and text()='Team Scan']")));
	//teamscanscore.click();
	teamscanoption.click();
}
}
