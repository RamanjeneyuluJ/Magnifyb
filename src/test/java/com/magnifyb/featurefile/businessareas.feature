Feature: Business Areas 

Scenario: Verify user is able to Business areas flow calculations

	Given user navigates to url 
	When user click on login button 
	And user login into the application invalid email id "dev441@gmail.com" and valid password "Machint@123" 
	Then user validate my company dashboard message 
	And user click on bussiness areas and Click on Start Financial Management Questionnaire button in Financial Management page
	Then user validate Management Information
	And user is able to click on next button clicking on all answers in Management Information
	Then user validate Forecasting P&L and cashflow
	And user is able to click on next button clicking on all answers in Forecasting P&L and cashflow
	Then user validate Debtor Management
	And user is able to click on next button clicking on all answers in Debtor Management
	Then user validate Creditor Management
	And user is able to click on next button clicking on all answers in Creditor Management
	Then user validate Payroll/HR/Staff Management
	And user is able to click on next button clicking on all answers in Payroll/HR/Staff Management
	Then user validate Stock Management
	And user is able to click on next button clicking on all answers in Stock Management
	Then user validate HMRC-Payments
	And user is able to click on next button clicking on all answers in HMRC-Payments
	Then user validate Fixed Assets/Capital Expenditure
	And user is able to click on next button clicking on all answers in Fixed Assets/Capital Expenditure
	Then user validate Finance
	And user is able to click on submit button clicking on all answers in Finance
	Then user validate Your Business Overview, using our AI-based Scoring values
	And user close the browser
	

