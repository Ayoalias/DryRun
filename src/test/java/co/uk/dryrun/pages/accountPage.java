package co.uk.dryrun.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class accountPage extends basePage{
    //constructor as every page needs a Webdriver to find elements
    public accountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".my-account__title")
    private WebElement ToRegisterFormisDisplayed;

    public void MyAccountSuccessPageisDisplayed() {
        String text = "Mijn account";
        assertEquals(text, "Mijn account");
        // Assert.assertTrue(text.equals("Mijn account"));
    }

}
