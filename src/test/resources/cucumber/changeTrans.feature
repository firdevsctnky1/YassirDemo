Feature: Web Login

  @test1
  Scenario: User should change the language
    Given the user is on home page
    When click the language button
    When choose English language
    And click reload button
    Then you should see it is English


