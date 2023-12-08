package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class JavaScriptEx {
	
	static WebDriver driver;
	RemoteWebDriver re;
	
	@Test
	public void test01(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		System.out.println(driver.getCurrentUrl());
		System.out.println("URL printed by Js "+js.executeScript("return document.URL"));
		
		System.out.println(driver.getTitle());
		System.out.println("Title printed by Js"+js.executeScript("return document.title;"));
		
		//Changling title by js
		js.executeScript("duocument.title='new title';");
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		//refreshing browser by js
		js.executeScript("history.go(0);");
		
		//Scrolling the browser
		WebElement footer_logo=driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	//s.executeScript"arguyment[0].scrollIntoView(true);",footer_logo);
		js.executeScript	("arguyment[0].scrollIntoView(true);",footer_logo);
	}
	

}
