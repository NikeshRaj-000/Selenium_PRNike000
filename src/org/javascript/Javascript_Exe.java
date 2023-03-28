package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver Js = new ChromeDriver();
		
		Js.get("https://www.amazon.in/");
		
		JavascriptExecutor Jse = (JavascriptExecutor) Js;
		
		
		Jse.executeScript("window.scrollBy(0,3000)");
		
		WebElement F = Js.findElement(By.xpath("//a[text()='Facebook']"));
		
		Jse.executeScript("arguments[0].scrollIntoView();", F);
		
		System.out.println("Web window launch Successfully");	
		
	
		
	}

}
