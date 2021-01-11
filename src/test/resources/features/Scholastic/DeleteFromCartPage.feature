@login
Feature: User can delete item on Cart page
  Scenario: Order amount of order, quantity, total amount and total quantity change if item is deleted
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
    Then I enter student Name 'Harry'
      And I put '11X5' for item number
      And I click on ADD button
    Then I enter student Name 'John'
      And I put '14G5' for item number
      And I click on ADD button
    Then I enter student Name 'Michael'
      And I put '42J4' for item number
      And I click on ADD button
    Then I enter student Name 'Michael'
      And I put '34B4' for item number
      And I click on ADD button
    Then I change quantity for 6S5 book to '2'
      And I change quantity for 11X5 book to '4'
      And I change quantity for 14G5 book to '1'
      And I change quantity for 42J4 book to '2'
      And I change quantity for 34B4 book to '1'
      And I click 'Review Order' button
    Then I capture amounts of quantities and prices
    Then I click 'cross sign' for 11X5
      And I click 'YES' to delete 11X5
    Then I verify that quantity and price amounts changed