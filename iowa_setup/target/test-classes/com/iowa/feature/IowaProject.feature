Feature: validate iowa end-to-end automation functionality

@Login
Scenario: Validate user successfull login
Given Enter the Url to navigate webpage
When User enter the email "Ide@mobiusservices.com"
And User enter the "Angular@123"
And user enter the valid captcha
And User click the Login button
Then validate user enter into the Home page of Iowa"<validation>"

@UserManagement_MD
Scenario: Testing master data module functionality
Given check user is on home page
When user serach and click on master data element
And user click on user management menu
And user click on add user button
And user select menu from dropdown
And user enter valid mailid
And user enter firstname
And user enter lastnames
And user enter mobile no in work column
And user select college from dropdown menu
And click add button
Then verify user created account successfully

@DataSubmissionDeadline_MD
Scenario: validate data submission deadline module
Given User is on HomePage
When user click on master data element
And user click on data submission menu which is displayed under masterdata 
And user click on plus add button
And user select college from addperiod option which is popuped while clicking on add button
And user entering the period 
And user select the start date from calender
And user select the end date from calender
And user choose the files to be submitted by clicking on checkboxes
And user click on add button 
And user validate data submission period updated successfully
And user click on plus add button again to change reporting period
And user switch to reporting year column
And user choose  start date from calender
And user chosse end date from calender
And user click on change button
And user click on update button
Then validate reporting period displayed in data submission deadline grid 

@RulesByFile_RM
Scenario: Validate Rule By File module functionality
Given User is on Home page
When user click on master data module
And user click rule under master data module
And user click on rule and choose rulesbyfile module 
And user verifying that Hash sign, File Name, Actions are present in RuleByFile page
And user verifying that rule numbers are displaying under HashSign field
And user verifying that file names are displaying under FileName field
And user verifying that View and download options are present under Actions field
And user click on view option
And user verifying that internal integrity displaying in popup box opened when clicked on view 
And user verifying that Data Element title, Data element Description, Error Description,Warning Description,Type of Error options are displaying under internal integrity field
And user click on Referential Integrity which is displayed in popup box while click on view button
And user verifying that RuleName,Error description,Warning Description,Type of error fields displayed under Referential Integrity
And user click on cancel button
Then click on download button and verify downloading corressponding file

@RuleByDataElement_RM
Scenario: Validate RulesByDataElement module
Given user is on home page
When user click on master data 
And user click on rule under master data
And user click on Rules By Data Element under Master data
Then user click on select report drop down


@RuleByDataElement1_RM
Scenario Outline:Validate Rules By Data Element module - Emloyee file data element creation
When user choose employee report from select report drop down
And user click on + button to add new data element in employee grid
And user entering data element title "<Data Element Title>"
And user entering warning threshold "<Warning ThreShold>"
And User choosing data type from drop down"<Data Type>"
And user entering max length of allowed of data element "<Max Length>"
And user entering data element description "<Data Element Description>"
Then User click on add button
Examples:
|Data Element Title  | Warning ThreShold  | Data Type | Max Length  |  Data Element Description                   |
|Commcollege1        |  0                 |Numeric    |    2        |  Number assigned to a Community Colleges    |
| SSN1               |  0                 |Numeric    |    9        | Employees SSN                               |
| LastName1          |  2                 |String     |    25       | Last Name                                   |
| FirstName1         |  0                 |String     |   15        | First Name                                  |
| MInit1             |  0                 |String     |   1         | Middle Name or Initial                      |
|BirthDate1          |  0                 |Date       |   8         | Birth Date                                  |
|Ethnicity1          |  50                |Numeric    |   1         | Hispanic/Not Hispanic                       |
|AmInd1              |  0                 |Numeric    |   1         | American Indian                             |
| Asian1             |  0                 |Numeric    |   1         | Asian                                       |
|Black1              |  0                 |Numeric    |   1         | Black/African American                      |
|PacIsland1          |  0                 |Numeric    |   1         | Pacific Islander                            |
|White1              |  0                 |Numeric    |   1         | White                                       | 
|RaceNotRept1        |  0                 |Numeric    |   1         | Race Not Reported                           |
|Gender1             |  0                 |Numeric    |   1         | Student Gender                              |
| Degree1            |  0                 |Numeric    |   1         | Employee Education                          |
| Experience1        |  0                 |Numeric    |   1         | Employee Experience                         |
| Certified1         |  0                 |Numeric    |   1         | Certification                               |
| FTEArtScience1     |  0                 |Decimal    |   5         | FTEArtScience                               |
|FTEVoc1             |  0                 |Decimal    |   5         | FTEVoc                                      |

@RuleByDataElement2_RM
Scenario Outline: validate Rules By DataElement module- Position File Data Element Creation
When user choose position file from select report drop down
And user click on + button to create data element for position file
And user entering "<Data Element Title>" in text field
And user entering "<Warnig Threshold>" value in text field
And user select "<Data Type>" from drop down
And user entering "<Maximum Length>" of Data element we given
And user entering "<Data Element Description>" 
Then user click on Add button in popup data elemnt creation popup window
Examples:
| Data Element Title | Warnig Threshold | Data Type  | Maximum Length  | Data Element Description                |
| Commcollege1       |      0           |Numeric     |      2          | Number assigned to a Community College  |
| SSN1               |      0           |Numeric     |      9          | Employee's SSN                          |
| PositionCode1      |      0           |Numeric     |      3          | Position Code                           |
| EmployType1        |      0           |Numeric     |      1          | Type of Employment                      |
| PositionTotEarn1   |      0           |Numeric     |      6          | Total Earnings                          |
| BaseSalary1        |      0           |Numeric     |      6          | Base Salary                             |
| DaysInContract1    |      0           |Numeric     |      3          | Days in Contract                        |
  









