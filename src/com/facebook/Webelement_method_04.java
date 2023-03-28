package com.facebook;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelement_method_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver D4 = new ChromeDriver();
		
		D4.get("https://letcode.in/dropdowns");
		
		WebElement Mult = D4.findElement(By.xpath("//select[@id='superheros']"));
		
		Select s1 = new Select(Mult);
		
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
		
		System.out.println(" ----Get all Options------ ");
		System.out.println(" ");
		List<WebElement> op = s1.getOptions();

		// For Each loop
		for (WebElement getop : op) {
			System.out.println(getop.getText());
			System.out.println("-----------");}
		// For Each loop alter iterator
		
		System.out.println("    ");	
		System.out.println(" ----iterator with get option-- ");	
		Iterator<WebElement> ite = s1.getOptions().iterator();
		
		while (ite.hasNext()) {
			System.out.println(ite.next().getText());
		}
		System.out.println("    ");
		
		System.out.println(" ----iterator with getAllSelectedOptions---- ");
		
		Iterator<WebElement> ite1 = s1.getAllSelectedOptions().iterator();
		while (ite1.hasNext()) {
			
			System.out.println(ite1.next().getText());
		} 
		System.out.println("    ");
		System.out.println(" ---- getFirstSelectedOption---- ");
		WebElement fts = s1.getFirstSelectedOption();
		System.out.println(fts.getText());
		
		System.out.println("    ");		
		System.out.println("Web window Screenshot launch Successfully");
	}}		

