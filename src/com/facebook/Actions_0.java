package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver DT = new ChromeDriver();
		
		DT.get("http://automationpractice.com/index.php");
		
		WebElement Wo = DT.findElement(By.xpath("//a[@title='Women']"));
		
		Actions A = new Actions(DT);
		
		A.moveToElement(Wo).build().perform();
		
		WebElement Summer = DT.findElement(By.xpath("//a[@title='Summer Dresses']"));
		Summer.click();
		
	}
	

}
