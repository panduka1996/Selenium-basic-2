package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BaseTest;

public class ReportTest extends BaseTest{

	@Test
	public void ReporterTest1(){
		System.out.println("this is test 1");
	}
	
	@Test
	public void ReporterTest2(){
		Reporter.log("this is test 2 log");
		System.out.println("this is test 2");
	}
	
	@Test
	public void ReporterTest3(){
		System.out.println("this is test 3");
	}
	
	@Test
	public void ReporterTest4(){
		System.out.println("this is test 4");
	}
	
}
