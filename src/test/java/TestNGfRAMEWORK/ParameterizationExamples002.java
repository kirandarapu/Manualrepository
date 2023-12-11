package TestNGfRAMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;

public class ParameterizationExamples002 {
	public WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeTest
	public void openApplication(String br,String appurl) {
		
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		else if(br.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(br.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.get(appurl);
		
		
	}
	
	@Test
	public void Login() {
		
		driver.findElement(By.id("username")).sendKeys("mahesh23456");
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.id("login")).click();
	}
	@AfterTest
	public void closeApplication() {
		driver.close();
	}

}
