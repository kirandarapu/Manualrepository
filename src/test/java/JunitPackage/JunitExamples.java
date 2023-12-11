package JunitPackage;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExamples {
	
	public static WebDriver driver;
	
	@Before
	public  void openapplication() {
		
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
	}
	

		
		
	
	@Test //testcase
	public   void LoginFunctionality() {
		driver.findElement(By.id("username")).sendKeys("mahesh23456");
		
		driver.findElement(By.id("password")).sendKeys("India@123");
		
		driver.findElement(By.id("login")).click();
	}
	@Test
	public void Registrationfunctionality() {
		System.out.println("testing");
	}
	@After
	public  void closeapplication() {
		driver.close();
	}

}
