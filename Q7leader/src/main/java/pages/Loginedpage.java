package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Testscripts.Testhelper;

public class Loginedpage extends Testhelper {
	
	WebDriver driver;
	
	
	
	
	
	public Loginedpage(WebDriver driver) {
		this.driver = driver;

	    //This initElements method will create all WebElements

	    PageFactory.initElements(driver, this);
		
		
	}


	
	public String VerifyLogin() throws InterruptedException {
		
		String URL =driver.getCurrentUrl();
		System.out.println("Demotours url is"+URL);
		
        Thread.sleep(3000);
        return URL;
	}
	
	

}


