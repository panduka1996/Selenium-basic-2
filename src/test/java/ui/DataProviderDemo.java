package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {

	@DataProvider(name="create")
	public Object[][] dataSet2(Method m) {
	
		Object[][] obj = null;
		
		if(m.getName().equals("test")) {
			
			obj = new Object[][] {
				{"user1","pass1"},
				{"user2","pass2"}
				};
		}
		else if(m.getName().equals("test2")) {
			
			obj = new Object[][] {
				{"user1","pass1","add1"},
				{"user2","pass2","add2"}
				};
		}
		
		return obj;
	}
	
//	@DataProvider
//	public Object[][] dataSet() {
//	
//		Object[][] obj = new Object[4][2];
//		
//		obj[0][0] = "user1";
//		obj[0][1] = "pass1";
//		
//		obj[1][0] = "user2";
//		obj[1][1] = "pass2";
//		
//		obj[2][0] = "user3";
//		obj[2][1] = "pass3";
//		
//		obj[3][0] = "user4";
//		obj[3][1] = "pass4";
//		
//		return obj;
//	}
	
}
