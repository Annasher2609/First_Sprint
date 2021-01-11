Feature: Teacher can add multiple books for a student in SFO
  Scenario: Correct student name, item number and quantity gets added under SFO; correct Student-total (amount, items and quantity) and SFO Total displayed in cart
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
    Then I enter student Name 'Harry'
      And I put '14G5' for item number
      And I click on ADD button
    Then I change quantity for the first book 6S5 to '2'
      And I change quantity for the second book 11X5 to '4'
      And I change quantity for the third book 14G5 to '1'
    Then I verify correct student name, item number and quantity gets added under SFO
      And I click 'Review Order' button
    Then I verify Student-total amount, items and quantity and SFO-total is correct

