package com.magnifyb.stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginMyhero {

	public static WebDriver driver;

	@Given("User navigates to url")
	public void user_navigates_to_url() {

		WebDriverManager.chromedriver().driverVersion("103.0.5060.114 ").setup();
		driver.get("https://appiandev.machint.com/suite/sites/vgro");

		throw new io.cucumber.java.PendingException();
	}

	@When("User Enter username")
	public void user_enter_username() {

		throw new io.cucumber.java.PendingException();
	}

	@When("User Enter Password")
	public void user_enter_password() {

		throw new io.cucumber.java.PendingException();
	}

	@When("User Click on submit")
	public void user_click_on_submit() {

		throw new io.cucumber.java.PendingException();
	}

	@Then("User Validate Home page")
	public void user_validate_home_page() {

		throw new io.cucumber.java.PendingException();
	}

}
