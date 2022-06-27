Feature: Add order details

  Background: Background section
    Given user is on homepage
    When user logged in
    Then navigate to specific pages

  @add
  Scenario: Add customer details
    When user customer enter value in store
    And user customer enter value in currency
    And user customer enter value in customer
    And user customer enter value in customer group
    And user customer enter value in First Name
    And user customer enter value in Last Name
    And user customer enter value in E-mail
    And user customer enter value in Telephone
    When user customer enter value in fax
    Then continue button enabled

  @run
  Scenario: Add product details
    When user customer  choose product
    And user enter quantity
    Then navigate to voucher tag

  @demo
  Scenario: Add Voucher details
    When user customer enter Recipient name
    And user customer enter Recipient E-mail
    And user customer enter Sender name
    And user customer enter Sender E-mail
    And user customer enter Gift Certificate Theme
    And user customer enter message
    And user customer enter amount
    Then user navigate to payment page
  @hello
  Scenario: Add payment details
    When user customer enter choose address
    When user customer enter First Name
    When user customer enter Last Name
    When user customer enter company
    When user customer enter Address1
    When user customer enter Address2
    When user customer enter city
    When user customer enter Postalcode
    When user customer enter country
    When user customer enter Region/state
    Then user navigate to shipping details
  @shalu
  Scenario: Add shipping details
    When user customer enter shipping method
    When user customer enter payment method
    When user customer enter coupon
    When user customer enter voucher
    When user customer enter Reward
    When user customer enter order status
    When user customer enter comment
    When user customer enter Affiliate
    Then user navigate to totals
