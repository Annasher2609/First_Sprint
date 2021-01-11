@login
Feature: Verify teacher gets error for invalid item number in SFO
  Scenario: User gets 'Please enter a valid item number' error msg
    When I click on 'Sing In'
      And I enter 'firstsprint@gmail.com' email
      And I enter '1stSprint' password
      And I click 'Sign In' button
    Then I am on a new page and I close notification
      And I go to 'Enter Orders'
      And I select 'Student Flyer Orders'
      And I enter student Name 'Harry'
      And I enter '111' for item number
    Then I click on ADD button
      And I verify 'Please enter a valid item number' error message is displayed
