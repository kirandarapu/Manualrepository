package TestNGfRAMEWORK;

import org.testng.annotations.*;

public class AnnotationsExamples {
	
	@BeforeSuite
	public void startup() {
		System.out.println("Started...");
	}
	
	@AfterSuite
	public void enter() {
		System.out.println("Entered...");
	}
	
	@BeforeTest
	public void Login() {
		System.out.println("Login....");
	}
	
	@AfterTest
	public void username() {
		System.out.println("Username is entered...");
	}
	
	@BeforeClass
	public void password() {
		System.out.println("password is entered...");
	}
	
	@AfterClass
	public void LoginButton() {
		System.out.println("login button click activity completed");
	}
	
	@Test
	public void EnterINtoLoginPage() {
		System.out.println("entered into login page...");
	}
	
	@BeforeMethod
	public void Functionality() {
		System.out.println("pereform functionality...");
	}
	@AfterMethod
	public void Logout() {
		System.out.println("Logout is completed");
	}

}
