package swagLabs.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Custom_Listeners implements ITestListener {
	
	public  void onTestStart(ITestResult result) {
		 System.out.println("On Test Started"+result.getMethod().getMethodName());
	  }

	
	  public  void onTestSuccess(ITestResult result) {
		  System.out.println("onTestSuccess"+result.getMethod().getMethodName());
	  }

	
	  public void onTestFailure(ITestResult result) {
		  System.out.println("onTestFailure"+result.getMethod().getMethodName());
	  }

	 
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("onTestSkipped"+result.getMethod().getMethodName());
	  }

	 
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	   
	  }

	 
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  
	  public void onStart(ITestContext context) {
	   
	  }

	 
	  public void onFinish(ITestContext context) {
		  System.out.println("onFinish"+context.getName());
	  }
}
