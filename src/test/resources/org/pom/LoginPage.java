package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="(//input[@class='login_input'])[1]")	
	private WebElement username;
	
	
	@FindBy( xpath="(//input[@class='login_input'])[2]")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='login_button']")
	private  WebElement login;
	
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
}
