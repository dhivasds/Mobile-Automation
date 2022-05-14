package com.example.steps;

import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerSteps {

    RegisterPage registerPage = new RegisterPage();

    @And("I click text register")
    public void iClickTextRegister() {
        registerPage.clickTextRegister();
    }

    @And("I input field fullname")
    public void iInputFieldFullname() {
        registerPage.inputFieldFullName();
    }

    @And("I input field {string} email")
    public void iInputFieldEmail(String email) {
        registerPage.inputEmail(email);
    }

    @And("I input field {string} password")
    public void iInputFieldPassword(String password) {
        registerPage.inputPassword(password);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registerPage.clickButtonRegister();
    }

    @Then("I get {string} in register")
    public void iGet(String result) {

    }


}
