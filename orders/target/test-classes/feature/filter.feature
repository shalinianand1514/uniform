Feature: filter orders

Background: Background section
   Given user is on homepage
   When user logged in
   Then navigate to specific pages
 @dog  
 Scenario: Add order list for filters
    When customer enter value in order ID
    When customer enter value in customer field
    When customer enter value in order status
    When customer enter value in totals
    When customer enter value in Date added
    When customer enter value in Date modified
    Then filter button enabled  