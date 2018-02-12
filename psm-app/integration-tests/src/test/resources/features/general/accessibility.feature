@accessibility
Feature: Accessibility Checks
  Users wish to access accessible pages

  Scenario: Login Page
    Given I have the application open in my browser
    Then I should have no accessibility issues

  Scenario: Register New Account Page
    Given I am on the Register New Account page
    Then I should have no accessibility issues

  Scenario: Forgot Password Page
    Given I am on the Forgot Password page
    Then I should have no accessibility issues

  Scenario: Dashboard Page
    Given I am logged in
    And I am on the dashboard page
    Then I should have no accessibility issues

  Scenario: Dashboard Draft Page
    Given I am on the Dashboard Draft page
    When I open the filter panel on the Dashboard Draft page
    Then I should have no accessibility issues

  Scenario: Dashboard Pending Page
    Given I am on the Dashboard Pending page
    When I open the filter panel on the Dashboard Pending page
    Then I should have no accessibility issues

  Scenario: Dashboard Approved Page
    Given I am on the Dashboard Approved page
    When I open the filter panel on the Dashboard Approved page
    Then I should have no accessibility issues

  Scenario: My Profile Page
    Given I am logged in
    When I click on My Profile
    Then I should have no accessibility issues

  Scenario: Update Password Page
    Given I am on the Update Password page
    Then I should have no accessibility issues

  Scenario: Account Setup Page
    Given I am on the Account Setup page
    Then I should have no accessibility issues
