package com.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WndowsEx {
	
	@Test
	public void test01()throws Exception{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("file:///G:/Java%20By%20Kiran/Setup/selenium/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
         driver.manage().window().maximize();
         String mainwin=driver.getWindowHandle();
         List<WebElement> links=driver.findElements(By.partialLinkText("More info"));
         
         for(WebElement link:links)
        	 link.click();
         Set<String>handles =driver.getWindowHandles();
         
         for(String win:handles){
        	 System.out.println("handle of the window: "+win);
        	 if(!win.equals(mainwin)){
        		 driver.switchTo().window(win);
        		 Thread.sleep(5000);
        		 System.out.println(driver.getCurrentUrl());
        		 driver.close();
        		 
        	 }
         }
		
	}

}
