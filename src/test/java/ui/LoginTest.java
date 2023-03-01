package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class LoginTest extends CommonDataSetup{

	@BeforeTest
	public void loginToApp() {
		
		System.out.println("before login");
	}
	
	@AfterTest
    public void logoutToApp() {
		
		System.out.println("after logout");
	}
	
	@BeforeMethod
	public void connectToDB() {
		System.out.println("connect to DB");
	}
	
	@AfterMethod
	public void disconnectFromDB() {
		System.out.println("disconnect from DB");
	}
	
	@Test(priority=1,description="login test")
	public void loginTest() {
		System.out.println("Login is successfull");
	}
	
	@Test(priority=2,description="logout test")
	public void logoutTest() {
		System.out.println("Logout is successfull");
	}

}
