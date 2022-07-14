Feature: Business Areas 

Scenario: Verify user is able to Business areas flow calculations

	Given user navigates to url 
	Given user login sucessfully with valid credentials
	And user click on bussiness areas and Click on Start Financial Management Questionnaire button in Financial Management page
	And user is able to click on next button clicking on all answers in Management Information
	And user is able to click on next button clicking on all answers in Forecasting P&L and cashflow
	And user is able to click on next button clicking on all answers in Debtor Management
	And user is able to click on next button clicking on all answers in Creditor Management
	And user is able to click on next button clicking on all answers in Payroll/HR/Staff Management
	And user is able to click on next button clicking on all answers in Stock Management
	And user is able to click on next button clicking on all answers in HMRC-Payments
	And user is able to click on next button clicking on all answers in Fixed Assets/Capital Expenditure
	And user is able to click on submit button clicking on all answers in Finance
	Then user validate Your Business Overview, using our AI-based Scoring values
	And user close the broswer
