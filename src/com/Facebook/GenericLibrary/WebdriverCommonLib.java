package com.Facebook.GenericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverCommonLib {
	public void WaitForPage(){
		Browser.d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
public void waitforElementPresent(WebElement wb){
	WebDriverWait wait=new WebDriverWait(Browser.d, 20);
	wait.until(ExpectedConditions.visibilityOf(wb));
}
public void type(WebElement editwb,String data){
	editwb.clear();
	editwb.sendKeys(data);
}
public void click(WebElement clickwb){
	clickwb.click();
}
public void select(WebElement swb,String data){
	org.openqa.selenium.support.ui.Select sc=new org.openqa.selenium.support.ui.Select(swb);
	sc.deselectByVisibleText(data);
}
public void select(WebElement swb,int index){
	org.openqa.selenium.support.ui.Select sc=new org.openqa.selenium.support.ui.Select(swb);
	sc.deselectByIndex(index);
	
}
}
