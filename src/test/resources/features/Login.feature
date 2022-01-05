Feature: verifying adactin login
Scenario Outline: verifying login with Valid credentials
Given user is on adactin page 
When user should enter "<username>" "<password>"
And user should click login

Examples:
|username|password |
|asgarali|123456789|





