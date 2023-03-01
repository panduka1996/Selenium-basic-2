package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {

	@BeforeSuite
	public void dataSetup() {
		System.out.println("common data setup");
	}
	
	@AfterSuite
	public void dataTearDown() {
		System.out.println("common data clean up");
	}
	
}
