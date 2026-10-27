Feature: Login Page Automation of automationexercise Application

  Scenario Outline: Check login is successful with valid credantials
    Given User is on the login page of automationexcercise application
    When User enters valid "<username>" and "<password>"
    And User clicks on the login button
    Then User should be navigated to the home page of automationexercise application
    And close the browser

    Examples:
      | username          | password   |
      | suchit@test.com   | Suchit@123 |
      | onetest@gmail.com | test@123   |
