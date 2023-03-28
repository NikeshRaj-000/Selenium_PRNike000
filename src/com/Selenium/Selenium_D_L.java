package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_D_L {

	
	public static void main(String[] args) {
		
		// Property setup
		System.setProperty("webdriver.chrome.driver",
				//value --> path
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Driver\\chromedriver.exe");
		
		//object
		//interface class  //object casting? is also known as Upcasting 
		WebDriver d = new ChromeDriver();
		d.get("https://web.whatsapp.com/");
		d.get("https://www.facebook.com/");
		System.out.println();
		
		
		
		
		
		
		
	}
}
