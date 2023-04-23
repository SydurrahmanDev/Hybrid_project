package com.sentexpro.qa.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/resources/features"},
        glue = {"com/sentexpro/qa/stepdefinitions"},
        plugin = {"pretty", "html:report/Cucumber-report.html",
                "json:target/cucumber-reports/CucumberTestReport.json"},

        monochrome = true,
        tags ="@travel2",
        dryRun = false,
        publish = true)
public class runtest {



}
