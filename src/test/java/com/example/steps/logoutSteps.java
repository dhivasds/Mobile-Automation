package com.example.steps;

import com.example.app.pages.LogoutPage;
import io.cucumber.java.en.And;

public class logoutSteps {

    LogoutPage logoutPage = new LogoutPage();

    @And("I click button sign out")
    public void iClickButtonSignOut() {
        logoutPage.clickButtonSignout();
    }
}
