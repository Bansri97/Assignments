	import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class DynamicWebTable {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		        driver.get("https://demo.guru99.com/test/web-table-element.php");
		        Thread.sleep(1000);
			    driver.manage().window().maximize();	
			    Thread.sleep(1000);
			    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			    List<WebElement> links =driver.findElements(By.cssSelector("a.dropdown-toggle"));
			    System.out.println("The number of links is " + links.size());
			   			    driver.close();
			  }
		
	

}
