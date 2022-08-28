package com.Automation.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/Automation/stepdefs",
        features = "@target/rerun.txt"
)

public class FailedTestRunner {
}
