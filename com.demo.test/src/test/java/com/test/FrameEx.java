package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FrameEx {
	@Test
	public void test01()throws Exception{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.redbus.in/");
         driver.manage().window().maximize();
         
         
        //implictly wait :- it will work on each webElement on browser
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
         driver.findElement(By.id("account_dd")).click();
         driver.findElement(By.id("user_sign_in_sign_up")).click();
         WebElement frame=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
       //  Thread.sleep(3000);
         
         //Explictly wait:- it will work on the particular webElement for 30 seconds or time which we specify.
         WebDriverWait wait=new WebDriverWait(driver,30);
         wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("mobileNoInp"))));
         driver.switchTo().frame(frame);
              driver.findElement(By.id("mobileNoInp")).sendKeys("9876543210");;
              
              
}
	}

