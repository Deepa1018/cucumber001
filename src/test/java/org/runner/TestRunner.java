package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\home\\eclipse-workspace\\Gmail\\cucumberfeatures\\AdactinHotel.feature"
,glue="org.stepdefinition",dryRun= false,plugin = "pretty")
public class TestRunner {

}
