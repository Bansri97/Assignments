package com.framework;


	import java.io.File;
	import java.io.IOException;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	
	public class KeyWordDrivenFramework {
		@DataProvider(name = "Bansri")
		public String[][] readExcel() throws InvalidFormatException, IOException
		{
			String data[][]=null;
			String filepath="D:\\\\Tops1.xlsx";
			File file=new File(filepath);
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			Sheet sheet=workbook.getSheet("Tops2");
			int rows=sheet.getPhysicalNumberOfRows();
			System.out.println("Total numbers of rows : "+rows);
			data=new String[rows][];
			for(int i=0;i<data.length;i++)
			{
				Row row=sheet.getRow(i);
				int cols=row.getPhysicalNumberOfCells();
				System.out.println("total numbers of columns:"+cols);
				data[i]=new String[cols];
				for(int j=0;j<data[i].length;j++)
				{
					Cell cell=row.getCell(j);
					cell.setCellType(CellType.STRING);
					data[i][j]=cell.getStringCellValue();
					
				}
			}
			
			return data;
			
		}
		WebDriver driver=null;
		@Test(dataProvider="Bansri")
		public void test(String keyword) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
			
			if(keyword.equals("open browser"))
			{
				driver = new ChromeDriver();
				Thread.sleep(2000);
			}
			else if(keyword.equals("enter url"))
			{
				driver.get("https://www.saucedemo.com/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				Thread.sleep(2000);
			}
			else if(keyword.equals("enter username"))
			{
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				Thread.sleep(2000);
			}
			else if(keyword.equals("enter password"))
			{
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(2000);
			}
			else if(keyword.equals("click login"))
			{
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(2000);
			}
			else if(keyword.equals("close browser"))
			{
				driver.close();
			}
		}
	}


