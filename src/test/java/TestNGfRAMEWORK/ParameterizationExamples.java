package TestNGfRAMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExamples {


	public WebDriver driver;



	@Parameters({"browser","url"})//parameter name
	@BeforeTest
	public void openApplication(String br,String appurl) {


		if(br.equals("chrome")) {//parameter value
			driver=new ChromeDriver();

		}
		else if(br.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(br.equals("edge")) {
			driver=new EdgeDriver();
		}

		driver.get(appurl);
	}
	@Test
	public void LoginFunctionality() {

		driver.findElement(By.id("username")).sendKeys("mahesh23456");
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.id("login")).click();

		String exp_result="Adactin.com - Search Hotel11";
		String act_result=driver.getTitle();
		//use Hard Assert
		Assert.assertEquals(act_result, exp_result,"testcase is failed");

		System.out.println("testcase is successs");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("link click activity is completed");

	}
	@AfterTest
	public void closeApplication() {





	}
}
