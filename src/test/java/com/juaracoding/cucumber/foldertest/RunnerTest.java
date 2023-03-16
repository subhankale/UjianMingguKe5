package com.juaracoding.cucumber.foldertest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"com.juaracoding.cucumber"},
        plugin = {"pretty", "html:target/report-cucumber-demoqa.html", "json:target/cucumber-demoqa.json"}
)

public class RunnerTest extends AbstractTestNGCucumberTests {
}
