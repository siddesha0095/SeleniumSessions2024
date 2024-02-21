package testngSessions;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MyTest {
	
	@BeforeSuite
	public void suite1() {
		System.out.println("suite");
	}
	
	@Test
	public void test1() {
		System.out.println("test1 method");
	}
	
	

}