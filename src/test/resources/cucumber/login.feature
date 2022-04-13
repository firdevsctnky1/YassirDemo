Feature: Web Login

  Scenario: User should be able to login with valid credentials
    Given the user is on login page
    And  Click Login button
    When The user enters valid credentials
    And  Click Login Button
    Then The user should be logged in successfully

