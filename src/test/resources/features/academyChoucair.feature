@stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course

  @scenario1
  Scenario: Search for a automation course
    Given than Diana wants to learn automation at the Academy Choucair
    | strUser    | strPassword   |
    | 1090501152 | Choucair2021*|
    When she search for the course on the Choucair Academy platform
    | strCourse       |
    | ISTQB Agile Tester Extension|
    Then she finds the course called
    | strCourse       |
    | ISTQB Agile Tester Extension|
