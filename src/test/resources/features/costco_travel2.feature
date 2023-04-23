@travel2
Feature: costco travel page validation
  Background: home page of costco.com

  Scenario Outline: travel search button validation
    Given costco travel page click
    When choose my destination <destination_name> and region <region_name>
    Then choose the departure <departure_date> and return <return_date>
    Then choose the departure airport <departure_airport> and class <class_name>
    Then choose rooms <room_n>, <adults> ,<children>
    Then enter search
    Examples:
    |destination_name|region_name|departure_date|return_date|departure_airport|class_name|room_n|adults|children|
    |  "Canada" |"Montreal (YUL)" |"04122023" |   "05122023" | "PHL" | "Business" | "2"    |   "2"   |   "0" |
    |"New York" |"New York City, NY (NYC)"|"04122023"|"05122023"|   "JFK"           |"Business"  |"2" |"2" |"0" |