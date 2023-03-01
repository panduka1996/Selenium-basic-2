package ui;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BaseTest;

public class DependancyTest extends BaseTest{

	@Test
	public void userRegistration(){
		System.out.println("this is test 1");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"userRegistration"},alwaysRun=true)
	public void userSearch(){
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
