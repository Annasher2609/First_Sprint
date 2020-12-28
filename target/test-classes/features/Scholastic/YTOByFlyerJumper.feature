Feature: Verify YTO-By Flyer jumper
  Scenario: User does not see any jumper after closing a previous one
    When I click on 'Sing In'
      And I enter 'firstsprint@gmail.com' email
      And I enter '1stSprint' password
      And I click 'Sign In' button
    Then I am on a new page and I close notification
      And I go to 'Enter Orders'
      And I select 'Your Teacher Order'
    Then I go to 'By Flyer' tab
      And I click on Price-QTY box
    Then I verify jumper is displayed
    Then I enter '5' in the clicked Price-QTY box
      And I click on X on the jumper
      And I click on another Price-QTY box
