package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
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
    public void loginTest() {
        Driver.getDriver().get("https://testcenter.techproeducation.com/index.php?page=form-authentication");
        TechProLoginPage techproLoginPage = new TechProLoginPage();
        techproLoginPage.username.sendKeys("techproed");
        techproLoginPage.password.sendKeys("SuperSecretPassword");
        techproLoginPage.submitButton.click();
    }
}
