package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadEx {
	@Test 
	public void Test01() throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver","chromedriverAutoIt.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://javabykiran.com/playground/file-upload");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("file")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("G:\\Java By Kiran\\Auto It\\FileUpload.exe");
	
	
	}

}
