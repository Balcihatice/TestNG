package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {

    //Page objelerini bu sinifta buluruz,

    //1.Adim constructor olustur,
    public OpenSourcePage() {
        // PageFactory seleniumdan gelen ve bu sayfa elementlerini intantiate etmek icin kullaniriz.
        //Sayfa objeleri cagirildiginda nullPointerException alinmaz

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //PAGE OBJELERINI OLUSTUR.
    //public WebElement username = Driver.getDriver().findElement(By.name("username")); bu normal geleneksel yol ile
    //web element buluyorduk
    //Simdi
    @FindBy(name = "username")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;


}
