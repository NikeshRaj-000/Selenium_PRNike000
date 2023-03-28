package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thread_0 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver DT = new ChromeDriver();
		
		DT.get("https://www.facebook.com/");
		
		WebElement LO = DT.findElement(By.id("email"));
		LO.sendKeys("Stranger");
		
		Thread.sleep(5000);
		
		
		WebElement Pa = DT.findElement(By.id("pass"));
		Pa.sendKeys("Str@123anger");
		
		
		System.out.println("Web window launch Successfully");		
		
	}
}
