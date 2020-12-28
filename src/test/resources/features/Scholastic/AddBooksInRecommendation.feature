@login
Feature: User can add only three credit cards
  Scenario: User is trying to add 4th credit card, gets error msg
    When I click on 'Sing In'
      And I enter 'firstsprint@gmail.com' email
      And I enter '1stSprint' password
      And I click 'Sign In' button
    Then I am on a new page and I close notification
      And I enter in search 'Harry'
    And I close 'Place an Order' notification
      And I click 'Search' button on Account Page
    Then I click on 'Harry Potter and the Deathly Hallows' Quick Look
      And I click 'Recommend'
      And I click 'Recommendations For Students' box
    Then I close 'Add to My Lists' window
    Then I click 'My Lists' link
      And I click 'Recommendations For Students' option
      And I get title of the book from 'My Lists' page
    Then I verify the right book was added
