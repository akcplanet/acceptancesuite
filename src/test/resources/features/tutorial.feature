Feature: Automation Demo for API & UI Smoke Testing

@test @stage 
Scenario: Common API Data Verifcation 
	Given Pre Delete the record 
	When Process the Transaction 
	Then Perform Validation 
	And Post Delete the record