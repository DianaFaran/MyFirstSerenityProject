package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchPage;

public class SearchSteps {
    private HomePage homePage;
    private SearchPage searchPage;

    @Step
    public void searchProduct(String productName){
        homePage.open();
        homePage.clickSearchLink();
        searchPage.searchProductName(productName);
        searchPage.clickSearchButton();
    }
    @Step
    public void showSearchResults(){
        searchPage.showSearchResultsList();
    }


}
