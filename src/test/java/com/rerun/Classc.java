package com.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Classc implements IRetryAnalyzer{
	int min=0;
	int max=5;
	
	public boolean retry(ITestResult result)
	{
		
		if(min<max)
				{
			    min++;
			
		return true;
	
      
	}
	return false;
	
}
}