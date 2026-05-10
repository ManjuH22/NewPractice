package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	 System.out.println("I am the Listener, i confirm that your test is pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I am the Listener, i failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}


}
