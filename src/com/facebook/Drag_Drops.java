package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver DT = new ChromeDriver();
		
		DT.get("http://leafground.com/pages/drop.html");
		
		WebElement Dragu = DT.findElement(By.id("draggable"));
		
		
		WebElement Drope = DT.findElement(By.id("droppable"));
		
		Actions q = new Actions(DT);
		
		q.dragAndDrop(Dragu, Drope).build().perform();
		
		System.out.println("launch Successfully");
		
		
	}

}
