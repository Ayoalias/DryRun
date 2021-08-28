package co.uk.dryrun.pages;

import io.cucumber.messages.internal.com.google.common.base.Verify;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;


public class homePage extends basePage {

    //constructor as every page needs a Webdriver to find elements
    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-testid='close-button']")
    private WebElement UserClicksAcceptCookiesButton;
    @FindBy(css = "[data-testid='sign-in-button']")
    private WebElement UserClicksOnLoginRegisterTab;
    @FindBy(css = ".logo")
    private WebElement TommyHilfigerLogoIsDisplayed;


    public void UserClicksAcceptCookiesButton() {
        UserClicksAcceptCookiesButton.click();
    }

    public registrationPage UserClicksOnLoginRegisterTab() {
        UserClicksOnLoginRegisterTab.click();
        return new registrationPage(driver);
    }

    public void TommyHilfigerLogoIsDisplayed() {
        String text = "Tommy Hilfiger";
        assertEquals(text, "Tommy Hilfiger");

    }


}
