package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DefectsFinding {
	WebDriver driver;
	
	@Test
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.planetsuperheroes.com/");
		 driver.manage().window().maximize();
		// driver.findElement(By.id(email);
		 String title =driver.getTitle();
		 Assert.assertEquals(title, 0);
	
	}

}
