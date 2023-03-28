package com.Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_methoods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver D2 = new ChromeDriver();
		
		D2.get ("https://crypto.com/");
	
		D2.navigate().to("https://www.selenium.dev/about/");
		D2.navigate().back();
		D2.navigate().forward();
		D2.navigate().refresh();	
		D2.manage().window().maximize();
		D2.navigate().to("https://www.amazon.in/");
		System.out.println("Web window launch Sucessfully");
		
		
	}

}
