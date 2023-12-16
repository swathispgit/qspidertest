package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String res=result.getName();
		Reporter.log(res+ "has got passed",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res=result.getName();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+res+".png");
		try {
			FileUtils.copyFile(src, dest);
		}
		catch (IOException e) {
	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String res=result.getName();
		Reporter.log(res+"has got skipped,true");
	}

}
