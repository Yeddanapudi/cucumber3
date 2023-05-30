Feature: working on OrangeHrm page

  Scenario Outline: test data
    Given Opening Browser
    When user opening orangeHrm
    Then user specifies <userName> and <Pwd>
    And user  click on submit button

    Examples: 
      | userName | Pwd      |
      | Admin    | admin123 |
