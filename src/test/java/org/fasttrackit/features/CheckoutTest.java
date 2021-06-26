package org.fasttrackit.features;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Steps
    private CartSteps cartSteps;
    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void checkoutWithLogin(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        cartSteps.emptyCart();
        cartSteps.addProductToCart();
        cartSteps.proceedToCheckout();
        checkoutSteps.enterCheckoutDetails();
        checkoutSteps.placeOrder();
    }
}
