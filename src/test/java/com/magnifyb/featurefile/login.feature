Feature: Business Areas 

@login 
Scenario: Verify user is able to check login functionality 

	Given user navigates to url 
	And user is able to Enter invalid email id and valid password flow 
	And user is able to Enter valid email id and invalid password 
	And  user is able to Enter invalid email id and invalid password 
	And user is able to Enter numerical values in email id field and valid password 
	And user is able to Enter valid email id and enter password field as numerical values 
	And user is able to Enter numerical values to email Id and password field 
	And user is able to In email id field as blank and enter valid password 
	And user is able to Enter valid email id and password field as blank 
	And user is able to Without enter email id and password fields 
	And user is able to Enter special characters in email id field and valid password 
	And user is able to Enter valid email id and enter special characters in password field 
	And user is able to Enter special characters in Email id and password field 
	And user is able to Enter login with valid credentials 
	And user close the broswer
	