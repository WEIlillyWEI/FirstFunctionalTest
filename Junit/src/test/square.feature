Feature: run the calculator
Scenario: Run the calculator

Given I input 4
And I click square button
When I click calculate
Then I get result 16