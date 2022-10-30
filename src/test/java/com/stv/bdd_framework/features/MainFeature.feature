Feature: Final_auto_test

  Scenario: Open new customer page
    Given Main page is loaded
    And Click on Your account link
    Then New customer form is visible

  Scenario Outline: Create new customer
    Given The user inputs e-mail "<email_address>" in textarea
    When Click on Continue button
    Then New Customer page is visible
    Examples:
      | email_address     |
      | test_mail@mail.ru |