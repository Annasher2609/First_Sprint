Feature: User can create a new teacher account in taxable state using School Search
  Scenario: Verify a class code is present on Home-Page and MyAccount-Page, same teacher name is present on My Accounts, same school address is present as selected while creating the account
    When I click on 'Create an Account' button
      And I choose 'Teacher/Administrator/Homeschooler' option
      And I click 'Next' button
      And I enter 'Mr.' as a title
      And I enter 'School' as a first name
      And I enter 'Search' as a last name
      And I enter 'sprint100@yahoo.com' as an email
      And I enter 'w0ntToTest' as a password
      And I click 'Terms of use' box
      And I click 'Next' button to submit teacher's data
    Then I click 'SEARCH BY STATE AND CITY STATE'
      And I choose 'New York' state
    Then I choose 'New York' in 'CITY'
      And I click 'Search' for school
    And I pick 'SCHOLASTIC+BOOK+CLUBS' in a school name dropdown
    And I click 'Next' button to submit school
    Then I click 'Select Role'
    And I pick 'Teacher 'by Grade' option
    Then I click 'Grade'
    And I pick '1st Grade' as a grade
    And I enter '10' as a number of students
    And I click 'Next' to submit
    And I click 'Preferred Reading Level System'
    And I pick 'Guided Reading Level 'GRL''
    And I click 'Continue to site' button
    Then I am on a new page and I close notification
    Then I see a class code on an opened Home Page
    And I click on 'My Account'
    And I select 'Profile'
    Then I verify the class codes on My Account page are the same
    And I verify the name displayed on My Account page and the one that was entered are the same

