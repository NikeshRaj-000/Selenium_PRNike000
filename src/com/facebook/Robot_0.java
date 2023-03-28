package com.facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_0 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver DT = new ChromeDriver();
		
		DT.get("http://automationpractice.com/index.php");
		
		
		
		WebElement Wo = DT.findElement(By.xpath("//a[@title='Women']"));
		
		Actions A = new Actions(DT);
		
		A.moveToElement(Wo).build().perform();
		
		A.contextClick(Wo).build().perform();
		
		Robot R = new Robot();
		
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		
	//	R.keyPress(KeyEvent.VK_DOWN);
		//R.keyRelease(KeyEvent.VK_DOWN);
	
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Actioned");
		
		//WebElement Summer = DT.findElement(By.xpath("//a[@title='Summer Dresses']"));
		//Summer.click();
		
		
		
		
		
		
		
		
		
		
	}

}
