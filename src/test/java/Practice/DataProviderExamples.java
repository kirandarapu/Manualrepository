package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExamples {
	
	public WebDriver driver;
	
	@BeforeTest
	public void openApplication() {
		
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="dp")
	public void Login(String user,String pwd) {
		
		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		driver.findElement(By.id("login")).click();
		
		String Exp_title="Adactin.com - Search Hotel";
		String Act_title=driver.getTitle();
		
		Assert.assertEquals(Act_title, Exp_title);
		
		
	}
	@AfterTest
	public void closeApplication() {
		driver.quit();
	}
	
	@DataProvider(name="dp", indices= {0,1,2})
	String [][] logindata() {
		
		String data[][]= {
				{"mahesh23456","India@123"},
				{"mahesh12345","India@234"},
				{"mahesh45678","India@12456"},
				{"mahesh9876","India@4321"},
				{"mahesh09876","India@67899"}
				
				
		};
		
		return data;
		}
	

}
