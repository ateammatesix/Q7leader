package pages;


	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Testscripts.Testhelper;

	public class Dashboard  {
		
		WebDriver driver;		
		
		
		@FindBy(xpath="//*[@id=\"app-main\"]/my-app-layout/my-app-sidenav/nav/section[2]/my-app-sidenav-menu/ul/li[5]/a")
		WebElement teamscanapp;
		
		//@FindBy(xpath="//*[contains(@class,'sidebar-content')]")
		@FindBy(xpath="//*[contains(@class,'app-sidebar bg-color-light')]")
		WebElement sidebar;
		
		
		
	
		
		public Dashboard(WebDriver driver) {
			this.driver = driver;

		    //This initElements method will create all WebElements

		    PageFactory.initElements(driver, this);
	
			
		}

		public String VerifyLogin() throws InterruptedException {
			
			String URL =driver.getCurrentUrl();
			System.out.println("q7leader url is"+URL);
			
			
	        //Thread.sleep(1000);
	        return URL;
		}
		
		public void dashboardwait() {
			 WebDriverWait wait=new WebDriverWait(driver,80);
			 WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-container\"]/my-app-header/section/div/div[4]/form/button")));
			
		}
		
		public void sidebaraction() {
			Actions action = new Actions(driver);
			//action.moveToElement(sidebar).doubleClick().build().perform();
			action.moveToElement(sidebar).build().perform();
			driver.findElement(By.xpath("//*[contains(text(),'Team Scan App')]")).click();
		}
		
		public void Teamscanlink()
		
		{
			String currenturl= driver.getCurrentUrl();
			teamscanapp.click();
			//driver.get("https://app-dev.q7leader.com/app/teamscan");
			
		}


		
		
		

}
