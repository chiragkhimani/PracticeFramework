package com.automation.steps;

import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ResponseSteps {
    @Then("verify status code is {int}")
    public void verifyStatusCodeIs(int expStatusCode) {
        Assert.assertEquals(expStatusCode, RestAssuredUtils.getStatusCode());
    }

    @And("verify response body field {string} is not empty")
    public void verifyResponseBodyFieldIsNotEmpty(String fieldName) {
        String fieldValue = RestAssuredUtils.getResponseField(fieldName);
        Assert.assertFalse(fieldValue.isEmpty());
    }
}
