$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/gl_admin_login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    }
  ],
  "line": 19,
  "name": "GearLaunch admin login",
  "description": "As a user I should be able to login to GL admin portal",
  "id": "gearlaunch-admin-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2158257237,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify user login with valid credentials",
  "description": "",
  "id": "gearlaunch-admin-login;verify-user-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I visit the GL admin login page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I login with username as \"kamalesh@gearlaunch.com\" and password as \"mysystem123\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "the login is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "GlAdminLoginSteps.visit_gl_admin_login_page()"
});
formatter.result({
  "duration": 4372082976,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kamalesh@gearlaunch.com",
      "offset": 26
    },
    {
      "val": "mysystem123",
      "offset": 68
    }
  ],
  "location": "GlAdminLoginSteps.login(String,String)"
});
formatter.result({
  "duration": 9821660808,
  "status": "passed"
});
formatter.match({
  "location": "GlAdminLoginSteps.verifyLoginSuccessful()"
});
formatter.result({
  "duration": 5375502,
  "status": "passed"
});
formatter.after({
  "duration": 128508817,
  "status": "passed"
});
});