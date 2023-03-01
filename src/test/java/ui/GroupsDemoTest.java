package ui;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.CommonDataSetup;

@Test(groups="MyTestGroup")
public class GroupsDemoTest extends CommonDataSetup{

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class is successfull");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class is successfull");
	}
	
	@BeforeGroups(value="regression")
	public void beforeGroup() {
		System.out.println("before group is successfull");
	}
	
	@AfterGroups(value="regression")
	public void afterGroup() {
		System.out.println("after group is successfull");
	}
	
	@Test(priority=1,groups="regression")
	public void aTest1() {
		System.out.println("aTest1 is successfull");
	}
	
	@Test(priority=2,groups="regression")
	public void bTest2() {
		System.out.println("bTest2 is successfull");
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
