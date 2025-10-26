package TestNg_Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter;   // UI of the report
    public ExtentReports extent;               // common report object
    public ExtentTest test;                    // each test case entry

    @Override
    public void onStart(ITestContext context) {
        // Define report path
        String reportPath = System.getProperty("user.dir") + "/Reports/myReport.html";

        sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setDocumentTitle("Automation Report"); // Title of report
        sparkReporter.config().setReportName("Functional Testing");   // Report name
        sparkReporter.config().setTheme(Theme.STANDARD);                  // Theme

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // Adding some system info
        extent.setSystemInfo("Project Name", "Automation Practice");
        extent.setSystemInfo("Tester", "Himanshu");
        extent.setSystemInfo("OS", "Windows");
        extent.setSystemInfo("Browser", "Chrome");
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName()); // create entry in report
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Case PASSED is: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test Case FAILED is: " + result.getName());
        test.log(Status.FAIL, "Reason: " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test Case SKIPPED is: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush(); // writes everything to report
    }
}
