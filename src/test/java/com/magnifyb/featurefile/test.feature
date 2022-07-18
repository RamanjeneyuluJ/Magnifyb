Feature: Login

Scenario Outline: Verify user is login with different credentials 

	Given user navigates to url 
	When user click on login button 
	And user login into the application "<username>" and "<password>"
	Then user validate my company dashboard message 
	And user close the browser 
	
	Examples: | username | password |
	| durga440gmail.com | Machint@123 |