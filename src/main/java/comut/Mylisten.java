package comut;

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

import practice1.Maven3.Base;

public class Mylisten extends Base implements ITestListener{

    ExtentSparkReporter reporter ;
    ExtentReports report ;
    ExtentTest test ;
    
    public void reportset() {
    	
    	reporter = new ExtentSparkReporter("ExtentReporterdemo.html");
    	report = new ExtentReports();
    	report.attachReporter(reporter);
    	
    	report.setSystemInfo("OS", "WINDOW");
    	report.setSystemInfo("QA", "ABC");
    	
    	reporter.config().setReportName("TEST CASE");
    	reporter.config().setTheme(Theme.DARK);
    	
    	
    	
    	
    	
    	
    	
    	
    }

	

	@Override
	public void onTestStart(ITestResult result) {
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	try {
		System.out.println("methos has pass");
		shot(result.getName());
		test = report.createTest(result.getName());
	test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		
	String s= System.getProperty("user.dir")+"\\screenshots\\"+result.getName()+".jpg";
	File f = new File(s);
	if(f.exists()) {
           test.pass("screenshot above :"+test.addScreenCaptureFromPath(s));
	}
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test = report.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.GREY));
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("all setup complete");
		reportset();
	}

	@Override
	public void onFinish(ITestContext context) {
	System.out.println("method has finished");
	report.flush();
	}

}
