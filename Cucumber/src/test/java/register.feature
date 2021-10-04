Feature: Register Test


  Scenario Outline: Create An Account

    Given Navigate to Website
    And click Sign in button
    And type email "<email>"
    And click on Create an Account button
    And choose title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type Company "<Company>"
    And type address "<address>"
    Examples:
      | email                 | firstname | lastname | password | Company | address |
      | serdar15@gmail.com    | serdar    | katakana | 123      | lava    | bali    |
      | serdar13545@gmail.com | fame      | vivas    | 546      | naval   | kali    |
      | damlaozdemr@gmail.com | dara      | Faralli   | 123      | sandal  | eval    |
