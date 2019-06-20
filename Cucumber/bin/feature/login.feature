Feature: Login feature

Scenario Outline: Login with valid credentials

Given User navigates to facebook website
#When user enter valid email and password
#When user enter valid 29 and "password"
When user enter valid "<email>" and "<password>"
And click on login button
Then user should be navigated to home page 



Examples:

|email|password|
|a|abc|
|b|abc|