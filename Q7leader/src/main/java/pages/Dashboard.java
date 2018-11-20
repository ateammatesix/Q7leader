package pages;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testscripts.Testhelper;

	public class Dashboard extends Testhelper {
		
		WebDriver driver;		
		
		
		@FindBy(xpath="//*[@id=\"app-main\"]/my-app-layout/my-app-sidenav/nav/section[2]/my-app-sidenav-menu/ul/li[5]/a")
		WebElement teamscanapp;
		
		public Dashboard(WebDriver driver) {
			this.driver = driver;

		    //This initElements method will create all WebElements

		    PageFactory.initElements(driver, this);
			
			
		}

		public String VerifyLogin() throws InterruptedException {
			
			String URL =driver.getCurrentUrl();
			System.out.println("q7leader url is"+URL);
			
			
	        Thread.sleep(1000);
	        return URL;
		}
		
		
		public void Teamscanlink()
		
		{
			String currenturl= driver.getCurrentUrl();
			teamscanapp.click();
			//driver.get("https://app-dev.q7leader.com/app/teamscan");
			
		}


		
		
		


}
