package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterized_FB {
	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() throws InterruptedException {
	        
	    	 System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe"); 
	        driver = new ChromeDriver();
	       
	        driver.get("https://www.facebook.com");
	        Thread.sleep(5000);
	    }

	    @Test(dataProvider = "loginData")
	    public void testLogin(String username, String password) throws InterruptedException {
	        System.out.println("testLogin");
	        WebElement usernameField = driver.findElement(By.id("email"));
	        Thread.sleep(1000);
	        WebElement passwordField = driver.findElement(By.id("pass"));
	        Thread.sleep(1000);
	        WebElement loginButton = driver.findElement(By.name("login"));
	        Thread.sleep(1000);

	        
	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);

	        loginButton.click();
	    }

	    @DataProvider(name = "loginData")
	    public Object[][] provideData() {	 
	    	System.out.println("provideData");
	        return new Object[][]{
	                {"user1", "pass1"},
	                {"user2", "pass2"},
	             
	        };
	    }

	    @AfterMethod
	    public void tearDown() {     
	        driver.quit();
	    }
	
}
