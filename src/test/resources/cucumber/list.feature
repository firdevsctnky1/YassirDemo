Feature: Web Login

  Scenario: User should be able to filter for popular movies
    Given the user is on home page
    And  Click Sort Results By list button
    When click Popularity Ascending list button
    And  Click Search Button
    Then The user should filter for popular movies

