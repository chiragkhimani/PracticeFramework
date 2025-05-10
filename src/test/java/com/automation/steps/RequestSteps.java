package com.automation.steps;

import com.automation.utils.PropertyReaderUtils;
import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequestSteps {

    @Given("user wants to call {string} api call")
    public void userWantsToCallApiCall(String endPoint) {
        RestAssuredUtils.setEndPoint(endPoint);
    }

    @And("user set header {string} to {string}")
    public void userSetHeaderTo(String header, String value) {
        RestAssuredUtils.setHeader(header, value);
    }

    @And("user set body from the file {string}")
    public void userSetBodyFromTheFile(String fileName) throws Exception {
        String filePath = PropertyReaderUtils.getProperty("jsonFolderPath") + "/" + fileName;
        RestAssuredUtils.setBody(filePath);
    }

    @When("user performs post request")
    public void userPerformsPostRequest() {
        RestAssuredUtils.post();
    }

    @When("user performs get request")
    public void userPerformsGetRequest() {
        RestAssuredUtils.get();
    }

}
