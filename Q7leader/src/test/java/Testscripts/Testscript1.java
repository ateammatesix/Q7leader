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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	    Dashboard dashobj=objLogin.logintoq7(u,p);
	    //dashobj.Teamscanlink();
	   
	    Thread.sleep(8000);
	}
	
	//@Test
	@Parameters({"username","password"})
	public void teamscanappcalcualtion(String u,String p) throws InterruptedException
	
	{
		Homepage objLogin = new Homepage(driver);	
	    Dashboard dashobj=objLogin.logintoq7(u,p);
	    //log.Teamscanlink();
	    dashobj.VerifyLogin();
	   dashobj.dashboardwait();
	    System.out.println("dashboard displayed");
	    //dashobj.sidebaraction();
	    Thread.sleep(12000);
		 driver.get("https://app-dev.q7leader.com/app/teamscan");	 
		 Teamscanpage objteamscan = new Teamscanpage(driver);
		 System.out.println("teamscan displayed");
		 objteamscan.teamscanwait();
		 objteamscan.appclick();	
		Thread.sleep(2000);
		 Teamscanfield objteamscanfield = new Teamscanfield(driver);
		 objteamscanfield.addnew();
		 objteamscanfield.teamscansection();
		 Thread.sleep(2000);
		 
		 String expectedcolor = "rgba(20, 204, 143, 1)";
		 String actualcolor=objteamscanfield.colortest();
		 
		 Assert.assertEquals(actualcolor,expectedcolor);
		 {
			    
		    	System.out.println("Color test  passed"+expectedcolor);
		    	}

	}
	
	
	
	
	
	@Test
	@Parameters({"username","password"})
	public void TSAcalfromnew(String u,String p) throws InterruptedException
	
	{
		Homepage objLogin = new Homepage(driver);	
	    Dashboard dashobj=objLogin.logintoq7(u,p);
	    //log.Teamscanlink();
	    dashobj.VerifyLogin();
	   dashobj.dashboardwait();
	    System.out.println("dashboard displayed");
	    //dashobj.sidebaraction();
	    Thread.sleep(12000);
		 driver.get("https://app-dev.q7leader.com/app/teamscan");	 
		 Teamscanpage objteamscan = new Teamscanpage(driver);
		 System.out.println("teamscan displayed");
		 objteamscan.teamscanwait();
		 objteamscan.appclick();	
		Thread.sleep(2000);
		 Teamscanfield objteamscanfield = new Teamscanfield(driver);
		 objteamscanfield.newdataentry();	 
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
		




