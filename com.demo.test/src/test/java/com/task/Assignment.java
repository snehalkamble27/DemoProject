package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment {
	
	@Test
	public void Test01(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
	
		
	driver.findElement(By.xpath("//button[text()='click']")).click();
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
	}

}
