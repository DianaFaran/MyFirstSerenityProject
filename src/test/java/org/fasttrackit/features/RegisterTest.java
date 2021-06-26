package org.fasttrackit.features;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;


public class RegisterTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerWithValidCredentials(){
        registerSteps.navigateToRegister();
        registerSteps.enterCompleteName("Rosie", "Smith");
        registerSteps.registerNewAccount("123456");
        registerSteps.checkUserIsRegistered("Thank you for registering with Madison Island.");

    }

    @Test
    public void emailAlreadyRegistered(){
        registerSteps.navigateToRegister();
        registerSteps.enterCompleteName(Constants.USER_FIRSTNAME, Constants.USER_LASTNAME);
        registerSteps.enterCredentials(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        registerSteps.checkUserAlreadyRegistered("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.");
    }

}