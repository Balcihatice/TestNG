package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.TechProHomePage;
import techproed.pages.TechProLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_TechProLoginTest {
    /*
       https://testcenter.techproeducation.com/index.php?page=form-authentication
    Page object Model kullanarak sayfaya giriş yapildigini test edin
    Sayfadan cikis yap ve cikis yapildigini test et
    techproed
    SuperSecretPassword

    TechproLoginPage
    userName
    password
    submitButton
    TechproHomePage
    homeHeader
    homeLogoutButton
    TEST:
    Class: TechproLoginTest
    Metot : loginTest()
    */
    @Test
    public void loginTest(){
        TechProLoginPage techproLoginPage = new TechProLoginPage();
        TechProHomePage techproHomePage = new TechProHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("techpro_test_url"));
        techproLoginPage.username.sendKeys(ConfigReader.getProperty("techpro_test_username"));
        techproLoginPage.password.sendKeys(ConfigReader.getProperty("techpro_test_password"));
        techproLoginPage.submitButton.click();
//      ASSERTION
//        Login yapildi. Driver su an Home Pagede
        Assert.assertTrue(techproHomePage.homeHeader.isDisplayed());
//        Sayfadan cikis yap ve cikis yapildigini test et
        techproHomePage.homeLogoutButton.click();
//        Cikis olduguna dair assertion yap
        Assert.assertTrue(techproLoginPage.submitButton.isDisplayed());

//        Driver i kapat
        Driver.closeDriver();
    }
}
