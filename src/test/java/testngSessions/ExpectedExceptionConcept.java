package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name;
	
	@Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void loginTest() {
		System.out.println("loginTest");
		int i = 9/0;
		ExpectedExceptionConcept obj = null;
		obj.name = "tom";
	}
	
	@Test(expectedExceptions =  ArithmeticException.class)
	public void loginTest2() {
		System.out.println("loginTest");
		int i = 9/0;
		
	}
	
	@Test
	public void loginTest3() {
		System.out.println("loginTest");
		int i = 9/0;
		
	}
	
	
}