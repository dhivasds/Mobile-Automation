package com.example.steps;

import com.example.app.pages.LoginPage;

import io.cucumber.java.en.And;

public class logoutSteps {


    LoginPage loginPage = new LoginPage();

    @And("I click button sign out")
    public void iClickButtonSignOut() {
        loginPage.clickButtonSignin();
    }


//    karna button sign in dan sign out memiliki locator yang sama, jadi panggil ulang saja.
}
