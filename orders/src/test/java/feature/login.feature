Feature: Orders login credentials

  Background: Background section
    Given User is on homepage
  @cat
  Scenario: verify login page
    When User enter value in user name field
    And user enter value in password field
    Then Login button enabled
