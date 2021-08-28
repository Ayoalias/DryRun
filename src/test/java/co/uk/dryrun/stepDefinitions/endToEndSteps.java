package co.uk.dryrun.stepDefinitions;

import co.uk.dryrun.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class endToEndSteps extends basePage {

    homePage home = new homePage(driver);
    registrationPage register = new registrationPage(driver);
    accountPage account = new accountPage(driver);

    @Given("User Navigates to TH Landing Page")
    public void user_navigates_to_th_landing_page() {
        UserNavigatestoTHLandingPage();
    }

    @Given("User Clicks Accept Cookies Button")
    public void user_clicks_accept_cookies_button() {
        home.UserClicksAcceptCookiesButton();
    }

    @Given("TommyHilfiger Logo is displayed")
    public void tommy_hilfiger_logo_is_displayed() {
        home.TommyHilfigerLogoIsDisplayed();
    }

    @When("User Clicks on LoginRegister Tab")
    public void user_clicks_on_login_register_tab() {
        register = home.UserClicksOnLoginRegisterTab();
    }

    @When("To Register Form is displayed")
    public void to_register_form_is_displayed() {
        register.ToRegisterFormisDisplayed();
    }

    @When("User clicks on registration tab")
    public void user_clicks_on_registration_tab() {
        register.RegistrationTab();
    }

    @When("User Completes the E-Mail Field With a Valid E-Mail Address")
    public void user_completes_the_e_mail_field_with_a_valid_e_mail_address() {register.EMailAddress(dynamicEmailGenerator());}

    @When("User Completes the Password Field  With a Valid Password")
    public void user_completes_the_password_field_with_a_valid_password() {register.Password(passwordGenerator());}

    @When("User Selects I confirm that I have read and accept the terms and conditions and privacy policy of the online shop Checkbox")
    public void user_selects_i_confirm_that_i_have_read_and_accept_the_terms_and_conditions_and_privacy_policy_of_the_online_shop_checkbox() {register.AcceptTerms();}

    @When("User Clicks On SIGN UP FOR THE NEWSLETTER AND RECEIVE Checkbox")
    public void user_clicks_on_sign_up_for_the_newsletter_and_receive_checkbox() { register.Newsletter();}

    @When("User Clicks On CREATE AN ACCOUNT Button")
    public void user_clicks_on_create_an_account_button() { account = register.AccountButton();}

    @Then("My Account Success Page is displayed")
    public void my_account_success_page_is_displayed() {account.MyAccountSuccessPageisDisplayed();}

    @When("User Completes the Login E-Mail Field With a Valid E-Mail Address")
    public void user_completes_the_login_e_mail_field_with_a_valid_e_mail_address() {
    }
    @When("User Completes the Login Password Field  With a Valid Password")
    public void user_completes_the_login_password_field_with_a_valid_password() {
    }
    @When("User Selects Remember me Checkbox")
    public void user_selects_remember_me_checkbox() {
    }
    @When("User Clicks On TO REGISTER Button")
    public void user_clicks_on_to_register_button() {
    }
    @Then("Collection Landing Page is Displayed")
    public void collection_landing_page_is_displayed() {
    }


}
