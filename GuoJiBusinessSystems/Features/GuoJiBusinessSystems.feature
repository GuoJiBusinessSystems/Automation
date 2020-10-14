Feature: GuoJiBusinessSystems Login

  Scenario: Logo presence on GuoJiBusinessSystems logo
    Given I launch chrome browser
    When I open GuoJiBusinessSystems home page
    Then I verify that the logo present on page
    And Close browser

