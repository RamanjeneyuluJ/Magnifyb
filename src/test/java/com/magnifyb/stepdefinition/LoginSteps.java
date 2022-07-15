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

	@When("user login into the application invalid email id {string} and valid password {string}")
	public void user_login_into_the_application_invalid_email_id_and_valid_password(String string, String string2)
			throws Exception {
		login(string, string2);
	}

	@Then("user validate invalid email address message")
	public void user_validate_invalid_email_address_message() {
		invalidEmailAddress();
	}

	@Then("user validate incorrect details message")
	public void user_validate_incorrect_details_message() {
		incorrectDetails();
	}

	@Then("user validate required message")
	public void user_validate_required_message() {
		requried();
	}

	@Then("user validate my company dashboard message")
	public void user_validate_my_company_dashboard_message() throws Exception {
		companyDashboard();
	}

	@Then("user close the browser")
	public void user_close_the_broswer() {
		close();
	}

}
