Feature: Machinery

  Scenario: Home page is displayed once set credential in machinery page
    Given 'Machinery' page is loaded
    And enter the machinery registration page
    And set machinery registration data


  Scenario: Remove item
    Given 'MachineryRemove' catalog page is loaded
    And enter the machinery Category page
    And enter the bobcats page
    And enter the select option
    And Select the option 'Remove' from the item