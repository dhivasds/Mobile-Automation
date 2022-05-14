package com.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerSteps {
    @Given("I am on the product list")
    public void iAmOnTheProductList() {
    }

    @When("I click button login")
    public void iClickButtonLogin() {
    }

    @And("I click text register")
    public void iClickTextRegister() {
    }

    @And("I input field fullname")
    public void iInputFieldFullname() {
    }

    @And("I input field {string}")
    public void iInputField(String email) {
    }

    @And("I click register button")
    public void iClickRegisterButton() {
    }

    @Then("I get {string}")
    public void iGet(String password) {
    }
}
