package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mini_proj {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver D2 = new ChromeDriver();
		
		D2.get ("http://automationpractice.com/index.php?id_product=7&controller=product");
		
		WebElement Wom = D2.findElement(By.xpath("(//a[@title='Women'])[1]"));
		
		Actions ac = new Actions(D2);
		ac.moveToElement(Wom).build().perform();
		
		
		//Wom.click();
		//Thread.sleep(2000);
		
		WebElement SD = D2.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]"));
		SD.click();
		
		WebElement LSD = D2.findElement(By.xpath("(//a[@title='Printed Chiffon Dress'])[2]"));
		LSD.click();
		
		JavascriptExecutor J = (JavascriptExecutor) D2;
		
		J.executeScript("window.scrollBy(0,500)");
		
		WebElement Scrll = D2.findElement(By.name("Green"));
		
		J.executeScript("arguments[0].click();", Scrll);
		//Scrll.click();
		
		WebElement S1D = D2.findElement(By.xpath("(//a[@href='#'])[3]"));
		S1D.click();
		
		WebElement Size = D2.findElement(By.xpath("//select[@name='group_1']"));
		Select Me = new Select(Size);
		Me.selectByVisibleText("M");
		
		WebElement Ad = D2.findElement(By.name("Submit"));
		Ad.click();
		
		//Thread.sleep(1100);
		
		//WebElement Cl2 = D2.findElement(By.xpath("//a[@title='Close']"));
		//Cl2.click();
		WebElement Pro = D2.findElement(By.xpath("(//p[@id='add_to_cart'])[1]"));
		Pro.click();
		
		D2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement Proz = D2.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
		Proz.click();
		
		D2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Cl = D2.findElement(By.xpath("//a[@title='Close']"));
		Cl.click();
		
		WebDriverWait wait = new WebDriverWait(D2, 1100);	
		WebElement U = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@rel='nofollow'])[5]")));	
		U.click();	
		
		//WebElement Proe = D2.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
		//Proe.click();

		JavascriptExecutor Jq = (JavascriptExecutor) D2;
		
		Jq.executeScript("window.scrollBy(0,400)");
		
		TakesScreenshot DO3 = (TakesScreenshot) D2;
		
		File Scee = DO3.getScreenshotAs(OutputType.FILE);
		
		File pro = new File("C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Screencapture\\Foin.png");
		
		FileUtils.copyFile(Scee, pro);
		Thread.sleep(1500);
		System.out.println("    ");		
		System.out.println("Web window Testinglaunch Successfull");
		
	}}
		
	
