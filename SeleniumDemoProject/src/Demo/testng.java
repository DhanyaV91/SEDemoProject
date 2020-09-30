package Demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testng {

@BeforeSuite
public void bs() {
	System.out.println("This will execute first!");
}

@BeforeTest
public void bt() {
	System.out.println("This will execute before all test!");
}

@BeforeClass
public void bc() {
	System.out.println("This will execute before all classes!");
}

@BeforeMethod
public void bm() {
	System.out.println("This will execute before each method!");
}



}
