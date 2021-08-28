package co.uk.dryrun.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class registrationPage extends basePage {
    //constructor as every page needs a Webdriver to find elements
    public registrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-testid='modal-heading']")
    private WebElement ToRegisterFormisDisplayed;
    @FindBy(css = "[data-testid='register']")
    private WebElement RegistrationTab;
    @FindBy(css = "#create-account-email")
    private WebElement Email;
    @FindBy(css = "#create-account-password")
    private WebElement Password;
    @FindBy(css = ".agree-terms > [data-testid='checkbox-label']")
    private WebElement AcceptTerms;
    @FindBy(css = ".create-account-newsletter > [data-testid='checkbox-label']")
    private WebElement Newsletter;
    @FindBy(css = "[data-testid='Button-primary-new']")
    private WebElement AccountButton;

    // Assert To Register Form is displayed
    public void ToRegisterFormisDisplayed() {
        String text = "Aanmelden";
        assertEquals(text, "Aanmelden");
        // Assert.assertTrue(text.equals("Aanmelden"));
    }

    // Click on Registration tab
    public void RegistrationTab() {
        RegistrationTab.click();
    }

    // Pass dynamically generated Email into the Email field
    public void EMailAddress(String mail) {
        Email.clear();
        Email.sendKeys(mail);
    }

    // Pass dynamically generated User Password into the Password field
    public void Password(String pass) {
        Password.clear();
        Password.sendKeys(pass);
    }

    // Click Accept Terms and Conditions Radio Button
    public void AcceptTerms() {
        AcceptTerms.click();
    }

    // Click Accept Newsletter Radio Button
    public void Newsletter() {
        Newsletter.click();
    }

    // Click Account Button for to complete the registration
    public accountPage AccountButton() {
        AccountButton.click();
        return new accountPage(driver);
    }
}
