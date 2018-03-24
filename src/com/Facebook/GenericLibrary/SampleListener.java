package com.Facebook.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult r) {
		// TODO Auto-generated method stub
		String failtestName=r.getMethod().getMethodName();
		EventFiringWebDriver fd=new EventFiringWebDriver(Browser.d);
        File scrIMG=fd.getScreenshotAs(OutputType.FILE);
        File dstFile=new File("E:\\webdriverworkspace\\"
        		+ "FacebookSleniumFramework\\ScreenShot\\"+failtestName+""+".png");
	
        try
        {
            FileUtils.copyFile(scrIMG, dstFile);
            
        }
        catch(IOException e)
        {
        }
		
	}
		


	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
