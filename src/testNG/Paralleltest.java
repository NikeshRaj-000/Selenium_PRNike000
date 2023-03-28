package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paralleltest {
	

	@Test
	public void Opbingge() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
		
		

	}

	@Test
	public void Opagoogle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in"); driver.quit();
		
		
	}
	
	
}
/*
 * Thread.sleep(2000);
 */