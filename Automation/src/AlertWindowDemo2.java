	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AlertWindowDemo2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		        driver.get("https://demoqa.com/alerts");
		        Thread.sleep(1000);
			    driver.manage().window().maximize();	
			    Thread.sleep(1000);
			    driver.findElement(By.id("alertButton")).click();
			    Thread.sleep(1000);
			    Alert simpleAlert = driver.switchTo().alert();
			    Thread.sleep(1000);
			    simpleAlert.accept();
			    Thread.sleep(1000);
			    driver.close();
			  }
		
	

}
