package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends PageObject {

    @FindBy(css = ".input-box #search")
    private WebElementFacade searchBar;

    @FindBy(css = ".search-button")
    private WebElementFacade searchButton;

    @FindBy(css = ".products-grid li.item h2")
    private WebElementFacade searchProducts;

    public void showSearchResultsList(){
        ListOfWebElementFacades searchResultsList = findAll(".products-grid li.item h2");
            System.out.println(searchResultsList.get(0).getElement());
        }

    public void clickSearchButton(){
        clickOn(searchButton);
    }
    public void searchProductName(String productName) {
        typeInto(searchBar, productName);
    }
}
