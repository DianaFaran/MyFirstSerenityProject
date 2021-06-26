package org.fasttrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {
    @FindBy(css = ".input-box #login-email")
    private WebElementFacade emailField;

    @FindBy(css = ".input-box #login-password")
    private WebElementFacade passwordField;

    @FindBy(css = ".buttons-set [onclick^=one] span")
    private WebElementFacade loginButton;

    @FindBy(css = ".step-title h2")
    private WebElementFacade checkoutPage;

    @FindBy(id = "billing:firstname")
    private WebElementFacade billingFirstnameField;

    @FindBy(id = "billing:lastname")
    private WebElementFacade billingLastnameField;

    @FindBy(id = "billing:street1")
    private WebElementFacade billingAddressField;

    @FindBy(id = "billing:city")
    private WebElementFacade billingCityField;

    @FindBy(id ="billing:region_id")
    private WebElementFacade billingRegion;

    @FindBy(id = "billing:postcode")
    private WebElementFacade billingZipcode;

    @FindBy(id = "billing:country_id")
    private WebElementFacade billingCountry;

    @FindBy(id = "billing:telephone")
    private WebElementFacade billingTelephone;

    @FindBy(css = "[id^='billing-buttons-container'] [title^='Continue']")
    private WebElementFacade continueButton;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElementFacade shippingRadioButton;

    @FindBy(css = ".buttons-set [onclick^='shippingMethod.save()'] span span")
    private WebElementFacade continueToPaymentButton;

    @FindBy(css = ".buttons-set [onclick^='payment.save()'] span span")
    private WebElementFacade continueToOrderReviewButton;

    @FindBy(css = ".buttons-set [onclick^='review.save()'] span span")
    private WebElementFacade placeOrderButton;

    @FindBy(css = ".buttons-set [onclick^='billing.save()'] span span")
    private WebElementFacade continueToShippingButton;


    public void clickContinueToShippingButton(){
        waitFor(".buttons-set [onclick^='billing.save()'] span span");
        clickOn(continueToShippingButton);
    }
    public void clickPlaceOrderButton(){
        waitFor(".buttons-set [onclick^='review.save()'] span span");
        clickOn(placeOrderButton);
    }
    public void clickContinueToOrderReviewButton(){
        waitFor(".buttons-set [onclick^='payment.save()'] span span");
        clickOn(continueToOrderReviewButton);
    }
    public void clickContinueToPaymentButton(){
        waitFor(".buttons-set [onclick^='shippingMethod.save()'] span span");
        clickOn(continueToPaymentButton);
    }
    public void clickSelectFreeShippingButton(){
        clickOn(shippingRadioButton);
    }
    public void clickContinueButton(){

        clickOn(continueButton);
    }
    public void setBillingTelephone(String telephone){
        typeInto(billingTelephone,telephone);
    }
    public void setBillingZipcode(String zipcode){
        typeInto(billingZipcode,zipcode);
    }
    public void setBillingCountry(){
        selectFromDropdown(billingCountry,"Statele Unite ale Americii");
    }
    public void setBillingRegion(){
        selectFromDropdown(billingRegion,"Florida");
    }
    public void setBillingCityField(String city){
        typeInto(billingCityField,city);
    }
    public void setBillingAddressField(String address){
        typeInto(billingAddressField,address);
    }public void setBillingLastnameField(String lastname){
       typeInto(billingLastnameField,lastname);
    }

    public void setBillingFirstnameField(String firstname){
        typeInto(billingFirstnameField,firstname);
    }
    public void checkoutPageConfirmation(String message){
        checkoutPage.shouldContainText(message);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public void inputPassword(String password){
        typeInto(passwordField,password);
    }
    public void inputEmail(String email){
        typeInto(emailField,email);

    }
}
