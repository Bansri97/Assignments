import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Bansri");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Kapadia");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("7435066604");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#userName")).sendKeys("bansri");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("ahmedabad");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("ahd");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("Gujarat");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("382424");
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("bansriii");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("bbb");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("bbb");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.close();
		
}
}
