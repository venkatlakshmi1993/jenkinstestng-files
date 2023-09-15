package org.pomfile;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword extends BaseClass {
	public ChangePassword()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="current_pass")
	private WebElement currentpassword;
	
	@FindBy(id="new_password")
	private WebElement Newpassword;
	
	@FindBy(id="re_password")
	private  WebElement ConfirmPassword;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getCurrentpassword() {
		return currentpassword;
	}
	public WebElement getNewpassword() {
		return Newpassword;
	}
	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

}
