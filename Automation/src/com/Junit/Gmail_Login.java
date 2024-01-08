package com.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {
	public WebDriver driver;
	
	
	@Before
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://careercenter.tops-int.com/");
	    Thread.sleep(1000);
		driver.manage().window().maximize();	
		Thread.sleep(1000);   
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("mobile")).sendKeys("7435066604");
		Thread.sleep(1000);		
		driver.findElement(By.id("password")).sendKeys("7435066604");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type=submit]")).click();
	}

	@After
	public void logout() {
		driver.close();
	}
}