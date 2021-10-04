Feature: Search Page Feature

  Background:
    Given user has already logged in to application
      |username|password|
      |dummyemail9093@gmail.com|dummy@123|
    Then user clicks on home page icon
    When user enters the Item "Printed Dress"
    Then user clicks on search icon

  Scenario: Go to Searched Item Page
    Given user is on search page
    When Item is displayed
    Then click on the Item


