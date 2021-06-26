package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.RandomStringUtils;


public class RegisterPage extends PageObject {

    @FindBy(css = ".skip-content [title^='Register']")
    private WebElementFacade registerLink;

    @FindBy(id = "firstname")
    private WebElementFacade firstnameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastnameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmPasswordField;

    @FindBy(css = ".button[title^=Register]")
    private WebElementFacade registerButton;

    public void clickRegisterButton(){
        clickOn(registerButton);
    }
    public void setConfirmPasswordField(String password){
        typeInto(confirmPasswordField,password);
    }
    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }
    public void setEmailField(String email){
        typeInto(emailField,email);
    }
    public void setFirstnameField(String firstname) {
        typeInto(firstnameField, firstname);
    }
    public void setLastnameField(String lastname) {
        typeInto(lastnameField, lastname);
    }
    public void clickRegisterLink() {
        clickOn(registerLink);
    }
    public void setRandomEmail(){
        String randomEmail = RandomStringUtils.randomAlphanumeric(1,10)+"@gmail.com";
        typeInto(emailField,randomEmail);
    }


}
