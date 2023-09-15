package org.adactinhotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel {
		@DataProvider(name="facebooklogin")
	private Object[][] excelData() throws IOException
	{
			File file=new File("C:\\Users\\MY\\workspace\\TestngsampleProject\\src\\test\\resources\\facebook.xlsx");
			FileInputStream stream =new FileInputStream (file);
			 XSSFWorkbook workbook=new XSSFWorkbook(stream);
			XSSFSheet sheet = workbook.getSheet("sheet1");
			XSSFRow row2 = sheet.getRow(0);
			
			Object[][] a=new Object[sheet.getPhysicalNumberOfRows()][row2.getPhysicalNumberOfCells()];
			for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
		    XSSFRow row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{
		     XSSFCell cell = row.getCell(j);
		   
		 	DataFormatter dataformatter =new DataFormatter();
	    	String data= dataformatter.formatCellValue(cell);
	    	a[i][j]=data;
	}
	
			}
			return a;
	}
	@Test(dataProvider="facebooklogin")
	private void case01(String email,String pass){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement user1 = driver.findElement(By.id("email"));
		user1.sendKeys(email);
		boolean displayed = user1.isDisplayed();
		Assert.assertTrue(displayed);
	
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass); 
		boolean displayed2 = password.isDisplayed();
		Assert.assertTrue( displayed2);
		
		System.out.println(email);
		System.out.println(pass);
		
		
		
	}
	
	
	

}
