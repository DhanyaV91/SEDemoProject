package DemoTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {
	@BeforeClass
	public void bc() {
		System.out.println("This is Before Class in Demo2 Class!");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("This is Before Method  in Demo2 Class!");
	}
	
	@Test
	public void testcase2() {
		System.out.println("This is second test case!");
	}
	
	@Test
	public void testcase3() {
		System.out.println("This is third test case!");
	}	
	
	@AfterMethod
	public void am() {
		System.out.println("This is After Method  in Demo2 Class!");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("This is After Class  in Demo2 Class!");
	}
	
	@AfterTest
	public void at() {
		System.out.println("This is After all tests in Demo2 Class!");
	}

	@AfterSuite
	public void as() {
		System.out.println("This is after all in Demo2 Class!");
	}	
}
