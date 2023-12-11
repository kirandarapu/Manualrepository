package TestNGfRAMEWORK;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DependsOnMethodsExamples {
	
	public WebDriver driver;
	
	@BeforeClass
	public void OpenApplication() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void LoginFunctionality() {
		
//		driver.findElement(By.linkText("Go back to Login page")).click();
		driver.findElement(By.id("username")).sendKeys("mahesh23456");
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
	}
	//dependsOnMethods= {"LoginFunctionality"}
	@Test(priority=2,dependsOnMethods= {"LoginFunctionality"})
	public void RegistrationFunctionality() {
		driver.findElement(By.linkText("New User Register Here")).click();
		driver.findElement(By.id("username")).sendKeys("kiran");
	}
	@AfterClass
	public void closeApplication() {
		
		driver.quit();
		
	}

}
