package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver D2 = new ChromeDriver();
		
		D2.get ("https://www.facebook.com/");
		
		WebElement FD = D2.findElement(By.id("email"));
		FD.sendKeys("Stranger@gmail.com");
		
		WebElement FDS = D2.findElement(By.id("pass"));
		FDS.sendKeys("123321");
		
		WebElement login = D2.findElement(By.name("login"));
		
		boolean displayed = login.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = login.isEnabled();
		System.out.println(enabled);
		
		boolean selected = login.isSelected();
		System.out.println(selected);
		
		String text = login.getText();
		System.out.println(text);
		
		String attribute = login.getAttribute("class");
		System.out.println(attribute);
		
		System.out.println("Web window launch Sucessfully");
	
		
		WebElement QFDS = D2.findElement(By.id("pass"));
		QFDS.clear();
	
	}

}
