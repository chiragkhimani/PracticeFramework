package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReaderUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;

public class Hooks {

    static WebDriver driver;

    @Before("@api")
    public void setUpBeforeAPI() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        PropertyReaderUtils.intiProperty();
    }

    @Before("@ui")
    public void setUPBeforeUI() {
        DriverUtils.initDriver();
        driver = DriverUtils.getDriver();
        PropertyReaderUtils.intiProperty();
    }

    @After("@ui")
    public void cleanUpAfterUI() {
        DriverUtils.quitDriver();
    }




}
