package com.magnifyb.stepdefinition;

import com.magnifyb.businessfunctions.MagnifybBusinessFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends MagnifybBusinessFunctions {

	@Given("user navigates to url")
	public void user_navigates_to_url() {
	    navigateUrl();
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    loginButton();
	}

	@When("user login into the application {string} and {string}")
	public void user_login_into_the_application_and(String eamilID, String pw) throws Exception {
	    login(eamilID, pw);
	}

	@Then("user validate {string}")
	public void user_validate(String message) {
	   validateMessage(message);
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
	    close();
	}
}
