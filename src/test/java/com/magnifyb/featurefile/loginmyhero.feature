Feature: Login

  Scenario: Verify user is able to login to the application
    Given User navigates to url
    When User Enter username
    And User Enter Password
    And User Click on submit
    Then User Validate Home page