
	package testNG;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class SuitExamples1 {

		
		@Test(priority=0)
		public void opengoogle() {
		long startTime = System.currentTimeMillis();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.quit();
			long endtime = System.currentTimeMillis();
			long totaltime= endtime-startTime;
			System.out.println("Total time taken" + totaltime);
		}
		@Test(priority=1)
		public void openBing() {
			long startTime = System.currentTimeMillis();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
				driver.get("https://www.bing.com");
				driver.quit();
				long endtime = System.currentTimeMillis();
				long totaltime= endtime-startTime;
				System.out.println("Total time taken" + totaltime);
				
			
		}
		@Test(priority=2)
		public void openYahoo() {
			long startTime = System.currentTimeMillis();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
				driver.get("https://in.yahoo.com");
				driver.quit();
				
				long endtime = System.currentTimeMillis();
				long totaltime= endtime-startTime;
				System.out.println("Total time taken" + totaltime);
	}
		
	}


