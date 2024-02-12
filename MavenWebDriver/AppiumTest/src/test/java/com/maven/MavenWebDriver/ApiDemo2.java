package com.maven.MavenWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class ApiDemo2 {
	
	 static AppiumDriver driver=null;
	 
	 public static void openAPi() throws InterruptedException, MalformedURLException
	 {

	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("deviceName", "OnePlus GM1901");
	cap.setCapability("udid", "5eaed0c8");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "12.0");
	cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	cap.setCapability("automationName", "UiAutomator2");
	URL url=new URL("http://127.0.0.1:4723/");
	driver=new AppiumDriver(url,cap);
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
	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
			openAPi();
		}
}
