package com.miniproject;

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

public class Adocmi_0 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		WebDriver D2 = new ChromeDriver();
		D2.get("https://adactinhotelapp.com/");
		D2.findElement(By.id("username")).sendKeys("Deve8072");
		D2.findElement(By.id("password")).sendKeys("Dev0987@@");
		D2.findElement(By.id("login")).click();
		
		WebElement Loc = D2.findElement(By.id("location"));
		Select s=new Select(Loc);
		s.selectByValue("London");
		
		WebElement Loc1 = D2.findElement(By.id("hotels"));
		Select s1=new Select(Loc1);
		s1.selectByValue("Hotel Hervey");
		
		WebElement Loc2 = D2.findElement(By.id("room_type"));
		Select s2=new Select(Loc2);
		s2.selectByValue("Deluxe");
		
		WebElement Loc3 = D2.findElement(By.id("room_nos"));
		Select s3=new Select(Loc3);
		s3.selectByValue("2");
		
		WebElement Dt = D2.findElement(By.id("datepick_in"));
		Dt.clear();
		Dt.sendKeys("01/01/2023");
		
		WebElement Dto = D2.findElement(By.id("datepick_out"));
		Dto.clear();
		Dto.sendKeys("02/02/2023");
	
		Thread.sleep(1200);
		WebElement Loc4 = D2.findElement(By.id("adult_room"));
		Select s4=new Select(Loc4);
		s4.selectByVisibleText("4 - Four");
			
		//WebDriverWait wait = new WebDriverWait(D2, 200);	
		//WebElement U = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='imgScrollBtn01_2']")));	
		//U.click();
		//Thread.sleep(1200);
		//U.click();
		//U.click();	
		WebElement Loc5 = D2.findElement(By.id("child_room"));
		Select s5=new Select(Loc5);
		s5.selectByIndex(2);
	
		D2.findElement(By.id("Submit")).click();	
		D2.findElement(By.id("radiobutton_0")).click();	
		D2.findElement(By.id("continue")).click();
		
		D2.findElement(By.name("first_name")).sendKeys("Deve");
		D2.findElement(By.name("last_name")).sendKeys("Jr");
		D2.findElement(By.name("address")).sendKeys("1 Hacker Way, Menlo Park, California, United States");
		D2.findElement(By.name("cc_num")).sendKeys("1237896547418520");
		
		WebElement Loc6 = D2.findElement(By.id("cc_type"));
		Select s6=new Select(Loc6);
		s6.selectByIndex(2);
		WebElement Loc7 = D2.findElement(By.id("cc_exp_month"));
		Select s7=new Select(Loc7);
		s7.selectByIndex(2);
		WebElement Loc8 = D2.findElement(By.id("cc_exp_year"));
		Select s8=new Select(Loc8);
		s8.selectByValue("2012");
		
		D2.findElement(By.name("cc_cvv")).sendKeys("741");
		
		WebElement Book = D2.findElement(By.xpath("(//input[@type='button'])[1]"));
		Book.click();
		
		TakesScreenshot ts=(TakesScreenshot) D2;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File op = new File("C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Screencapture\\Deve_Booking_confirmed.png");
		FileUtils.copyFile(scr, op);
		
		
		System.out.println("    ");		
		System.out.println("Web window Testinglaunch Successfull");
				
	}
}
