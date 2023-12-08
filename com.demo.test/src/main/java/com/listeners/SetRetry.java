package com.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class SetRetry implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotations, Class arg1, Constructor arg2, Method arg3) {
		annotations.setRetryAnalyzer(RetryListner.class);
		
	}

}
