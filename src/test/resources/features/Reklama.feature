Feature: Shopping:
  Scenario: Adding ad to memo as a favourite;
    When I am on the home page
    And I go to Transport category and select the first subcategory from the list
    And I select Alfa Romeo category
    And I open #1 ad from the list
    Then I verify that favorite ads count is 0
    And I click Add to favorites Button
    Then I verify that favorite ads count is 1

  Scenario: Adding ad to memo as a favourite in alternative way;
    When I am on the home page
    And I go to Transport category and select the first subcategory from the list
    And I select Alfa Romeo category
    And I select #1 ad from the list and add to Memo
    And I select #2 ad from the list and add to Memo
    And I select #3 ad from the list and add to Memo
    Then I verify that favorite ads count is 3

  Scenario: Adding ad to memo as a favourite via Advanced search;
    When I am on the home page
    And I click Advanced search button
    And I enter "Alfa" to the Advanced search input field
    And I click Search button for advanced search
    And I open #1 ad from the list
    Then I verify that favorite ads count is 0
    And I click Add to favorites Button
    Then I verify that favorite ads count is 1

  Scenario: Adding ad to memo as a favourite in alternative way via Advanced search;
    When I am on the home page
    And I click Advanced search button
    And I enter "Alfa" to the Advanced search input field
    And I click Search button for advanced search
    And I select #1 ad from the list and add to Memo
    And I select #2 ad from the list and add to Memo
    And I select #3 ad from the list and add to Memo
    Then I verify that favorite ads count is 3