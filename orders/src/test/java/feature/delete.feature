Feature: Delete orders

  Background: Background section
    Given user is on homepage
    When user logged in
    Then navigate to specific pages
  @bye
  Scenario: Delete order
    When customer click on the delete button
    And customer gets popup
    And customer click ok or cancel button
