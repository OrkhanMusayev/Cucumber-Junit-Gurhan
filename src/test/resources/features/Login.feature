Feature: Login
  User Story: As a user, I should be able to login with correct credentials to different accounts.And dashboard should be displayed.
  Accounts are: librarian, student, admin


   Scenario: Verify a librarian should be able to login
    Given librarian is on the login page
    When librarian is enter valid username and password
    Then librarian login with correct credentials
    Then librarian should see title is dashboard

    Scenario: As student I should be able to login with correct credentials
    Given student is on the login page
    When Student is enter valid username and password
    Then student login with correct credentials
    Then student should see title is dashboard


    Scenario: As admin I should be able to login with correct credentials
    Given admin is on the login page
    When Admin is enter valid username and password
    Then admin login with correct credentials
    Then admin should see title is dashboard