package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CalenderDate {
	
	@Test
	public void test01() throws InterruptedException{
		System.setProperty("web.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ncs.gov.in/_layouts/15/NCSP/job-seeker/JSRegister.aspx?ST=NGXkGp7mNUw%3D&IsAmnsUserCRF=hBxxM4IjBW8%3D");
		driver.manage().window().maximize();
		Select value=new Select(driver.findElement(By.id("ctl00_PlaceHolderMain_JSLeftNavigation1_ddlKYCType")));
		value.selectByVisibleText("Pan Card");
		//driver.findElement(By.id(""));
		Thread.sleep(3000);
		WebElement uid=driver.findElement(By.id("ctl00_PlaceHolderMain_JSLeftNavigation1_txtKYCNumber"));
		uid.sendKeys("1234F6");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-menu-left']")).click();
		
	}

}
