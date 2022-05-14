package com.example.steps;

import com.example.app.pages.MyCalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions {
    MyCalculatorPage myCalculatorPage = new MyCalculatorPage();

    @Given("I want to calculate")
    public void iWantToCalculate() {
        myCalculatorPage.isDisplayedCal();
    }

    @When("I click button number {string} on the list")
    public void iClickButtonNumberOnTheList(String number) {
        myCalculatorPage.clickButtonNumber(number);
    }

    @And("I click button plus on the list")
    public void iClickButtonPlusOnTheList() {
        myCalculatorPage.clickButtonSum();
    }

    @And("I click button min on the list")
    public void iClickButtonMinOnTheList() {
        myCalculatorPage.clickButtonMin();
    }

    @And("I click button distribution on the list")
    public void iClickButtonDistributionOnTheList() {
        myCalculatorPage.clickButtonDistribution();
    }

    @And("I click button equal")
    public void iClickButtonEqual() {
        myCalculatorPage.clickButtonEqual();
    }

    @Then("I get {int}")
    public void iGetThe(int results) {
        myCalculatorPage.verifyResultDisplayed(results);
    }
    }

