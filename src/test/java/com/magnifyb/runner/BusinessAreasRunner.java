package com.magnifyb.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", monochrome = true, features = "C:\\Users\\Durga Parameswari\\Documents\\GitHub\\AutomationFramework\\src\\test\\java\\com\\magnifyb\\featurefile\\businessareas.feature", glue = "com.magnifyb.stepdefinition")

public class BusinessAreasRunner {

}
