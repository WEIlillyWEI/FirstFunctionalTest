Feature: run the calculator
Scenario Outline: Run the calculator

Given I enter <firstNum> and <secondNum>
And I click the <operator> button
When I click button calculate
Then I see result as <result>

Examples:
| firstNum | secondNum | operator | result |
| 3 | 4 | "Add" | "7" |
| 3 | 4 | "Mul" | "12" |
| 3 | 4 | "Sqr" | "9" |
| 3 | 4 | "Comp" | "4" |
| 3 | 4 | "SqrSub" | "-7" |
| 3 | 4 | "Euclid(+)" | "49" |
| 3 | 4 | "Euclid(-)" | "1" |
