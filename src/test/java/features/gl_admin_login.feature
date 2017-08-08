#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)

Feature: GearLaunch admin / seller login
  As a user I should be able to login to GL admin and seller portals

	#GL-1
  @SmokeTest
  Scenario: Verify user login with valid credentials - GL admin portal
    Given I visit the GL admin login page
    When I login with username as "kamalesh@gearlaunch.com" and password as "mysystem123"
    Then the login is successful

	@SmokeTest
  Scenario: Verify user login with valid credentials - GL seller portal
    Given I visit the GL admin login page
    When I login with username as "kamalesh@gearlaunch.com" and password as "mysystem123"
    Then the login is successful