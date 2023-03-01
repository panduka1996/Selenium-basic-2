package ui;


import org.testng.Assert;
import org.testng.annotations.Test;

import common.CommonDataSetup;


public class GroupsDemoTest2 extends CommonDataSetup{

	
	
	@Test(priority=1,groups="regression")
	public void aTest1() {
		System.out.println("aTest1 is successfull");
	}
	
	@Test(priority=2,groups="regression")
	public void bTest2() {
		System.out.println("bTest2 is successfull");
		Assert.assertTrue(false);
	}
	
	@Test(groups={"regression","bvt"})
	public void bTest3() {
		System.out.println("bTest3 is successfull");
	}
	
	@Test(groups="bvt")
	public void bTest4() {
		System.out.println("bTest4 is successfull");
	}
	
		
}
