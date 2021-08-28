package co.uk.dryrun.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends basePage {


    //constructor as every page needs a Webdriver to find elements
    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


//    ToRegisterFormisdisplayed(){
//        return cy.get('[data-testid=modal-heading]').should('have.text', "Aanmelden")
//    }
//    LoginTab(){
//        return cy.get('[data-testid=register]').click()
//    }
//    LoginPassword(){
//        return cy.get('#signin-password').type('Lolly0821')
//    }
//    IncorrectLoginEMailAddress(){
//        return cy.get('#signin-email').type('jeddy.doe@gmail.com')
//    }
//    IncorrectLoginPassword(){
//        return cy.get('#signin-password').type('TipsyLolly0821')
//    }
//    InvalidLoginEMailAddress(){
//        return cy.get('#signin-email').type('jeddy.doe.gmail.com')
//    }
//    InvalidShortLoginPassword(){
//        return cy.get('#signin-password').type('1tr')
//    }
//    InvalidLongLoginPassword(){
//        return cy.get('#signin-password').type('1trTipsyLollywwwwwwww0821bbddd')
//    }
//    NoPassword(){
//        return cy.get('#signin-password-helper-text').should('have.text', 'Vul het veld in')
//    }
//    NoEMail(){
//        return cy.get('#signin-email-helper-text').should('have.text', 'Vul het veld in')
//    }
//    RememberMe(){
//        return cy.get('[data-testid=checkbox-label]').click()
//    }
//    AccountButton(){
//        return cy.get('[data-testid=Button-primary-new] > :nth-child(2) > span').click()
//    }
//    ErrorLongInvalidPasswordMessage(){
//        return cy.get('.error-text').should('have.text', 'Je gebruikersnaam en wachtwoord matchen niet. Probeer het nog eens.')
//    }
//    ErrorShortInvalidPasswordMessage(){
//        return cy.get('#signin-password-helper-text').should('have.text', 'Je wachtwoord moet tussen 5 en 20 tekens lang zijn')
//    }
//    ErrorEMailMessage(){
//        return cy.get('#signin-email-helper-text').should('have.text', 'Sorry, dit is geen geldig e-mailadres')
//    }
//    ErrorLoginMessage(){
//        return cy.get('.error-text').should('have.text', 'Je gebruikersnaam en wachtwoord matchen niet. Probeer het nog eens.')
//    }
}
