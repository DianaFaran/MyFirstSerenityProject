package org.fasttrackit.steps;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.fasttrackit.pages.ProductPage;


public class CartSteps {

    private HomePage homePage;
    private VipPage vipPage;
    private ProductPage productPage;
    private CartPage cartPage;
    private LoginPage loginPage;
    private AccountPage accountPage;


    @Step
    public void navigateToProductPage(){
        homePage.open();
        homePage.clickVipLink();
    }
    @Step
    public void addProductToCart() {
        homePage.open();
        homePage.clickVipLink();
        vipPage.viewProductDetails();
        productPage.selectProductColor();
        productPage.selectProductSize();
        productPage.addToCart();
    }
    @Step
    public void checkItemAddedToCart(){
        cartPage.checkAddedToCartMessage(" was added to ");

    }
    @Step
    public void emptyCart(){
        homePage.clickCartLink();
        accountPage.viewAccountCart();
        cartPage.clickEmptyCartButton();
        cartPage.checkEmptyCartMessage("You have no items in your shopping cart.");
    }

    @Step
    public void changeItemQuantity(String quantity){
        cartPage.inputNumberOfItems(quantity);
        cartPage.updateQuantity();
    }
    @Step
    public void proceedToCheckout(){
        cartPage.clickCheckoutButton();
    }
}
