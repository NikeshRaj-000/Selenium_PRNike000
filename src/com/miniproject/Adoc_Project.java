package com.miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adoc_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		WebDriver D2 = new ChromeDriver();
		D2.get("https://adactinhotelapp.com/");
		D2.findElement(By.id("username")).sendKeys("Deve8072");
		D2.findElement(By.id("password")).sendKeys("Dev0987@@");
		D2.findElement(By.id("login")).click();
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("    ");		
		System.out.println("Web window Testinglaunch Successfull");
		
	}

}
