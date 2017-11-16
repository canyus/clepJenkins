Feature: Register For Clep Exam Feature 

@Regression
Scenario: user registers for several Clep Exams
	Given the user on the registration page
	When the user verifies Register for CLEP Exams text is displayed
	And the user selecets three courses under Businees 
	And the user selects three courses under Composition & Literature
	And the user selects three courses under Foreign Languages
	And the user selects three courses under History & Social Science
	And the user selects three courses under Science & Mathematics
	And the user clicks on Add to Card button
	And the user clicks on Add Materials and Checkout button
	And the user clicks on Register and Checkout
	
