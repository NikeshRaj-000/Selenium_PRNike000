package com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_method01_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver D2 = new ChromeDriver();
		
		D2.get ("https://login.yahoo.com/account/create?specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
		
		D2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ZX = D2.findElement(By.xpath("//input[@type='text']"));
		ZX.sendKeys("Welldone");
		
	
		WebElement ZXQ = D2.findElement(By.xpath("(//input[@type='text'])[2]"));
		ZXQ.sendKeys("oqlsjkk5");
		
		
		WebElement ZXW = D2.findElement(By.xpath("//input[@id='usernamereg-password']"));
		ZXW.sendKeys("mareoopskaljd");

		 WebElement QFDS = D2.findElement(By.name("birthYear"));
		 QFDS.sendKeys("1211");
		
		WebElement ZXQZQ = D2.findElement(By.xpath("//input[@name='userId']"));
		
		ZXQZQ.sendKeys("Testing0581");
		
		WebElement SendOTP_Btn = D2.findElement(By.name("signup"));
		SendOTP_Btn.click();
		
		System.out.println("Web window launch Successfully");
	
	
	
	
	
	
	
	
	}

}
