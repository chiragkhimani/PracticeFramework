package com.automation.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RestAssuredExample {
    public static void main(String[] args) throws FileNotFoundException {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RequestSpecification requestSpecification = RestAssured.given();

//        Response response = requestSpecification.when().log().all().get("/ping");
//        response.then().log().all();
//        System.out.println(response.getStatusCode());

        // Given
        requestSpecification.header("Content-Type", "application/json");

        String body = new Scanner(new FileInputStream("src/test/resources/data/create_booking.json")).
                useDelimiter("\\Z").next();
        requestSpecification.body(body);

        Response response = requestSpecification.when().log().all().post("/booking");
        response.then().log().all();
        System.out.println(response.getStatusCode());


    }
}
