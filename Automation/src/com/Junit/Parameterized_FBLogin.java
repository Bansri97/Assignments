package com.Junit;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(Parameterized.class)
public class Parameterized_FBLogin {

	String username,password;
	
	public Parameterized_FBLogin(String username,String password) {
		super();
		this.username = username;
		this.password = password;
	}
	static WebDriver driver;
	
	
	
	@BeforeClass
	public static void setup()
	{
		
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void Login()
	{
		driver.findElement(By.id("email")).sendKeys("Bansri");
		driver.findElement(By.id("pass")).sendKeys("Bans");
		driver.findElement(By.name("login")).click();
	}
	
	@Parameters
	public static List<Object[]>getData()
	{
		Object[][] obj= new Object[4][2];
		
		obj[0][0]="test@gmail.com";
		obj[0][1]="test";
		
		obj[1][0]="demo@gmail.com";
		obj[1][1]="demo";
		
		obj[2][0]="tech@gmail.com";
		obj[2][1]="tech";
		
		obj[3][0]="abc@gmail.com";
		obj[3][1]="abc";
		
		return Arrays.asList(obj);
	}
}
