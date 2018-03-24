package com.pagegeObjectLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Facebook.GenericLibrary.Browser;
import com.Facebook.GenericLibrary.Constants;
import com.Facebook.GenericLibrary.WebdriverCommonLib;

public class LoginPage extends WebdriverCommonLib{
	@FindBy(id="email")
	 private WebElement a;
	@FindBy(id="pass")
	private WebElement b;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement c;
	public WebElement getC() {
		return c;
	}
	public void LogIn()
	{
		WaitForPage();
		Browser.d.get(Constants.Url);
		Browser.d.manage().window().maximize();
		a.sendKeys(Constants.Username);
		b.sendKeys(Constants.Password);
		c.click();
		
		
		
			
	
		
	}
	}
	

	


