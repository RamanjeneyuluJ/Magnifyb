package com.magnifyb.stepdefinition;

import com.magnifyb.businessfunctions.MagnifybBusinessFunctions;

import io.cucumber.java.en.Given;
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

//
//	@Then("User Validate Forecasting P&L and cashflow button")
//	public void user_validate_forecasting_p_l_and_cashflow_button() {
//		WebElement foreCasting = new WebDriverWait(driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(forecastingButton)));
//		String foreCasting_text = foreCasting.getText();
//		Assert.assertEquals(foreCasting_text, "Forecasting P&L and cashflow");
//	}
}
