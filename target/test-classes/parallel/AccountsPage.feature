Feature: Accounts Page Feature

  Background:
    Given user has already logged in to application
      |username|password|
      |dummyemail9093@gmail.com|dummy@123|

@accounts
  Scenario: Accounts page title
    Given user is on Accounts page
    When user gets the title of the page
    Then page title should be "My account - My Store"
    Then user clicks on home page icon