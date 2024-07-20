package com.automation.steps;

import com.automation.pages.CheckoutPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("I should see the details of the item and shipping and tax prices")
    public void i_should_see_the_details_of_the_item_and_shipping_and_tax_prices() {
        checkoutPage.getDataFromCheckOut();
    }

    @Then("the sum of all prices should equal the Order Total")
    public void the_sum_of_all_prices_should_equal_the_Order_Total() {
        Assert.assertTrue(checkoutPage.verifyAmounts());
    }
}
