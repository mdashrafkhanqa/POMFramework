
Feature: Automate LeafTaps Application
 
@smoke
Scenario: TC001LoginLogout

Given launch chromebrowser and load url
And enter username as DemoSalesManager 
And enter password as crmsfa       
When click the login button     
Then it is navigated homepage   
And click the logout button 
And close browser  

@wip
Scenario: TC002_LoginLogout for Failure

Given launch chromebrowser and load url
And enter username as Ashraf
And enter password as crmsfa 
When click the login button
Then it is navigated samepage
But verify error message
And close browser


