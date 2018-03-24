package com.Facebook.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;


public class ScreenShot {
  @Test
  public void TakeScreenShot() throws IOException {
	  Browser.d=Browser.getBrowser();
	  Browser.d.get(Constants.Url);
	  //step1:  create a object to "webDriver Driver" Listener class to get a screenshot
	  EventFiringWebDriver efwd=new EventFiringWebDriver(Browser.d);
	  //step2:  Capture the file type of ScreenShot using  "getScreenshotAs" method
	  File srcImage=efwd.getScreenshotAs(OutputType.FILE);
	  //step3:  Create a new file in ScreenshotFolder in Framework
	  File dstFile=new File(Constants.ScreenShot);
	  //step4:  Using apache poi copy the Srcimage to local file(in screenShotFolder)
	  FileUtils.copyFile(srcImage, dstFile);
	  
  }
}
