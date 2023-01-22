package techproed.tests;

import org.testng.SkipException;
import org.testng.annotations.*;

public class Day19_TestNGAnnotations {
    /*
    @Test : Test case olusturmak icin kullanilir
    @Before ve @After : 5 Before 5 After anotations var
    suite > tests > grup > class > method
    @BeforeSuite: Her bir testSuite den once bir kere calisir
    @AfterSuite: Her bir testSuite den sonra bir kere calisir
    @BeforeTest: Her bir test ten once(test case ile karistirilmamali) bir kere calisir
    @AfterTest: Her bir test ten sonra(test case ile karistirilmamali) bir kere calisir
    @BeforeClass: Her bir classdan once bir kere calisir
    @AfterClass: Her bir classdan once bir kere calisir
    @BeforeMethod: Her bir @Test annotationdan once bir kere calisir.JUnitteki karsiligi @Before
    @BAfterMethod: Her bir @Test annotationdan sonra bir kere calisir.JUnitteki karsiligi @After
    ----------------------------------------------------------------------------------------------
    @Ignore: @Test caseleri atlamak(skip,ignore) icin kullanilir.
    @Test(enabled = false) @Test caseleri kullanima kapaatmak icin kullanilir.
    TestNG de testler natural order`a(isim sirasi) gore calisir.
    @Test(priority=1) = Test caseler oncelemek icin kullanilir.priority yoksa default olarak sifir dir.
    NOT: Default priority nin degeri sifira esittir.
     */

    @BeforeSuite //Suite: proje gibi
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");

    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }


    @Test(priority = 1)
    public void test7() {
        System.out.println("Test-7");
    }

    @Test
    @Ignore //Bu tesst gormezden gel
    public void test2() {
        System.out.println("Test-2");
    }

    @Test(enabled = false) //Bunu kullanima kapat(daha guclu, yesil run butonu kapandi)
    public void test3() {
        System.out.println("Test-3");
    }

    @Test(priority = 4)
    public void test4() {
        System.out.println("Test-4");
    }

    @Test(priority = 2)
    public void test5() {
        System.out.println("Test-5");
    }

    @Test(priority = -5)
    public void test6() {
        System.out.println("Test-6");

    }
    // test6 > test7 > test5 > test4
}



