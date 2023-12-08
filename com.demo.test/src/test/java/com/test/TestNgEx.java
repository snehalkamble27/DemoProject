package com.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.listeners.MyListener.class)
public class TestNgEx {
	
	
	@Test
	public void login(){
		
		System.out.println("login");
		//
		
		
	}
	@Test
	public void dash(){
		System.out.println("dashboard");
		Assert.assertEquals(1,2);
	}
	@Test
	public void user(){
		System.out.println("user");
		throw new SkipException("Skipping Test case");
		
	}
	

}
