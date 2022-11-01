Feature: Final_auto_test

  Scenario: 01. Open new customer page
    Given Main page is loaded
    When Click on Your account link
    Then New customer form is visible

  Scenario Outline: 02. Create new customer
    Given The user inputs e-mail "<email_address>"
    When Click on Continue button
    Then New Customer page is visible
    Examples:
      | email_address       |
      | test_test@gmail.com |