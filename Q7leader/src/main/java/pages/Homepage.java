package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class Homepage {
	
	WebDriver driver;

	
@FindBy(xpath="//*[contains(@name,'email')]")
WebElement username;

@FindBy(xpath="//*[contains(@name,'password')]")
WebElement password;

@FindBy(xpath="//*[@id=\"app-main\"]/my-page-login/div/div/div/div/form/fieldset/div[4]/button")
WebElement signin;




public Homepage(WebDriver driver){

    this.driver = driver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);
}




public Dashboard logintoq7(String u,String p) throws InterruptedException{

	//Loginedpage login = null;

    //this.uname(u);
	//uname(u);
	username.sendKeys(u);


   // this.pass(p);
	password.sendKeys(p);


    //this.signinclick();
	signin.click();
	
	return new Dashboard(driver);

}         

}