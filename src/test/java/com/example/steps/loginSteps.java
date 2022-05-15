package com.example.steps;

import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the product list")
    public void iAmOnTheProductList() {
        loginPage.isDisplayedHeaderProduct();
    }

    @When("I click button sign in")
    public void iClickButtonSignin() {
        loginPage.clickButtonSignin();
    }


    @And("I input field email {string} in login")
    public void iInputFieldEmailInLogin(String email) throws InterruptedException {
        loginPage.inputFieldEmail(email);
    }


    @And("I input field password {string} in login")
    public void iInputFieldPasswordInLogin(String password) {
        loginPage.inputFieldPassword(password);
    }


    @And("I click button login")
    public void iClickButtonLogin() {
        loginPage.clickButtonLogin();
    }

    @Then("I get the {string}")
    public void iGetThe(String result) {
        switch (result) {
            case "redirectHomepage":
                loginPage.verifyHeaderProduct();
                break;
            case "alertButton":
                loginPage.verifyAlertButton();
                break;
            case "passwordCanNotEmpty":
                loginPage.verifyAlertPassword();
                break;
            default:
                loginPage.verifyAlertEmail();
                break;
        }

//        if (result.equals("redirectHomepage")){
//            loginPage.verifyHeaderProduct();
//        }else if (result.equals("alertButton")){
//            loginPage.verifyAlertButton();
//        }else if (result.equals("passwordCanNotEmpty")){
//            loginPage.verifyAlertPassword();
//        }else {
//            loginPage.verifyAlertEmail();
//        }
    }

}
