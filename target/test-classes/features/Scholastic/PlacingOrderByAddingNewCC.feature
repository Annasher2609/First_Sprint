Feature: User can place an order by adding a new credit card
  Scenario: After adding a new card, user places an order and can see 'Thank you' message and order reference number
    When I click on 'Sing In'
    And I enter 'firstsprint@gmail.com' email
    And I enter '1stSprint' password
    And I click 'Sign In' button
    Then I am on a new page and I close notification
    And I go to 'Enter Orders'
    And I select 'Student Flyer Orders'
    Then I put student Name 'Harry'
    And I put '6S5' for item number
    And I click on ADD button
    Then I change quantity for 6S5 book to '2'
    And I click 'Review Order' button
    And I click 'Proceed to Checkout' button
    And I click 'Proceed to checkout' button again
    Then I click 'Continue Checkout' button
      And I click 'Ship to My School' radio-button
      And I click on 'Select Payment Method' box
      And I choose 'Credit Card' option
    Then I click on 'Card Type' box
      And I choose 'Add a New Card' option
    Then I type card number '5499740000000057'
      And I choose '02' as an expiration month
      And I choose '2023' as an expiration year
      And I type security code '998'
    Then I enter 'Some' as first name
      And I enter 'Body' as a last name after
      And I enter '576 Broadway' as an address
      And I enter '10006' as a zip code
      And I enter '9176374653' as a phone number
    Then I click 'Continue CheckOut'
      And I click 'Submit Order'
    Then I verify conformation of order is displayed




