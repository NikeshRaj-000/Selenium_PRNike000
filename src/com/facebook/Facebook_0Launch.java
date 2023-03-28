package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_0Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
				
				WebDriver D2 = new ChromeDriver();				
				D2.get ("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

				WebElement Createyouramazonaccount_Btn = D2.findElement(By.id("createAccountSubmit"));
				Createyouramazonaccount_Btn.click();
			
				WebElement username = D2.findElement(By.name("customerName"));
				username.sendKeys("Stranger");
				
				WebElement mail = D2.findElement(By.name("email"));
				mail.sendKeys("Develops8072@gmail.com");
				
				WebElement pass = D2.findElement(By.id("ap_password"));
				pass.sendKeys("00");
				
				/*
				 * WebElement pass1 = D2.findElement(By.id("ap_password_check"));
				 * pass1.sendKeys("00");
				 */
			
				WebElement SendOTP_Btn = D2.findElement(By.id("continue"));
				SendOTP_Btn.click();		
				System.out.println("Webelement window launched Sucessfully");
			}

}
