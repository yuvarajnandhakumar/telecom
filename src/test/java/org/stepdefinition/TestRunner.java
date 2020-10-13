package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src//test//resources//Feature//telecom.feature",
				glue= {"org.stepdefinition"},
				tags=("@mapconcept"),
				monochrome=true,
				dryRun=false,
				plugin= {"html:target//cucumber-html-report","json:target//reports.json"}
)


public class TestRunner {

}
