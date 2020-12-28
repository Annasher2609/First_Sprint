@login
Feature: User can add only three credit cards
  Scenario: User is trying to add 4th credit card, gets error msg
    When I click on 'Sing In'
      And I enter 'firstsprint@gmail.com' email
      And I enter '1stSprint' password
      And I click 'Sign In' button
    Then I am on a new page and I close notification
      And I click on 'My Account'
      And I click 'Payments Methods'
    Then I click 'Add Card'
     And I enter card number '5555555555554444'
    Then I click 'Month'
      And I choose '02'
    Then I click 'Year'
      And I choose '2022'
    Then I enter security code '786'
    Then I enter first name 'Some'
      And I enter last name 'Body'
    Then I enter address '576 Broadway apt4R'
      And I enter zip code '10005'
      And I enter '864-738-5764' phone number
    Then I click 'Save' button
      And I click 'Add Card' link
    Then I can see 'You can only store three credit cards' message




