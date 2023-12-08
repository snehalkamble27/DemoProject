package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{

	public void onFinish(ITestContext result) {
		System.out.println("Test suit finish");
		
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println("Test suit started");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed with name :"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
	
		System.out.println("Test case Skipped with name :"+result.getName());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test case started with name : "+result.getName());
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
	System.out.println("Test case passed with name"+result.getName());
		
	}

}
