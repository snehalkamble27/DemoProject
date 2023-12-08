package com.test;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.FileInputStream;

public class ReadExcelFile {
/*	@Test
	public void test01() throws Exception{
		
		FileInputStream fis=new FileInputStream("Test.xlsx");
		DataFormatter df=new DataFormatter();
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet("Sheet1");
		int rows=sh.getLastRowNum();
		for(int i=0;i<=rows;i++){
			int cols=sh.getRow(i).getLastCellNum();
			for(int j=0;j<=cols;j++){
			
			Cell c=sh.getRow(i).getCell(j);
			System.out.print(df.formatCellValue(c)+" ");
		}
			System.out.println();
			} 
	}

 */
	
	 DataFormatter df=new DataFormatter();
		@Test
		public String test01(int row,int col) throws Exception{
			FileInputStream fis=new FileInputStream("Test.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet1");
			Cell c=sh.getRow(row).getCell(col);
			return df.formatCellValue(c);

	}
		public void test02()throws Exception{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///G:/Java%20By%20Kiran/Setup/selenium/Selenium%20Softwares/Offline%20Website/index.html");
			driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(test01(0,0));
		driver.findElement(By.id("password")).sendKeys(test01(0,1));
		driver.findElement(By.xpath("//button")).click();
		}
}
