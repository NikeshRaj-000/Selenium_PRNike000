package com.facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelement_method03_Dropdown {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver D3 = new ChromeDriver();
		
		D3.get("https://letcode.in/dropdowns");
		
		WebElement Multi = D3.findElement(By.xpath("//select[@id='superheros']"));
		
		Select s1 = new Select(Multi);
		
		//boolean multiple = s1.isMultiple();	//System.out.println(multiple);
		
		if (s1.isMultiple()==true) {
			s1.selectByValue("aq");
			s1.selectByVisibleText("The Avengers");
			s1.selectByIndex(8);
			s1.selectByIndex(3);
			s1.selectByIndex(7);
			s1.deselectByIndex(2);
		} else {
			System.out.println("might be not a multiple dropdown");
		}
		TakesScreenshot DO = (TakesScreenshot) D3;
		
		File Scr = DO.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Screencapture\\multiple dropdown.png");
		
		FileUtils.copyFile(Scr,dest);
		
		System.out.println("Web window Screenshot launch Sucessfully");	
	}

}
