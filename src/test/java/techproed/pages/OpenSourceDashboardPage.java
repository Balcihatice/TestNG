package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.security.PublicKey;

public class OpenSourceDashboardPage {

    //1 constructor
    public OpenSourceDashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h6[.='Dashboard']")
    public WebElement dashboardHeader;


}
