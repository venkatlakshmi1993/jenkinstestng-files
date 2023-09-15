package com.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Classa {
	

	@Test(retryAnalyzer=Classc.class)
	private void samplecase1()
	{
		System.out.println("test1");
		Assert.assertTrue(false);
	}
		
		

	
	@Test(retryAnalyzer=Classc.class)
	private void samplecase2()
	{
		System.out.println("test2");
		Assert.assertTrue(false);
	}
	
	@Test
	private void samplecase3()
	{
		System.out.println("test3");
	}
	

}
