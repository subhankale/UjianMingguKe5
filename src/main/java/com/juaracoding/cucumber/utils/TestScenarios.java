package com.juaracoding.cucumber.utils;

public enum TestScenarios {
    T1("User valid login web demoqa shop"),
    T2("User invalid login web demoqa shop"),
    T3("User choose product in demoqa shop"),
    T4("User process product to cart"),
    T5("User view product in cart");
    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
