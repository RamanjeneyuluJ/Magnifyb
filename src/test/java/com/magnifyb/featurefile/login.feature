Feature: Login

@login2
  Scenario: Verify user is able to login into the application and navigates to Financial  Management page in business areas
    Given user navigates to url
    And user Click on login button
    Then user Validate login page
    And user Enter email ID
    And user Enter password
    And user Click on sign in button
    Then Validate My Company Dashboard
    And User Click on business areas
    And User Click on Financial Management
    And user Click on Start Financial Management Questionnaire
    And user Validate Management Information button
    

 