package com.pack;
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

public class IhgJoinTest {
	public static ChromeDriver driver;
	
	 @BeforeSuite
	 public void locations () {
	driver.findElement(By.xpath("//a[@class='brandNav-link u-link site-int-link']")).click();
	 }
	@BeforeMethod
	 public void openUrl() {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");	 
	 driver=new ChromeDriver();	 
	driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
	driver.manage().window().maximize();
	 	}
	@BeforeTest
	 public void ourBands () {
	driver.findElement(By.xpath(" (//a[@class='brandNav-link u-link site-int-link'])[5]")).click();
	 }
	@BeforeClass
	 public void ihgRewards () {
	driver.findElement(By.xpath(" (//a[@class='brandNav-link u-link site-int-link'])[6]")).click();
	 }
	
	 @Test
	 public void enterData() {
	 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rama"); 
	 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ganesh");
	 }
	 @AfterClass
	 public void closeBrowser() {
	driver.close();
	 }
	 
	 @AfterSuite
	 public void myStatus() {
	driver.findElement(By.xpath(" (//a[@class='brandNav-link u-link site-int-link'])[2]")).click();
			 }
	 
	 @AfterMethod
	 public void offers() {
	driver.findElement(By.xpath(" (//a[@class='brandNav-link u-link site-int-link'])[3]")).click();
	}
	 
	 @AfterTest
	 public void meetings() {
	driver.findElement(By.xpath("(//a[@class='brandNav-link u-link site-int-link'])[4]")).click();
	
	}
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
	 	 
		 
		 
	 }
	 
	 
	 
	 
	


