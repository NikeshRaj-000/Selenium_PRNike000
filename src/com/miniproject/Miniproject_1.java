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

public class Miniproject_1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Drriver\\chromedriver.exe");
		
		WebDriver D2 = new ChromeDriver();
		D2.manage().window().maximize();
		D2.get ("http://automationpractice.com/index.php");
		
		WebElement ConAl = D2.findElement(By.xpath("//a[@class='login']"));
		ConAl.click();
	
		WebElement mail = D2.findElement(By.xpath("(//input[@type='text'])[2]"));
		mail.sendKeys("gloops8072@gmail.com");
		
		WebElement Creat_ac = D2.findElement(By.id("SubmitCreate"));
		Creat_ac.click();
		
		WebDriverWait wait = new WebDriverWait(D2, 1800);	
		WebElement U = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));	
		U.click();		

		WebElement Fname = D2.findElement(By.name("customer_firstname"));
		Fname.sendKeys("Deve");
		
		WebElement Lname = D2.findElement(By.name("customer_lastname"));
		Lname.sendKeys("lops");
		
		WebElement Pa = D2.findElement(By.name("passwd"));
		Pa.sendKeys("lops8072@");
		
		Thread.sleep(1500);
		WebElement Da_Drop = D2.findElement(By.xpath("//select[@id='days']"));
		Select D = new Select(Da_Drop);
		D.selectByValue("30");
		
		WebElement Ma_Drop = D2.findElement(By.xpath("//select[@id='months']"));
		Select DM = new Select(Ma_Drop);
		DM.selectByVisibleText("August ");
		
		WebElement Ya_Drop = D2.findElement(By.xpath("//select[@id='years']"));
		Select DY = new Select(Ya_Drop);
		DY.selectByValue("2011");
		
		WebElement Soff = D2.findElement(By.name("optin"));
		Soff.click();
		
		WebElement YFname = D2.findElement(By.id("firstname"));
		YFname.sendKeys("Deve");
		
		WebElement YLname = D2.findElement(By.id("lastname"));
		YLname.sendKeys("lops");
		
		WebElement Cmay = D2.findElement(By.id("company"));
		Cmay.sendKeys("Facebook");
		
		WebElement CAdd = D2.findElement(By.name("address1"));
		CAdd.sendKeys("1 Hacker Way, Menlo Park, California, United States");
		
		WebElement CAdd2 = D2.findElement(By.name("address2"));
		CAdd2.sendKeys("1 building, 1-2 unit");
		
		
		WebElement Cty = D2.findElement(By.name("city"));
		Cty.sendKeys("Menlo Park");
		
		WebElement St_Drop = D2.findElement(By.xpath("//select[@id='id_state']"));
		Select St = new Select(St_Drop);
		St.selectByVisibleText("Arkansas");
		
		WebElement Zip = D2.findElement(By.id("postcode"));
		Zip.sendKeys("94025");
		
		WebElement Cuty = D2.findElement(By.xpath("//select[@id='id_country']"));
		Select co = new Select(Cuty);
		co.selectByVisibleText("United States");
		
		WebElement Adin = D2.findElement(By.name("other"));
		Adin.sendKeys("PO to 94025");
		
		
		WebElement HPH = D2.findElement(By.name("phone"));
		HPH.sendKeys("2504994025");
		
		WebElement MPH = D2.findElement(By.name("phone_mobile"));
		MPH.sendKeys("2504994024");
		
		WebElement An = D2.findElement(By.name("alias"));
		An.clear();
		An.sendKeys("Cambridge, Massachusetts");
		
		TakesScreenshot DO = (TakesScreenshot) D2;
		
		File Scre = DO.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Screencapture\\PreAccount Created.png");
		
		FileUtils.copyFile(Scre,dest);
		
		WebElement Reg = D2.findElement(By.id("submitAccount"));
		Reg.click();
		
		TakesScreenshot DO1 = (TakesScreenshot) D2;
		
		File Scree = DO1.getScreenshotAs(OutputType.FILE);
		
		File desto = new File("C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Screencapture\\AAccount Created.png");
		
		FileUtils.copyFile(Scree,desto);
		
		Thread.sleep(2000);
		WebElement Wom = D2.findElement(By.xpath("(//a[@title='Women'])[1]"));
		
		Actions ac = new Actions(D2);
		ac.moveToElement(Wom).build().perform();
		
		WebElement SD = D2.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]"));
		SD.click();
		
		WebElement LSD = D2.findElement(By.xpath("(//a[@title='Printed Chiffon Dress'])[2]"));
		LSD.click();
		
		JavascriptExecutor J = (JavascriptExecutor) D2;
		
		J.executeScript("window.scrollBy(0,1200)");
		
		WebElement Scrll = D2.findElement(By.name("Green"));
		
		J.executeScript("arguments[0].click();", Scrll);
	

		WebElement S1D = D2.findElement(By.xpath("(//a[@href='#'])[3]"));
		S1D.click();
		
		WebElement Size = D2.findElement(By.xpath("//select[@name='group_1']"));
		Select Me = new Select(Size);
		Me.selectByVisibleText("M");
		
		WebElement Proad = D2.findElement(By.xpath("(//p[@id='add_to_cart'])[1]"));
		Proad.click();
		
		D2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement Proz = D2.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
		Proz.click();
		
		D2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Cl = D2.findElement(By.xpath("//a[@title='Close']"));
		Cl.click();
		
		WebDriverWait waite = new WebDriverWait(D2, 1100);	
		WebElement U2 = waite.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@rel='nofollow'])[5]")));	
		U2.click();
		
		TakesScreenshot DO3 = (TakesScreenshot) D2;
		
		File Scee = DO3.getScreenshotAs(OutputType.FILE);
		
		File pro = new File("C:\\Users\\Nikesh raj g\\eclipse-workspace\\Selenium_PR\\Screencapture\\Fin.png");
		
		FileUtils.copyFile(Scee, pro);
		Thread.sleep(1500);
		System.out.println("    ");		
		System.out.println("Web window Testinglaunch Successfull");
		
	}

}
