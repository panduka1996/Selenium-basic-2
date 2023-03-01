package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utils.testUtils;

public class ReportListeners extends testUtils implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.setProperty("org.uncommons.reportng.title","RCV Report");
		Reporter.log("Method name - " + result.getName());
		System.out.println("Test case is starting");
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\Panduka.Wijekoon\\eclipse-workspace\\webportal\\screenshot\\Tue-Oct-19-13-44-48-IST-2021.png\">result link</a>");
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("the status is - " + result.getStatus());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed. screenshot ");
		try {
			getScreenShot();
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			Reporter.log("<a href=\"C:\\Users\\Panduka.Wijekoon\\eclipse-workspace\\webportal\\screenshot\\Tue-Oct-19-13-44-48-IST-2021.png\">result link</a>");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
