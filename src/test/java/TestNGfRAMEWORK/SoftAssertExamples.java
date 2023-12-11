package TestNGfRAMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExamples {
	
	
	
public WebDriver driver;
	
	@BeforeTest
	public void openApplication() {
		
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
	}
	@Test(invocationCount=3)
	public void LoginFunctionality() {
		
		driver.findElement(By.id("username")).sendKeys("mahesh23456");
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.id("login")).click();
		
		String exp_result="Adactin.com - Search Hotel11";
		String act_result=driver.getTitle();
		//use Hard Assert
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(act_result, exp_result);
		
		System.out.println("testcase is successs");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("link click activity is completed");
		
		
		
		sa.assertAll();
		
		
		
	}
	@AfterTest
	public void closeApplication() {
		
	
		
//		driver.quit();
		
	}

}
