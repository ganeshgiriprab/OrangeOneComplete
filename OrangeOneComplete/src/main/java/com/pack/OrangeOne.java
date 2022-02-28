package com.pack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeOne {
	public static ChromeDriver driver;
	@BeforeSuite
	public void openUrl() {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");	 
	driver=new ChromeDriver();	 
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
	}
	
	@Test
	 public void testingLoginFields() {
	 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Rama"); 
	 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Ganesh");
	 driver.findElement(By.xpath("//input[@name='Submit']")).click();
	 driver.findElement(By.xpath("//b[text()='Admin']")).click();
	 }
	
	@BeforeTest
	 public void admin () {
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		}
	@BeforeClass
	 public void pim () {
	driver.findElement(By.xpath("//b[text()='PIM']")).click();
	 }
	
	@BeforeMethod
	 public void leave () {
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		 }
	@AfterClass
	 public void time () {
		driver.findElement(By.xpath("//b[text()='Time']")).click();
		 }
	
	@AfterTest
	public void recruitment () {
		driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
		 }
	@AfterSuite
	public void myInfo () {
		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		 }
		
	@AfterMethod
	public void tearDown() {
	driver.quit();	
		
	}

}
