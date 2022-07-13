package com.magnifyb.stepdefinition;

import com.magnifyb.businessfunctions.MagnifybBusinessFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BusinessAreasSteps extends MagnifybBusinessFunctions {

	@Given("user navigates to url")
	public void user_navigates_to_url() {
		navigateUrl();
	}

	@When("user login sucessfully with valid credentials")
	public void user_login_sucessfully_with_valid_credentials() throws Exception {
		login();
	}

	@When("user click on bussiness areas and Click on Start Financial Management Questionnaire button in Financial Management page")
	public void user_click_on_bussiness_areas_and_click_on_start_financial_management_questionnaire_button_in_financial_management_page() {
		businessAreas();
	}

	@When("user is able to click on next button clicking on all answers in Management Information")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_management_information() {
		managementInformation();
	}

	@When("user is able to click on next button clicking on all answers in Forecasting P&L and cashflow")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_forecasting_p_l_and_cashflow() {
		forecasting();
	}

	@When("user is able to click on next button clicking on all answers in Debtor Management")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_debtor_management() {

	}

	@When("user is able to click on next button clicking on all answers in Creditor Management")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_creditor_management() {

	}

	@When("user is able to click on next button clicking on all answers in Payroll\\/HR\\/Staff Management")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_payroll_hr_staff_management() {

	}

	@When("user is able to click on next button clicking on all answers in Stock Management")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_stock_management() {

	}

	@When("user is able to click on next button clicking on all answers in HMRC-Payments")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_hmrc_payments() {

	}

	@When("user is able to click on next button clicking on all answers in Fixed Assets\\/Capital Expenditure")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_fixed_assets_capital_expenditure() {

	}

	@When("user is able to click on submit button clicking on all answers in Finance")
	public void user_is_able_to_click_on_submit_button_clicking_on_all_answers_in_finance() {

	}

	@Then("user validate Your Business Overview, using our AI-based Scoring values")
	public void user_validate_your_business_overview_using_our_ai_based_scoring_values() {

	}

}
