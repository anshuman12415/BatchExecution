package com.Facebook.InboxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.Facebook.GenericLibrary.Browser;
import com.Facebook.GenericLibrary.ExcelLib;
import com.Facebook.GenericLibrary.WebdriverCommonLib;
import com.pagegeObjectLibrary.LoginPage;
import com.pagegeObjectLibrary.LogoutPage;
@Listeners(com.Facebook.GenericLibrary.SampleListener.class)
        public class Test 
        {  
	
	ExcelLib elib = new ExcelLib();
        WebdriverCommonLib wlib=new WebdriverCommonLib();
        WebDriver  d = Browser.getBrowser();
        LoginPage ln = PageFactory.initElements(d, LoginPage.class);
        LogoutPage out=PageFactory.initElements(d, LogoutPage.class);
       
       @org.testng.annotations.Test
       public void logInTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
    	   String exppage = elib.getExceldata("Sheet1",2,1);
    	   System.out.println(exppage);
    	   
    	   System.out.println(elib.getExceldata("Sheet1", 3, 5));
    	   System.out.println(elib.getExceldata("Sheet1", 4, 5));
    	   
    	   ln.LogIn();
    	   String actpage=Browser.d.getTitle().trim();
    	   //String act[]=actpage.split(" ");
    	   //System.out.println(act[1]);
    	   System.out.println(actpage);
    	   out.logOut();
    	   Assert.assertEquals(exppage,actpage,"not verified");
    	   d.close();
    	       	   
    	   
    	   
   
    	   
       }
       
       
       
       
     
       }


