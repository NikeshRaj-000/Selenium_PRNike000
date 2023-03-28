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

public class Webelement_method02_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver D2 = new ChromeDriver();
		
		
		D2.get ("https://login.yahoo.com/account/create?specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
		
		
		WebElement ARQ1 = D2.findElement(By.xpath("(//input[@type='tel'])[1]"));
		ARQ1.sendKeys("67912035120");
		
		WebElement ARQ2 = D2.findElement(By.xpath("(//input[@type='tel'])[3]"));
		ARQ2.sendKeys("1999");
		
		WebElement ARQ3 = D2.findElement(By.xpath("(//input[@type='text'])[3]"));
		ARQ3.sendKeys("Wel_202100C");
		
		WebElement ARQ4 = D2.findElement(By.xpath("(//input[@type='text'])[4]"));
		ARQ4.sendKeys("Male");
		
		WebElement ZX1 = D2.findElement(By.xpath("//input[@type='password']"));
		ZX1.sendKeys("Chumaa_poduvom1");
		
		WebElement t_Btn = D2.findElement(By.xpath("//input[@type='button']"));
		t_Btn.click();
		
		WebElement ARQ5 = D2.findElement(By.xpath("(//input[@type='text'])[2]"));
		ARQ5.sendKeys("jr");
		
		WebElement ZX = D2.findElement(By.xpath("//input[@type='text']"));
		ZX.sendKeys("Welldone");
		
		WebElement ARQA = D2.findElement(By.xpath("//select[@type='select']"));
		
		Select sa = new Select(ARQA);
		sa.selectByVisibleText("American Samoa ‪(+1)‬");
		
		WebElement AR = D2.findElement(By.xpath("//select[@name='mm']"));
		
		Select s = new Select(AR);
		s.selectByVisibleText("July");
	
		WebElement ARQ = D2.findElement(By.xpath("(//input[@type='tel'])[2]"));
		ARQ.sendKeys("03");
		
		WebElement Createyouramazonaccount_Btn = D2.findElement(By.xpath("//button[@name='signup']"));
		Createyouramazonaccount_Btn.click();
		
		TakesScreenshot DO = (TakesScreenshot) D2;
		
		File Scr = DO.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Screencapture\\yahoo.png");
		
		FileUtils.copyFile(Scr,dest);

		System.out.println("Web window Screenshot launch Sucessfully");
			
		
	}

}
