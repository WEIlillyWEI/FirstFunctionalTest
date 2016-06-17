Feature: operator test
Scenario Outline: Adding two numbers

Given I input two numbers <expression>
Then I get result <result>

Examples:
| expression | result |
|"2,3,+"     | "5"    |
|"1,2,3,+,-" | "-4"   |
|"6,2,*,3,/" | "4"    |
|"2,3,^,4,5,+,+" | "17"   |
|"50,%,2,*" | "1"    |
|"3,!,4,5,*,+"|"26"|
|"12,3,/,!"|"24"|
|"5,1,2,+,4,*,+,3,-"|"14"|