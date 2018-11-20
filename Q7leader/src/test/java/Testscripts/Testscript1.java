package Testscripts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.Homepage;
import pages.Loginedpage;
import pages.Teamscanfield;
import pages.Teamscanpage;


public class Testscript1 extends Testhelper {
	
	//@Test(priority=1)
	//@Parameters({"username","password"})
	public void logintest(String u,String p) throws InterruptedException{
		Homepage objLogin = new Homepage(driver);	
	    Dashboard log=objLogin.logintoq7(u,p);
	    //log.VerifyLogin();
	    String expectedturl="https://app-dev.q7leader.com/app/dashboard";
	    String actualurl=log.VerifyLogin();
	    Assert.assertEquals(actualurl,expectedturl);
	    {
	    	System.out.println("login testcase passed "+actualurl);
	    }
        Thread.sleep(3000);
   		}
	
	
	//@Test
	//@Parameters({"username","password"})
	public void teamscamapppage(String u,String p) throws InterruptedException{
		Homepage objLogin = new Homepage(driver);	
	    Dashboard log=objLogin.logintoq7(u,p);
	    //log.Teamscanlink();
	   
	    Thread.sleep(8000);
	}
	
	@Test
	@Parameters({"username","password"})
	public void teamscanapp(String u,String p) throws InterruptedException
	
	{
		Homepage objLogin = new Homepage(driver);	
	    Dashboard log=objLogin.logintoq7(u,p);
	    //log.Teamscanlink();
	   
	    Thread.sleep(8000);
		 driver.get("https://app-dev.q7leader.com/app/teamscan");
		 
		 Thread.sleep(10000);
		 
		 Teamscanpage objteamscan = new Teamscanpage(driver);
		 objteamscan.appclick();	
		 Thread.sleep(10000);
		 Teamscanfield objteamscanfield = new Teamscanfield(driver);
		 objteamscanfield.addnew();
		 Thread.sleep(5000);

	}
	    
	  
			@DataProvider
	    	public Object[][] getData()
	    	{
	    	//Rows - Number of times your test has to be repeated.
	    	//Columns - Number of parameters in test data.
	    	Object[][] data = new Object[3][2];

	    	// 1st row
	    	data[0][0] ="nino070";
	    	data[0][1] = "parayil007";

	    	// 2nd row
	    	data[1][0] ="test5user2";
	    	data[1][1] = "zxcvb";
	    	
	    	// 3rd row
	    	data[2][0] ="nino070q";
	    	data[2][1] = "parayil007q";

	    	return data;
	    	}
	    	
	   
			
}
		




