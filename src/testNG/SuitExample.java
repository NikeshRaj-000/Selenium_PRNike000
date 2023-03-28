package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitExample {
	 WebDriver driver;
	 long startTime;
	 long endtime;
	 
	@BeforeSuite
	public void Launchbrowser () {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
	      driver = new ChromeDriver();
	}	
	
	@Test(priority=1)
	public void opengoogle() {
	
		driver.get("https://www.google.co.in/");
		
	}
	@Test(priority=2)
	public void openBing() {
			
			driver.get("https://www.bing.com");				
	}
	@Test(priority=0)
	public void openYahoo() {	
			driver.get("https://in.yahoo.com");
	}
	@AfterSuite
	public void closebrowser () {
		
		driver.quit();
		
		endtime = System.currentTimeMillis();
		long totaltime= endtime-startTime;
		System.out.println("Total time taken" + totaltime);
	
	}
	
	
	
	
	
}
