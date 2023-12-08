package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTest {
	
WebDriver driver=null;
LoginPage lp=null;

@BeforeSuite
public void setUp(){
	System.setProperty("wendriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///G:/Java%20By%20Kiran/Setup/selenium/Selenium%20Softwares/Offline%20Website/index.html");
	lp=new LoginPage(driver);
}

@Test
public void Test01(){
	lp.enterUsername();
	
}
}
