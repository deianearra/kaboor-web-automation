@login
Feature: Login

  @login
  Scenario: As a user, I should be able to log in using correct registered data
    Given user navigate to url "https://kaboor-dev.netlify.app/"
    When user click Login button
    * user input email
    * user click Masuk button
    * user input password
    * user click Masuk button
    Then user login successfully

