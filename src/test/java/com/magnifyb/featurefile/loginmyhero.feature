Feature: insurance

@login
  Scenario: Verify user is able to login to the application and do the loan postitve flow
    Given User navigates to url and click on lead direct form in lead management
    When User Enter username
    And User Enter Password
    And User Click on submit
    Then User Validate Home page