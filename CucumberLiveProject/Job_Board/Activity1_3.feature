@Activity1_3
Feature: Posting a job using parameterization
Scenario: Post a job using details passed from feature file 

    Given Browser is open with Alchemy jobs and User is navigated to Post a job page  and signing in    
		When User enters"System Analyst"and"Bangalore"and"Test description"
    And Click submit
    Then Go to jobs page and confirm the job listing
    And Closing browser
    
    
  