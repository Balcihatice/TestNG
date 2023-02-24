package techproed.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class ListenersRetry implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 1;//testcase 1 kere failed ederse 2 kere daha calistir
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
