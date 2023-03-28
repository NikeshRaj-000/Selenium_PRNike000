package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver DF = new ChromeDriver();
		
		DF.get("http://demo.automationtesting.in/Frames.html");
		
		//DF.switchTo().frame(0); 
		
		DF.switchTo().frame("singleframe");
	
		WebElement D = DF.findElement(By.xpath("//input[@type='text']"));
		D.sendKeys("Welcome");
		
		DF.switchTo().defaultContent();
		
		DF.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement multi = DF.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		DF.switchTo().frame(multi);
		
		WebElement Sing = DF.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		DF.switchTo().frame(Sing);
		
		DF.findElement(By.xpath("//input[@type='text']")).sendKeys("Visit again");
		
		
		System.out.println("Web window launch Successfully");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
