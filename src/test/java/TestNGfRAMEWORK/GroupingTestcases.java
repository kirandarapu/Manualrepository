package TestNGfRAMEWORK;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingTestcases {

	
	@Test(priority=1,groups= {"regression"})
	public void startup() {
		System.out.println("Started...");
	}
	
	@Test(priority=2,groups= {"sanity"})
	public void enter() {
		System.out.println("Entered...");
	}
	
	@Test(priority=3,groups= {"smoke"})
	public void Login() {
		System.out.println("Login....");
	}
	
	@Test(priority=4,groups= {"regression"})
	public void username() {
		System.out.println("Username is entered...");
	}
	
	@Test(priority=5,groups= {"smoke"})
	public void password() {
		System.out.println("password is entered...");
	}
	
	@Test(priority=6,groups= {"regression"})
	public void LoginButton() {
		System.out.println("login button click activity completed");
	}
	
	@Test(priority=7,groups= {"sanity"})
	public void EnterINtoLoginPage() {
		System.out.println("entered into login page...");
	}
	
	@Test(priority=8,groups= {"sanity"})
	public void Functionality() {
		System.out.println("pereform functionality...");
	}
	@Test(priority=9,groups= {"sanity"})
	public void Logout() {
		System.out.println("Logout is completed");
	}
}
