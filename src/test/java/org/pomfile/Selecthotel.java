package org.pomfile;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel extends BaseClass {
	public Selecthotel(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getContinue() {
		return Continue;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}


	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(name="continue")
	private WebElement Continue;
	
	@FindBy(name="cancel")
	private WebElement cancel;
}

