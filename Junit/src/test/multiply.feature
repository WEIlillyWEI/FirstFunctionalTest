Feature: run the calculator
Scenario: Run the calculator


Given I input 4 and 5
And I click multiply button
When I click calculate
Then I get result 20