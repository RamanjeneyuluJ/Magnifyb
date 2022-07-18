Feature: Login 

#Scenario: 
#	verify user is able to getting validation message when  invalid email id and valid password in login page 
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "durga440gmail.com" and valid password "Machint@123" 
#	Then user validate invalid email address message 
#	And user close the browser 
#
#Scenario: 
#	Verify user is able to getting validation message when valid email id and invalid password in login page 
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "durga440@gmail.com" and valid password "Machint123" 
#	Then user validate incorrect details message 
#	And user close the browser 
#	
#Scenario: 
#	Verify user is able to getting validation message when invalid email id and invalid password in login page
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "durga440gmail.com" and valid password "Machint123" 
#	Then user validate invalid email address message 
#	And user close the browser 
#	
#Scenario: 
#	Verify user is able to getting validation message when enter numerical value email id field and in login page 
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "12344445" and valid password "Machint123" 
#	Then user validate invalid email address message 
#	And user close the browser 
#	
#Scenario: 
#	Verify user is able to getting validation message when enter numerical value password field in login page 
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "durga440@gmail.com" and valid password "133445" 
#	Then user validate incorrect details message 
#	And user close the browser 
#	
#Scenario: 
#	Verify user is able to getting validation message when enter numberical values to email Id and password field in login page
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "56672567" and valid password "133445" 
#	Then user validate invalid email address message 
#	And user close the browser 
#	
#Scenario: 
#	Verify user is able to getting validation message when email id field in blank in login page
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "" and valid password "133445" 
#	Then user validate required message 
#	And user close the browser 
#	
#Scenario: 
#	Verify user is able to getting validation message when enter password field in blank in login page
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "test@gmail.com" and valid password "" 
#	Then user validate required message 
#	And user close the browser 
#	
#Scenario: 
#	Verify user is able to getting validation message when email id and password field in login page in login page
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "" and valid password "" 
#	Then user validate required message 
#	And user close the browser 
#	
#Scenario: 
#	Verify user is able to getting validation message when enter special characters in email id field and valid password in login page
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "*^%&%&%" and valid password "Machint@123" 
#	Then user validate invalid email address message 
#	And user close the browser 
#	
#Scenario: 
#	Verify user is able to getting validation message when enter valid email id and enter special characters in password field in login page
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "test@gmail.com" and valid password "(&*^%$^$^&" 
#	Then user validate incorrect details message 
#	And user close the browser 
#	
#Scenario: 
#	Verify user is able to getting validation message when enter special characters in Email id and password field in login page
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "(&*^%$^$^&" and valid password "(&*^%$^$^&" 
#	Then user validate invalid email address message 
#	And user close the browser 
#	
#Scenario: Verify user is login with valid credentials 
#
#	Given user navigates to url 
#	When user click on login button 
#	And user login into the application invalid email id "dev440@gmail.com" and valid password "Machint@123" 
#	Then user validate my company dashboard message 
#	And user close the browser 
#	
	Scenario Outline: Verify user is login with different credentials 

	Given user navigates to url 
	When user click on login button 
	And user login into the application "<username>" and "<password>"
	Then user validate my company dashboard message 
	And user close the browser 
	
	Examples: |username|password|
	| durga440gmail.com | Machint@123 |
#	|durga440@gmail.com|Machint123|
#	|durga440gmail.com|Machint123|
#	|12344445|Machint123|
#	|durga440@gmail.com|133445|
#	|56672567|133445|
#	| |133445|
#	|test@gmail.com||
#	|||
#	|*^%&%&%|Machint@123|
#	|test@gmail.com|(&*^%$^$^&|
#	|(&*^%$^$^&|(&*^%$^$^&|
#	|dev440@gmail.com|Machint@123|
	