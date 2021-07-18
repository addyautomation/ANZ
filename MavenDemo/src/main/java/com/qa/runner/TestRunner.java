package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".//Features/calculator.feature",
		glue= {"com/qa/stepDefinitions"},
		monochrome=true,
        dryRun=false,
        plugin= {"html:target/cucumber-html.report"}
		
		)


public class TestRunner {

	}
