package TestNGfRAMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGExamples {

	public WebDriver driver;
	
	@BeforeClass
	public void openapplication() {

		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
	}
@Test
	public void loginFuncionality() {

		driver.findElement(By.id("username")).sendKeys("mahesh23456");

		driver.findElement(By.id("password")).sendKeys("India@123");

		driver.findElement(By.id("login")).click();
	}

@AfterClass
	public void RegistrationFunctionality() {
		
		driver.quit();

	}


}
