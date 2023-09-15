package org.adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
	
	 public static WebDriver driver;
	@Test
	private void sample1()
	{
		System.out.println("welcome");
		
	}
	
	@Test
	private void sample2()
	{
		System.out.println("to java");
    }
	
	@Test
	private void sample3()
	{
		System.out.println("to java selenium");
    }
	

		@Test
		void tc2(){
		     WebDriverManager.firefoxdriver().setup();
		     driver=new FirefoxDriver();
		     driver.get("https://www.facebook.com/");
		}
	
	

}
