package TestNGfRAMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportsExamplesTestcase {
	
	public WebDriver driver;
	
	@BeforeTest
	public void openApplication() {
		
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
	}
	
	@Test
	public void Login() {
		
		
		driver.findElement(By.id("username")).sendKeys("mahesh23456");
		driver.findElement(By.id("password")).sendKeys("India@123");
		
		driver.findElement(By.id("login")).click();
		
		String Exp_title="Adactin.com - Search Hotel11";
		String Act_title=driver.getTitle();
		
		Assert.assertEquals(Act_title, Exp_title);
		
		
	}
	@AfterTest
	public void closeApplication() {
		driver.quit();
	}

}
