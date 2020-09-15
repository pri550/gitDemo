Feature: Application login

Scenario: Home page default Login

Given user is on net banking landing page
When user login to application with "pri" and "12345"
Then cards displayed are "true"


