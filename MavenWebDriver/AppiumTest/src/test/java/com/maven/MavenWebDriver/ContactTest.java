package com.maven.MavenWebDriver;
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

		driver.quit();
	}
		 public static void main(String[] args) throws MalformedURLException, InterruptedException {
			openCalculator();
		}
	}

