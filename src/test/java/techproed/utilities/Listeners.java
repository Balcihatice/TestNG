package techproed.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("OnStart-Tum testlerden once bir kere calisir: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("OnFinish-Tum testlerden sonra tek bir kere calisir: " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("OnTestStart-Herbir @testten once tek bir kez calisir: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("OnTestSuccess-Sadece PASS olan testlerden SONRA cagrilir: " + result.getName());
    }

    @Override//test kalinca ekran goruntusu alir
    public void onTestFailure(ITestResult result) {
        System.out.println("OnTestFailer-Sadece FAILED olan testlerden SONRA cagrilir: " + result.getName());
        try {
            ReusableMethods.getScreenshot("Test-case-Fail-" + result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("OnTestSkipped-Sadece SKIP(atlanan) testlerden SONRA tek bir kez cagrilir: " + result.getName());
    }

}
