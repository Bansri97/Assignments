import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement r1=driver.findElement(By.id("vfb-7-1"));
		WebElement r2=driver.findElement(By.id("vfb-7-2"));
		WebElement r3=driver.findElement(By.id("vfb-7-3"));
		Thread.sleep(2000);
		r1.click();
		System.out.println("Radio Button 1 Clicked");
		Thread.sleep(2000);
		r2.click();
		System.out.println("Radio Button 2 Clicked");
		Thread.sleep(2000);
		r3.click();
		System.out.println("Radio Button 3 Clicked");
		
		driver.close();
		
		
	}
}
