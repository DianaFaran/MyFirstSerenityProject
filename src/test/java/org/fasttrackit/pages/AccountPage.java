package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AccountPage extends PageObject {

    @FindBy(css = ".success-msg li span")
    private WebElementFacade welcomeRegisterMessage;

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeLoginMessage;

    @FindBy(css = ".error-msg span")
    private WebElementFacade errorMessage;

    @FindBy(css = ".cart-link")
    private WebElementFacade accountCart;

    public void viewAccountCart(){
        clickOn(accountCart);
    }

    public void verifyErrorMessage(String message){
        waitFor(".error-msg span");
        errorMessage.shouldContainText(message);
    }
    public void verifyWelcomeRegisterMessage(String message){
        waitFor(".success-msg li span");
        welcomeRegisterMessage.shouldContainText(message);
    }
    public void verifyWelcomeLoginMessage(String message){
        waitFor(".hello strong");
        welcomeLoginMessage.shouldContainText(message);
    }
    public boolean isWelcomeRegisterTextDisplayed(String text){
        waitFor(welcomeRegisterMessage);
        return welcomeRegisterMessage.containsText(text);
    }
    public boolean isWelcomeLoginTextDisplayed(String text){
        waitFor(welcomeLoginMessage);
        return welcomeLoginMessage.containsText(text);
    }
    public boolean isErrorMessageDisplayed(String text){
        return errorMessage.containsText(text);
    }

    public String getWelcomeLoginText(){
        return welcomeLoginMessage.getText();
    }
    public String getWelcomeRegisterText(){
        return welcomeRegisterMessage.getText();
    }
    public String getErrorMessageText(){
        return errorMessage.getText();
    }
}
