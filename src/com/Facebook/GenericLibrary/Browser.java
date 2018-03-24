package com.Facebook.GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {


	public static WebDriver d;
	public static WebDriver getBrowser(){
		if(Constants.Brower.equals("chrome")){
			System.getProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\FRAMEWORK\\FcebookSleniumFramework\\ScreenShot\\chromedriver.exe");
			d=new ChromeDriver();
		}
		else if(Constants.Brower.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "E:\\AUTOMATION\\FRAMEWORK\\FcebookSleniumFramework\\ScreenShot\\geckodriver.exe");
			d=new FirefoxDriver();
		}
		else if(Constants.Brower.equals("ie"))
		{
       System.setProperty("webdriver.ie.driver", "E:\\AUTOMATION\\FRAMEWORK\\FcebookSleniumFramework\\ScreenShot\\IEDriverServer.exe");
        d=new InternetExplorerDriver();
	}
		return d;
	}
	}
