import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.UUID;


public class Gmail_Register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/u/0/&dsh=S-301116598:1703605013902335&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=glif&TL=AHNYTIQwExdculk90AUAHFDlj6WqDyDnkzXEnfNIB4HFf7LNEumOul6eGw_u3Wx1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Bansri");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Kapadia");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("August");
		Thread.sleep(2000);
		driver.findElement(By.name("day")).sendKeys("26");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1997");
		Thread.sleep(2000);
		Select gender=new Select(driver.findElement(By.id("gender")));
		gender.selectByValue("2");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
		WebElement r1=driver.findElement(By.cssSelector("div[class=SCWude]"));
		Thread.sleep(1000);
		r1.click();
		
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Banss");
		Thread.sleep(2000);
		
		driver.findElement(By.name("PasswdAgain")).sendKeys("Banss");
		Thread.sleep(2000);
		
		WebElement c1=driver.findElement(By.cssSelector("input[type=checkbox]"));
		c1.click();
		driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/div[3]"));
		driver.close();
	}
	
	  
}
