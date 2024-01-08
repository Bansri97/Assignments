package com.Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Login {

	@Test
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	        Thread.sleep(1000);
		    driver.manage().window().maximize();	
		    Thread.sleep(1000);
		    driver.findElement(By.id("email")).sendKeys("bansri@gmail.com");
		    Thread.sleep(1000);
		    driver.findElement(By.id("pass")).sendKeys("bansri");
		    Thread.sleep(1000);
		    driver.findElement(By.name("login")).click();
		    Thread.sleep(1000);
		    driver.close();
	}	
}
