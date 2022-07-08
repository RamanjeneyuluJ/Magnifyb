package com.magnifyb.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", monochrome = true, features = "C:\\Users\\M0137\\git\\repository3\\AutomationFramework\\src\\test\\java\\com\\magnifyb\\featurefile\\loginmyhero.feature", glue = "com.magnifyb.stepdefinition", tags = "@login")

public class LoginMyHeroRunner {

}
