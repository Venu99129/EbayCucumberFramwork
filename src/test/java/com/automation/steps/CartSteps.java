package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartSteps {
    CartPage cartPage = new CartPage();
    @Then("get the cart item prices")
    public void get_the_cart_item_prices() {
        cartPage.getCartPrices();
    }

    @And("verify the prices of total")
    public void verifyThePricesOfTotal() {
        Assert.assertTrue(cartPage.verifyPrices());
    }
}
