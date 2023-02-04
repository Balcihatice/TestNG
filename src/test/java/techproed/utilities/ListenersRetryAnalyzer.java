package techproed.utilities;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListenersRetryAnalyzer implements IAnnotationTransformer {
    //Bu sinifi olusturmamizin amaci tum failed testcaseler bir kez daha otomatik olarak run etmek
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
       //Bu sinif ListenersRetry`a util classina baglidir.
        annotation.setRetryAnalyzer(ListenersRetry.class);
    }

}
