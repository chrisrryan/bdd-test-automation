# BDD with Cucumber & Gherkin, REST-Assured (APIs) and Selenium (Web UI) for Test Automation of ParaBank demo app

Uses minimalist BDD-style Gherkin files for test automation. As a good practice, the implementation details are not specified in the Gherkin file, but instead are pushed down to the code level. This allows automation engineers to be free to implement the scenarios as they see fit.

Given this scenario, the tests are automated against the UI, API, and even visual testing, even though the Gherkin steps do not explicitly state this.

```feature
Scenario: Withdraw from account when funds are available
    Given a customer has an account
    And the account balance is 100.00 dollars
    When the customer withdraws 10.00 dollars
    Then the account balance should be 90.00 dollars
    And a new transaction should be recorded
```

Uses: Java 11, Selenium WebDriver, REST-Assured, Cucumber and Gherkin.

Run tests from src/test/java/cucumber/CucumberTestOptions.java

[ParaBank demo app](https://parabank.parasoft.com/parabank/index.htm)

[ParaBank REST API (swagger)](https://parabank.parasoft.com/parabank/api-docs/index.html)


