package com.pagegeObjectLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	@FindBy(id="userNavigationLabel")
	WebElement a;
	@FindBy(xpath="//span[contains(text(),'Log out'])")
	WebElement b;
	
	public void logOut(){
		a.click();
		b.click();
	}

}

//id....userNavigationLabel    .click
//span ....class  _54nh   .click