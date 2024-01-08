package com.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LogINGmail {

	WebDriver driver=null;
	  @BeforeTest
	  public void beforetest() throws InterruptedException {
			
			  System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe"); 
			  driver=new ChromeDriver();
			  driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&emr=1&ltmpl=googlemail&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&ifkv=ASKXGp0ynwH1AnZTABHkzCapaGvXxmId3MxSjcwdlC32xlEKRYtKSx-OcWukueh1BjUpIjWSlNHWVA&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			  Thread.sleep(2000);
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			  
	  }
	  @org.testng.annotations.Test
	  public void login() throws InterruptedException {
				
		  driver.findElement(By.name("identifier")).sendKeys("bansri@gmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		  Thread.sleep(2000);
			/*
			 * driver.findElement(By.name("password")).sendKeys("bansri");
			 * Thread.sleep(2000);
			 */
	  }
	 
	  
	  @AfterTest
	  public void aftertest() throws InterruptedException {
		  Thread.sleep(2000);
		  driver.close();
		  
	  }

}
