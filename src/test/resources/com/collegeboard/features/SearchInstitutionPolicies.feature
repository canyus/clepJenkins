Feature: SearchInstitutionPolicy Feature

@Veli
Scenario: user searches for institution policy
Given the user on the SearchInstitutionPolicies page
When the user verifies the Search Institution Policies text 
And the user verifies that United States has seleceted on Select a Country dropdown list
And the user selects a state
And the user enters a keyword on Enter a College or University Name box
And the user checks the options displayed
And the user selects a university from options displayed
And the user clicks on search button
And the user prints the Score and Credit Information by Exam list provided
Then the user prints only the exams with the score of fifty


