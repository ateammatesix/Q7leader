package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Teamscanpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[contains(text(),'Automation')]")
	//@FindBy(xpath="//*[contains(text(),'tester')]")
	
	//@FindBy(xpath="//*[@id=\"page-container\"]/div/div/div/app-teamscan/div/div/app-sessionmanagement/div/mat-card/mat-card-content/div/div/div[1]/mat-card/mat-card-header/div[1]/mat-card-title")
	WebElement appname;
	
	@FindBy(xpath="//*[@id=\"page-container\"]/div/div/div/app-teamscan/div/div/app-sessionmanagement/div/mat-card/mat-card-content/div/div/div[1]/mat-card/mat-card-header/div[2]/mat-icon")
	WebElement apparrow;
	
	@FindBy(xpath="//*[@id=\"page-container\"]/div/div/div/app-teamscan/div/div/app-sessionmanagement/div/div/button/span")
	WebElement newbutton;
	
	
	
	public Teamscanpage(WebDriver driver) {
		this.driver = driver;

	    //This initElements method will create all WebElements

	    PageFactory.initElements(driver, this);
		
		
	}
	
	
	public void appclick()

	{
		String a =driver.getCurrentUrl();
		 System.out.println("CURRENT URL:"+a);
		 //apparrow.click();
		appname.click();
		// newbutton.click();
	}
	
	public void teamscanwait() {
		 WebDriverWait wait=new WebDriverWait(driver,20);
		 WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'tester')]")));
	}
}

