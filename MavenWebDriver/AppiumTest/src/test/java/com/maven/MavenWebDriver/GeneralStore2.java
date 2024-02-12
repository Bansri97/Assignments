package com.maven.MavenWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GeneralStore2 {

	 @Test
		public void test() throws MalformedURLException, InterruptedException
		{
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Bansri");
		options.setApp("C:\\Users\\bansu\\OneDrive\\Documents\\Appium\\General-Store.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
		Thread.sleep(1000);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Bansri Kapadia");
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		driver.quit();
		
		}
	   
	
}
