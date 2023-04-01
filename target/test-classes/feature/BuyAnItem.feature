Feature: Buy an item

@Buy_001  @regression
Scenario Outline: Buy an item with valid credit card info
#Given The user launches the application
When The user seaches an item "<items>"
#Then the user adds item to cart
#Then The user closes the browser

Examples:
| items      |
| mobile     |
| wallet     |


@Buy_002   @regression
Scenario: Buy an item with invalid credit card info
Given The user launches the application

Then The user closes the browser


