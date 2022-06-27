Feature: Edit orders

  Background: Background section
    Given user is on homepage
    When user logged in
    Then navigate to specific pages
  @shinny
  Scenario: Add customer details
    When customer edit value in store
    And customer edit value in currency
    And customer edit value in customer
    And customer edit value in customer group
    And customer edit value in First Name
    And customer edit value in Last Name
    And customer edit value in E-mail
    And customer edit value in Telephone
    When customer edit value in fax
    Then continue button enabled

  @rosi
  Scenario: Add product details
    When customer  edit choose product
    And customer edit enter quantity
    Then navigate to voucher tag

  @world
  Scenario: Add Voucher details
    When customer edit Recipient name
    And customer edit Recipient E-mail
    And customer edit Sender name
    And customer edit Sender E-mail
    And customer edit Gift Certificate Theme
    And customer edit message
    And customer edit amount
    Then navigate to payment page
  @out
  Scenario: Add payment details
    When customer edit choose address
    When customer edit First Name
    When customer edit Last Name
    When customer edit company
    When customer edit Address1
    When customer edit Address2
    When customer edit city
    When customer edit Postalcode
    When customer edit country
    When customer edit Region/state
    Then navigate to shipping details
  @sit
  Scenario: Add shipping details
    When customer edit shipping method
    When customer edit payment method
    When customer edit coupon
    When customer edit voucher
    When customer edit Reward
    When customer edit order status
    When customer edit comment
    When customer edit Affiliate
    Then navigate to totals
