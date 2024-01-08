	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DropDownDemo {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://output.jsbin.com/osebed/2");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Select fruits=new Select(driver.findElement(By.id("fruits")));
			fruits.selectByVisibleText("Banana");
			Thread.sleep(2000);
			fruits.selectByVisibleText("Orange");
			Thread.sleep(2000);
			fruits.deselectByVisibleText("Banana");
			Thread.sleep(2000);
			fruits.deselectByVisibleText("Orange");
			Thread.sleep(2000);
			
			driver.close();
			
		}
	

}
