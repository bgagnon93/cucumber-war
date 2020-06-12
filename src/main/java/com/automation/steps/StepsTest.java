package com.automation.steps;

import io.cucumber.java.en.Given;

public class StepsTest {

    @Given("^I want to print something$")
    public void test() {
        String helloWorld = "helloWorld";
        System.out.println(helloWorld);
    }
}
