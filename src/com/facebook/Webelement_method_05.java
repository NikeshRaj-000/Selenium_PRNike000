package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_method_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Nikesh raj g\\\\eclipse-workspace\\\\Selenium_PR\\\\Drriver\\\\chromedriver.exe");
		
		WebDriver D5 = new ChromeDriver();
		
		D5.get("https://letcode.in/alert");
		
		WebElement SimAl = D5.findElement(By.xpath("//button[@id='accept']"));
		SimAl.click();
		
		D5.switchTo().alert().accept();
		
		WebElement ConAl = D5.findElement(By.xpath("//button[@id='confirm']"));
		ConAl.click();
		
		D5.switchTo().alert().dismiss();
		
		WebElement PromAl = D5.findElement(By.xpath("//button[@id='prompt']"));
		PromAl.click();
		
		D5.switchTo().alert().sendKeys("Potter");
		D5.switchTo().alert().accept();
		
		WebElement ModAl = D5.findElement(By.xpath("//button[@id='modern']"));
		ModAl.click();
		
		WebElement ModAl3 = D5.findElement(By.xpath("//p[@class='title']"));
		System.out.println(ModAl3.getText());
		
		WebElement ModA2 = D5.findElement(By.xpath("//button[@aria-label='close']"));
		ModA2.click();
		
		System.out.println("    ");		
		System.out.println("Web window launch Successfully");
	}

}
