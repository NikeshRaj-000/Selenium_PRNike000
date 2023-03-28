package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teas_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver D2 = new ChromeDriver();
		
		D2.get ("https://crypto.com/");
		
		// Get current window title
		
		String title = D2.getTitle();
		System.out.println(title);
		
		// get current url
		
		String currentUrl = D2.getCurrentUrl();
		System.out.println(currentUrl);
		
		System.out.println("Web window title and current Url launch Sucessfully");
		
		
		
		
	}

}
