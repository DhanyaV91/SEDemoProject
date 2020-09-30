package DemoTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo1 {
	
	@BeforeSuite
	public void bs() {
		System.out.println("This is Before Suite!");
	}

	@BeforeTest
	public void bt() {
		System.out.println("This is Before Test!");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("This is Before Class!");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("This is Before Method!");
	}
	
	@Test
	public void testcase1() {
		System.out.println("This is first test case!");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("This is After Method!");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("This is After Class!");
	}	
}
