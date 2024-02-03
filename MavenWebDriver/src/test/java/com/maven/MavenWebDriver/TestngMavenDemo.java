package com.maven.MavenWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestngMavenDemo {

	WebDriver driver=null;
	  @BeforeTest
	  public void beforetest() throws InterruptedException {
			
			  System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe"); 
			  driver=new ChromeDriver();
			  driver.get("https://www.facebook.com/");
			  Thread.sleep(2000);
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			  
	  }
	  @org.testng.annotations.Test
	  public void login() throws InterruptedException {
				
		  driver.findElement(By.id("email")).sendKeys("bansrikapadia");
		  Thread.sleep(2000);
		  driver.findElement(By.id("pass")).sendKeys("Bansri");
		  Thread.sleep(2000);
		  driver.findElement(By.name("login")).click();
		  Thread.sleep(2000);
	  }
	 
	  
	  @AfterTest
	  public void aftertest() throws InterruptedException {
		  Thread.sleep(2000);
		  driver.close();
		  
	  }

}
