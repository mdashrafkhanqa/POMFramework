$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Automate LeafTaps Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC002_LoginLogout for Failure",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "launch chromebrowser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.launchChromeBrowserAndLoadUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as Ashraf",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterUserNameAsAshraf()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterPasswordAsCrmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTest.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it is navigated samepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.itIsNavigatedSamepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify error message",
  "keyword": "But "
});
formatter.match({
  "location": "LoginTest.verifyErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});