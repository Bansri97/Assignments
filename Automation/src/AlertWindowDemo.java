	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AlertWindowDemo {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/popup.php");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/p/a")).click();
			Thread.sleep(2000);
			String mainWindow=driver.getWindowHandle();
			Set<String> windows=driver.getWindowHandles();
			Iterator<String> itr=windows.iterator();
			while(itr.hasNext())
			{
				String childwindow=itr.next();
				if(!mainWindow.equals(childwindow))
				{
					Thread.sleep(2000);
					driver.switchTo().window(childwindow);
					Thread.sleep(2000);
					driver.findElement(By.name("emailid")).sendKeys("bansri");
					Thread.sleep(2000);
					driver.findElement(By.name("btnLogin")).click();
					Thread.sleep(2000);
					driver.close();
				}
			}
			Thread.sleep(2000);
			driver.switchTo().window(mainWindow);
			driver.close();
			
		}
	

}
