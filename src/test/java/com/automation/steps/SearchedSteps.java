package com.automation.steps;

import com.automation.pages.SearchedPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchedSteps {



    SearchedPage searchedPage = new SearchedPage();

    @When("I click on the Buy it now button in search page")
    public void i_click_on_the_buy_it_now_button() {
        searchedPage.clickOnBuyItNowButton();
    }


    @When("I choose the first product listed")
    public void i_choose_the_first_product_listed() {
        searchedPage.clickOnFirstLink();
    }


    @When("click on cart icon")
    public void clickOnCartIcon() {
        searchedPage.clickOnCartIcon();
    }
}
