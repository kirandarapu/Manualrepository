package TestNGfRAMEWORK;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotExamples {
	
public void captureScreen(WebDriver driver,String name) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;//initialization
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./Screenshots/"+name+ ".png");
		
		
		FileUtils.copyFile(src, target);
		System.out.println("screenshot is taken");
		
}
}
