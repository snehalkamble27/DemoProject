package com.test;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadWriteDataTask {
	Sheet sh=null;
	Row rows=null;
	Cell c=null;
	
	@Test
	public void readData()throws Exception{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Java%20By%20Kiran/Setup/selenium/Selenium%20Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DataFormatter df=new DataFormatter();
		
		FileInputStream fis=new FileInputStream("Test.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("Sheet1");
		
		for(int i=0;i<sh.getLastRowNum();i++)
		{
			rows=sh.getRow(i);
			String username=df.formatCellValue(rows.getCell(0));
			String pass=df.formatCellValue(rows.getCell(1));
			
			driver.findElement(By.id("email")).sendKeys(username);;
			driver.findElement(By.id("password")).sendKeys(pass);
			driver.findElement(By.xpath("//button"));
			
			
			  String pagetitle=driver.getTitle();
			  System.out.println(pagetitle);
			  driver.navigate().refresh();
			  
			  driver.findElement(By.linkText("LOGOUT")).click();
			  driver.navigate().refresh();
		//	  sh=wb.getSheet(arg0);
			  
			 if(pagetitle.equals("JavaByKiran | Log in")){
				 
				 
			 }
			
			
		}
		
	}
	

	
}
