package TestNg_Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;



public class Listener implements ITestListener {

	public void onStart(ITestContext context) {
	     System.out.println("this is on start ");
	  }
	public void onTestStart(ITestResult result) {

		System.out.println("this is onTest start and tests are started ");
	  }
	
	public void onTestSuccess(ITestResult result) {
	     System.out.println("test is success");
	  }
	public void onTestFailure(ITestResult result) {
		System.out.println("test is failed");

	  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped");

	  }
	public void onFinish(ITestContext context) {
	     System.out.println("test is finished");
	  }
	
	
	
	
}
