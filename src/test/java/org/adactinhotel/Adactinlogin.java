package org.adactinhotel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pomfile.Bookeditenerary;
import org.pomfile.LogOut;
import org.pomfile.LoginPage;
import org.pomfile.SearchHotel;
import org.pomfile.Selecthotel;
import org.testng.annotations.Test;

public class Adactinlogin extends BaseClass {
	@Test
	private void methode1()
	{
	openDriver("firefox");
	max_Win();
	openUrl("https://adactinhotelapp.com/");
	}
	@Test
	private void methode2()
	{
	LoginPage l= new LoginPage();
	WebElement username = l.getUsername();
	passValue(username,"manee123");
	WebElement password = l.getPassword();
	passValue(password,"P1FGC5");
	WebElement login = l.getLogin();
	clickButton(login);
	}
	@Test
	private void methode3(){
		SearchHotel s=new 	SearchHotel();
	    WebElement location = s.getLocation();
		selByIndex(location, 3);
		WebElement hotel = s.getHotel();
		selByIndex(hotel, 4);
		WebElement adult = s.getAdult();
		selByIndex(adult, 1);
		WebElement child = s.getChild();
		selByIndex(child, 2);
		WebElement number = s.getNumber();
		selByIndex(number, 3);
		WebElement room = s.getRoom();
		selByIndex(room,3);
		WebElement search = s.getSearch();
		submit(search);
	}
	@Test
		private void methode4(){

		Selecthotel sh=new  Selecthotel(); 
		WebElement radiobutton = sh.getRadiobutton();
		clickBtnJs(radiobutton);
		WebElement continue1 = sh.getContinue();
		clickBtnJs( continue1);
	}
	@Test
	private void methode5(){
	
		Bookeditenerary bi=new Bookeditenerary();
		WebElement f = bi.getFirstname();
		passValue(f, "venkat");
		WebElement la = bi.getLastname();
		passValue(la,"lakshmi");
		WebElement addr= bi.getAddress();
	    passValue(addr, "1/2,old street");
		WebElement cnum = bi.getCnum();
		passValue(cnum, "1234567891234567");
		WebElement ctype = bi.getCtype();
		passValue(ctype,"VISA");
		WebElement ccmonth = bi.getCcmonth();
		selByIndex(ccmonth, 3);
		WebElement ccyear = bi.getCcyear();
		selByVisibleText(ccyear ,"2025");
		WebElement ccv = bi.getCcv();
	    passValue(ccv,"123");
	    WebElement book = bi.getBook();
	    submit(book);
	}
	@Test
	private void methode6(){ 
	    LogOut lo= new LogOut();
	    WebElement logout= lo.getLogoutpage();
	    clickBtnJs(logout);
		 }
}