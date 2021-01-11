@login
Feature: User can create a new teacher account in non-taxable state using Zip Code
  Scenario: Verify a class code is present on Home-Page and MyAccount-Page, same teacher name is present on My Accounts, same school address is present as selected while creating the account
    When I click on 'Create an Account' button
      And I choose 'Teacher/Administrator/Homeschooler' option
      And I click 'Next' button
      And I enter 'Mr.' as a title
      And I enter 'Other' as a first name
      And I enter 'One' as a last name
      And I enter '1sprint@yahoo.com' as an email
      And I enter 'w0ntToTest' as a password
      And I click 'Terms of use' box
      And I click 'Next' button to submit teacher's data
      And I enter '99518' as a zipcode
      And I click 'Search' button
      And I pick 'ADAK SCHOOL' in a school name dropdown
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
