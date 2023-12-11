package TestNGfRAMEWORK;

import org.testng.annotations.*;

public class Examples002 {
	
	@Test
	void abc()
	{
		System.out.println("this is abc from Class 1");
	}
	
	@BeforeTest
	void m()
	{
		System.out.println("this is before test method...");
	}
	
	@BeforeSuite
	void bs()
	{
	 System.out.println(" this is Before suite method...");	
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("this is After suite method");
	}

}
