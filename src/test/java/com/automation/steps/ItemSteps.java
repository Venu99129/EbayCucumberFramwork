package com.automation.steps;

import com.automation.pages.ItemPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ItemSteps {

    ItemPage itemPage = new ItemPage();

    @When("I choose to check out as guest")
    public void i_choose_to_check_as_guest() {
        itemPage.clickOnGuest();
    }

    @When("I click on the buy it now button in item page")
    public void i_click_on_the_buy_it_now_in_item_button() {
        itemPage.clickOnBuyItNowButton();
    }


    @When("I click on the add to cart button in item page")
    public void i_click_on_the_add_to_cart_button_in_item_page() {
        itemPage.clickOnAddToCartButton();
    }

    @Then("go to main page")
    public void go_to_main_page() {
        itemPage.goToMainPage();
    }


    @When("close cart popup")
    public void closeCartPopup() {
        itemPage.closeItemCartPopUp();
    }

    @And("select color of phone")
    public void selectColorOfPhone() {
        itemPage.selectColor();
    }
}
