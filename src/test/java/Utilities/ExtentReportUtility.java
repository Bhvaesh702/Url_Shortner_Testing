package Utilities;

import java.awt.Desktop;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import TestBase.BaseClass;

public class ExtentReportUtility implements ITestListener {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports report;
	public ExtentTest test;
	String repName;
	BaseClass BS;
	public void onStart(ITestContext context)
	{

		/*	SimpleDateFormat df= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		Date dt= new Date();
		String CurrentTimeStamp = df.format(dt);

		Instead of writting this we can  write in one step

		timeStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		 */
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		repName="Test-Report-"+ timeStamp+".html";
		sparkReporter= new ExtentSparkReporter(".\\reports\\"+ repName);
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
		
		try {
			String imagePath= new BaseClass().CaptureScreen(result.getName());
			test.addScreenCaptureFromPath(imagePath);
		} catch (Exception e1) {
			e1.getStackTrace();
		}
	}



	public void onTestSkipped(ITestResult result)
	{
		test=report.createTest(result.getName());
		test.log(Status.SKIP, "Skipped Test Case is: "+ result.getName());

	}
	public void onFinish(ITestContext context)
	{
		report.flush();
// To Open Report Automatically after Run
		
		String PathOfExtentReport = System.getProperty("user.dir")+".\\reports\\"+repName;
		File extentReport= new File(PathOfExtentReport);
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
