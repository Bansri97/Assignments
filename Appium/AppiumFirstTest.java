package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumFirstTest {
	
   @Test
	public void test() throws MalformedURLException, InterruptedException
	{
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("Bansri");
	options.setApp("C:\\Users\\bansu\\OneDrive\\Documents\\Appium\\ApiDemos-debug.apk");
	
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Querying\"]")).click();
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.quit();
	}
}
