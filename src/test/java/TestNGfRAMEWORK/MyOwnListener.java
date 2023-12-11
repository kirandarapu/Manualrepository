package TestNGfRAMEWORK;



import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyOwnListener implements ITestListener {
	
	
	public ExtentSparkReporter reporter; //UI of the report (document name,documenttitle,theme.....)
	public ExtentReports extent;//common inforamtion (host name,tester name,operating ,system)
	public ExtentTest test; ///test entities
	
	public void onStart(ITestContext context)  {
		
		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\com.html");
		
		//provide the documnet information
		
		reporter.config().setDocumentTitle("Automation Testing Report");//document title
		reporter.config().setReportName("Functional Testing");//report name
		reporter.config().setTheme(Theme.STANDARD);//theme
		
		//common information about document
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester", "Kiran");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browsername", "chrome,edge,firefox");
		
		
		
	}
	
	public void onTestSuccess(ITestResult tr) {
		
		test=extent.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}
	
	public void onTestFailure(ITestResult tr) {
		
		test=extent.createTest(tr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		test.log(Status.FAIL, "testcase is failed"+ tr.getThrowable());
	
		String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		
		File f = new File(screenshotPath); 
		System.out.println("screenshot is taken");
	}
	public void onTestSkipped(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
}
