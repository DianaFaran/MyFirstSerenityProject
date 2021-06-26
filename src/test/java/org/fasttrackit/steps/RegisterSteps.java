package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;


public class RegisterSteps {

    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;

    @Step
    public void navigateToRegister(){
        homePage.open();
        homePage.clickAccountLink();
        registerPage.clickRegisterLink();
    }

    @Step
    public void enterCompleteName(String firstname, String lastname) {
        registerPage.setFirstnameField(firstname);
        registerPage.setLastnameField(lastname);
    }
    @Step
    public void enterCredentials(String email,String password){
        registerPage.setEmailField(email);
        registerPage.setPasswordField(password);
        registerPage.setConfirmPasswordField(password);
        registerPage.clickRegisterButton();
    }
    @Step
    public void registerNewAccount(String password){
        registerPage.setRandomEmail();
        registerPage.setPasswordField(password);
        registerPage.setConfirmPasswordField(password);
        registerPage.clickRegisterButton();
    }
    @Step
    public void checkUserIsRegistered(String message){
        accountPage.verifyWelcomeRegisterMessage(accountPage.getWelcomeRegisterText());
        Assert.assertTrue(accountPage.isWelcomeRegisterTextDisplayed(message));
        Assert.assertEquals(message.toLowerCase(),accountPage.getWelcomeRegisterText().toLowerCase());
    }
    @Step
    public void checkUserAlreadyRegistered(String message){
        accountPage.verifyErrorMessage(accountPage.getErrorMessageText());
        Assert.assertTrue(accountPage.isErrorMessageDisplayed(message));
        Assert.assertEquals(message.toLowerCase(),accountPage.getErrorMessageText().toLowerCase());
    }




}
