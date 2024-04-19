package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class ContactTest {
	 static AppiumDriver driver=null;
	 
	 public static void openCalculator() throws InterruptedException, MalformedURLException
	 {

	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("deviceName", "OnePlus GM1901");
	cap.setCapability("udid", "5eaed0c8");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "12.0");
	cap.setCapability("appPackage", "com.android.contacts");
	cap.setCapability("appActivity", "com.android.contacts.DialtactsActivityAlias");
	cap.setCapability("automationName", "UiAutomator2");
	URL url=new URL("http://127.0.0.1:4723/");
	driver=new AppiumDriver(url,cap);
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[4]\r\n"
//			+ "")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]\r\n"
//			+ "")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[5]\r\n"
//			+ "")).click();
//	Thread.sleep(1000);
	driver.quit();
}
	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
		openCalculator();
	}
}