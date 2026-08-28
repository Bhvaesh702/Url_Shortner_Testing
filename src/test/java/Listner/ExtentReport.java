package Listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport implements ITestListener {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports report;
	public ExtentTest test;

	public void onStart(ITestContext context)
	{
		sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/MyReports.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);

		report= new ExtentReports();
		report.attachReporter(sparkReporter);


		report.setSystemInfo("ComputerName", "Local Info");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("TesterName", "Bhavesh");
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("BrowserName", "Chrome");
	}


	public void onTestSuccess(ITestResult result)
	{

		test=report.createTest(result.getName());
		test.log(Status.PASS, "Test Case Passed is: "+ result.getName());

	}

	public void onTestFailure(ITestResult result)
	{
		test= report.createTest(result.getName());
		test.log(Status.FAIL, "Failed Test Case is: " + result.getName());
		test.log(Status.FAIL, "Failed Testcase Cause is: " + result.getThrowable());
	}
	public void onTestSkipped(ITestResult result)
	{
		test=report.createTest(result.getName());
		test.log(Status.SKIP, "Skipped Test Case is: "+ result.getName());

	}
	public void onFinish(ITestContext context)
	{
		report.flush();

	}

}
