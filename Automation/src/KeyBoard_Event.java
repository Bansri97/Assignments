import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Event {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement txtusername =driver.findElement(By.id("email"));
		
		Actions builder=new Actions(driver);
		Action seriesOfActions =builder
				.moveToElement(txtusername)
				.click()
				.keyDown(txtusername,Keys.SHIFT)
				.sendKeys(txtusername,"bansri")
				.keyUp(txtusername,Keys.SHIFT)
				.doubleClick(txtusername)
				.contextClick()
				.build();
		seriesOfActions.perform();
				
		driver.close();
		
	}
}