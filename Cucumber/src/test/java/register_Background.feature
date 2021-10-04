Feature: Register Test

  Background:
    Given Navigate to Website
    And click Sign in button
    And type email "serdar123@gmail.com"
    And click on Create an Account button


      Scenario: Kişi 1


        And type firstname "serdar" and lastname "katkar"


        Scenario: Kişi 2
          And type Company "techno study"
          And type address "Balıkesir 3"

  Scenario Outline: Kişi 3


    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type Company "<Company>"
    And type address "<address>"
    Examples:
      | firstname | lastname | password | Company | address       |
      | Mustafa   | Ozdenir  | 1234     | Amazon  | limesStrasse  |
      | Fatih     | Katkar   | 4567     | Dell    | GoethePlatz 5 |
      | Serdar    | Katkar   | 132      | Asus    | venedik       |

