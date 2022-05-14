package com.example.steps;

import com.example.app.pages.ProductListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class productListSteps {

    ProductListPage productListPage = new ProductListPage();

    @When("I click button BELI")
    public void iClickButtonBELI() {
        productListPage.clickButtonBeli();
    }

    @Then("product successfully added to cart")
    public void productSuccessfullyAddedToCart() {
        productListPage.verifyCartAdded();
    }
}
