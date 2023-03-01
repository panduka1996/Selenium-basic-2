package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {

	Boolean dataSetup = false;
	
	@Test(enabled=false)
	public void skipTest1() {
		System.out.println("skipping this test");
	}
	
	@Test
	public void skipTest2() {
		System.out.println("skipping this test");
		throw new SkipException("skip this test");
	}
	
	@Test
	public void skipTest3() {
		System.out.println("skipping this test");
		
		if(dataSetup) {
			System.out.println("do the test");
		}
		else {
			throw new SkipException("skip this test");
		}
	}
	
}
