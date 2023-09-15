package org.adactinhotel;


import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprovider extends BaseClass {
	
	
	
	
	    @Test
		@Parameters({"email","pass"})
        private void test1(String emailname,String Passname)
		{
			
			openDriver("chrome");
			max_Win();
			openUrl("https://www.facebook.com/");
			WebElement u = driver.findElement(By.id("email"));
		    u.sendKeys(emailname);
			WebElement p = driver.findElement(By.id("pass"));
		    p.sendKeys(Passname);
			WebElement l = driver.findElement(By.name("login"));
			clickBtnJs(l);
			
			}
	 
}





