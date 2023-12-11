package TestNGfRAMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationalCountExamples {
	
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
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Click here to login again")).click();
		
//		String exp_result="Adactin.com - Search Hotel11";
//		String act_result=driver.getTitle();
	}

}
