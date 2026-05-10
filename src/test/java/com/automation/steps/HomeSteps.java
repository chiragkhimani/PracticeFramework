package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Then("verify user on homepage")
    public void verify_user_on_homepage() {
        homePage.verifyHomePage();

    }


}
