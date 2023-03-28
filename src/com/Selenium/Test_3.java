package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver D2 = new ChromeDriver();
		
		
		D2.get ("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		
		WebElement ConAl = D2.findElement(By.xpath("//a[@class='login']"));
		ConAl.click();
		
		JavascriptExecutor J = (JavascriptExecutor) D2;
		
		J.executeScript("window.scrollBy(0,2800)");
		
		WebElement Scrll = D2.findElement(By.id("color_37"));
		
		J.executeScript("arguments[0].scrollintoview();", Scrll);
		Scrll.click();
		
		WebElement S1D = D2.findElement(By.xpath("(//a[@href='#'])[3]"));
		S1D.click();
		
		WebElement Size = D2.findElement(By.xpath("//select[@name='group_1']"));
		Select Me = new Select(Size);
		Me.selectByVisibleText("M");
		
		WebElement Ad = D2.findElement(By.name("Submit"));
		Ad.click();
		
		WebElement Pro = D2.findElement(By.xpath("(//a[@title='Proceed to checkout'])[3]"));
		Pro.click();
		
		
		
		
		
		
		
		System.out.println("    ");		
		System.out.println("Web window launch Successfully");
		
		
		WebElement mail = D2.findElement(By.xpath("(//input[@type='text'])[2]"));
		mail.sendKeys("Develops8072@gmail.com");
		
		WebElement Creat_ac = D2.findElement(By.id("SubmitCreate"));
		Creat_ac.click();
		
		
		WebElement X = D2.findElement(By.xpath("//span[@class='checked']"));
		X.click();
		

		WebElement mae = D2.findElement(By.name("email"));
		mae.sendKeys("Develops8072@gmail.com");
		
		WebElement Pa = D2.findElement(By.name("passwd"));
		Pa.sendKeys("lops8072@");
		
		WebElement Da_Drop = D2.findElement(By.xpath("//select[@name='days']']"));
		Select D = new Select(Da_Drop);
		D.selectByValue("4");
		
		WebElement Ma_Drop = D2.findElement(By.xpath("//select[@name='months']']"));
		Select DM = new Select(Ma_Drop);
		DM.selectByValue("4");
		
		WebElement Ya_Drop = D2.findElement(By.xpath("//select[@name='years']']"));
		Select DY = new Select(Ya_Drop);
		DY.selectByValue("1995");
		
		WebElement Spoff = D2.findElement(By.id("optin"));
		Spoff.click();
		
		WebElement YFname = D2.findElement(By.id("firstname"));
		YFname.sendKeys("Deve");
		
		WebElement YLname = D2.findElement(By.id("lastname"));
		YLname.sendKeys("lops");
		
		WebElement Ymae = D2.findElement(By.name("email"));
		Ymae.sendKeys("Develops8072@gmail.com");
		
		WebElement YPa = D2.findElement(By.name("passwd"));
		YPa.sendKeys("lops8072@");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
