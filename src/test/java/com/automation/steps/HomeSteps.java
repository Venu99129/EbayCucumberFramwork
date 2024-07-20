package com.automation.steps;

import com.automation.pages.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps {
    Homepage homepage = new Homepage();
    @Given("I am on the eBay homepage")
    public void i_am_on_the_bay_homepage() {
        homepage.gotoEbay();
    }

    @When("I search for {string} in the search bar")
    public void i_search_for_in_the_search_bar(String str) {
        homepage.searchFor(str);
    }



}
