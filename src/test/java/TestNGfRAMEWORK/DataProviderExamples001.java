package TestNGfRAMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

public class DataProviderExamples001 {
	
	public WebDriver driver;
	@BeforeTest
	public void openApplication() {
		
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	
	@Test(dataProvider="dp")
	public void Login(String user,String pwd) {
		
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
	}
	
	@AfterTest
	public void closeApplication() {
		driver.close();
	}
	
	@DataProvider(name="dp",indices= {0,3,2})
	String[][]logindata(){
		String data[][]= {
				{"mahesh23456","India@1235"},
				{"kiran23456","India@3456"},
				{"mahesh23456","India@123"},
				{"mahes7654","India@09876"},
				{"mahesh6758","India@87654"}
		};
		return data;
		
	}

}
