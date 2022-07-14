package com.magnifyb.stepdefinition;

import com.magnifyb.businessfunctions.MagnifybBusinessFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps extends MagnifybBusinessFunctions {

	
//	@Given("user navigates to url")
//	public void user_navigates_to_url() {
//		navigateUrl();
//	}


	@Given("user is able to Enter invalid email id and valid password flow")
	public void user_is_able_to_enter_invalid_email_id_and_valid_password_flow() {
		login_001();
	}

	
	@Given("user is able to Enter valid email id and invalid password")
	public void user_is_able_to_enter_valid_email_id_and_invalid_password() {
		login_002();
	}

	
	@Given("user is able to Enter invalid email id and invalid password")
	public void user_is_able_to_enter_invalid_email_id_and_invalid_password() {
		login_003();
	}

	
	@Given("user is able to Enter numerical values in email id field and valid password")
	public void user_is_able_to_enter_numerical_values_in_email_id_field_and_valid_password() {
		login_004();
	}

	
	@Given("user is able to Enter valid email id and enter password field as numerical values")
	public void user_is_able_to_enter_valid_email_id_and_enter_password_field_as_numerical_values() {
		login_005();
	}

	
	@Given("user is able to Enter numerical values to email Id and password field")
	public void user_is_able_to_enter_numerical_values_to_email_id_and_password_field() {
		login_006();
	}

	
	@Given("user is able to In email id field as blank and enter valid password")
	public void user_is_able_to_in_email_id_field_as_blank_and_enter_valid_password() {
		login_007();
	}

	
	@Given("user is able to Enter valid email id and password field as blank")
	public void user_is_able_to_enter_valid_email_id_and_password_field_as_blank() {
		login_008();
	}

	
	@Given("user is able to Without enter email id and password fields")
	public void user_is_able_to_without_enter_email_id_and_password_fields() {
		login_009();
	}

	
	@Given("user is able to Enter special characters in email id field and valid password")
	public void user_is_able_to_enter_special_characters_in_email_id_field_and_valid_password() {
		login_010();
	}

	
	@Given("user is able to Enter valid email id and enter special characters in password field")
	public void user_is_able_to_enter_valid_email_id_and_enter_special_characters_in_password_field() {
		login_011();
	}

	
	@Given("user is able to Enter special characters in Email id and password field")
	public void user_is_able_to_enter_special_characters_in_email_id_and_password_field() {
		login_012();
	}

	
	@Given("user is able to Enter login with valid credentials")
	public void user_is_able_to_enter_login_with_valid_credentials() {
		login_013();
	}
	
//	
//	@Then("user close the broswer")
//	public void user_close_the_broswer() {
//		driver.close();
//	}

}
