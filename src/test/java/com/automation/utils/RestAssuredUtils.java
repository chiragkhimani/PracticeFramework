package com.automation.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RestAssuredUtils {
    static RequestSpecification requestSpecification = RestAssured.given();
    static String endPoint;
    static Response response;

    public static void setEndPoint(String endPoint) {
        RestAssuredUtils.endPoint = endPoint;
    }

    public static void post() {
        response = requestSpecification.log().all().post(endPoint);
        response.then().log().all();
    }

    public static void get() {
        response = requestSpecification.log().all().get(endPoint);
        response.then().log().all();
    }

    public static void setHeader(String header, String value) {
        requestSpecification.header(header, value);
    }

    public static void setBody(String filePath) throws Exception {
        requestSpecification.body(getDataFromFile(filePath));
    }

    public static String getDataFromFile(String filePath) throws Exception {
        String body = new Scanner(new FileInputStream(filePath)).
                useDelimiter("\\Z").next();
        return body;
    }

    public static int getStatusCode() {
        return response.getStatusCode();
    }

    public static String getResponseField(String fieldName) {
        return response.jsonPath().getString(fieldName);
    }
}
