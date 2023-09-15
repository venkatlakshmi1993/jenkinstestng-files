package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut extends BaseClass {
	public  LogOut()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logout")
	private WebElement logoutpage;

	public WebElement getLogoutpage() {
		return logoutpage;
	}

}
