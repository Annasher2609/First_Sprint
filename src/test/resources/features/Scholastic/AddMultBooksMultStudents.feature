@login
Feature: Teacher can add multiple books for a student in SFO
  Scenario: Correct student name, item number and quantity gets added under SFO; correct Student-total (amount, items and quantity) and SFO Total displayed in cart
    When I click on 'Sing In'
      And I enter 'firstsprint@gmail.com' email
      And I enter '1stSprint' password
      And I click 'Sign In' button
    Then I am on a new page and I close notification
      And I go to 'Enter Orders'
      And I select 'Student Flyer Orders'
    Then I type student Name 'Harry'
      And I type '6S5' for item number
      And I click on ADD button
    Then I type student Name 'Harry'
      And I type '11X5' for item number
      And I click on ADD button
    Then I type student Name 'John'
      And I type '14G5' for item number
      And I click on ADD button
    Then I type student Name 'Michael'
      And I type '8K5' for item number
      And I click on ADD button
    Then I type student Name 'Michael'
      And I type '11K5' for item number
      And I click on ADD button
    Then I change quantity for book 6S5 to '2'
      And I change quantity for book 11X5 to '4'
      And I change quantity for book 14G5 to '1'
      And I change quantity for the forth book 8K5 to '10'
      And I change quantity for the fifth book 11K5 to '6'
    Then I verify correct student names, item numbers and quantities get added under SFO
      And I click 'Review Order' button
      And I scroll down '250' pixels
    Then I verify Student-total amounts, items and quantities and SFO-total is correct