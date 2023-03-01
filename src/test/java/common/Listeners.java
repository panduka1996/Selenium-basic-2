package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.testUtils;

public class Listeners extends testUtils implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test case is starting");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed. screenshot ");
		try {
			getScreenShot();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
