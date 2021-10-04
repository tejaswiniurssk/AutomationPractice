Feature: Home Page Feature

  Background:
    Given user has already logged in to application
      |username|password|
      |dummyemail9093@gmail.com|dummy@123|
    Then user clicks on home page icon

  Scenario: Home Page Title
    Given user is on Home Page
    Then user gets the title of the page
    Then page title should be "My Store"

    #Scenario: Search an Item
      #Given search bar is displayed
      #When user enters the Item "Printed Dress"
      #Then user clicks on search icon

  Scenario Outline: Search an Item
    Given search bar is displayed
    When user enters the Item "<SheetName>" <Rownum>
    Then user clicks on search icon

    Examples:
    |SheetName| Rownum |
    | Items   | 0      |


