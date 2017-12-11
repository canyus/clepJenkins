Feature: Test Center Search Page Feature
@Regression3
Scenario: user verifies test center information
	Given the user is on the test-center-search page
	When the user verifies find a test center page
	And the user selects a state
	And the user enters a zipcode
	And the user selecets radius
	And the user clicks on the search button
	And the user clicks on get direction link under nova alexandria
	And the user verifies the destination adress on the new tab
	And the user navigates back to the parent window
	And the user clicks on Visit Website link under nova alexanria
	And the user verifies the url
	Then the user closes the browser
	
	