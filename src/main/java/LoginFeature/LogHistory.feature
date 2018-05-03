Feature: Verifying the LogHistory feature	
Scenario: Verify that user can be able to export LogHistory sucessfully or not.
Given User should be on the Login page
When User click on the ExportLog button
Then User select the FileType
And click on the Export
Then verify that File Export successfully message shows or not. 	
