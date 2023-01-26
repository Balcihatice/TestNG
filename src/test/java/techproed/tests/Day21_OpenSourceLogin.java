package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourceDashboardPage;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_OpenSourceLogin {

    @Test
    public void openSourceLogin() {

        //1. Adim
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));

        //2.Adim Page objesi olustur
        OpenSourcePage openSourcePage = new OpenSourcePage();

        //3.adim Bu objeyi kullanarak  o siniftaki objelere ulas.
        openSourcePage.username.sendKeys(ConfigReader.getProperty("open_source_username"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("open_source_password"));
        openSourcePage.submitButton.click();

        //4.Adim Assertion yapalim
        OpenSourceDashboardPage openSourceDashboardPage = new OpenSourceDashboardPage();
        Assert.assertTrue(openSourceDashboardPage.dashboardHeader.isDisplayed());

    }
}



