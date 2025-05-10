package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user open website")
    public void user_open_website() {
        loginPage.openWebsite();
        
    }

    @When("user login with valid credential")
    public void user_login_with_valid_credential() {
        loginPage.doLogin();
        
    }



}
