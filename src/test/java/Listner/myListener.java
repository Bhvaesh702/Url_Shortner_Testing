package Listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListener implements ITestListener

{
	public void onTestStart(ITestResult result) 
	{
		System.out.println("This is OnTestStart.......");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("This is OnTestSuccess.......");
		
	}
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("This is OnTestFailure.......");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("This is OnTestSkipped.......");
	}
	public void onStart(ITestContext context) 
	{
		System.out.println("This is OnTestStarts.......");
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("This is OnTestFinish.......");
	}
	

}
