Feature: User registration to reserve hotel room

As a site visitor
i want to go to registration page,add my personal information , and 
 
Scenario: Register a user successfully

Given as a user i am in registration page
When i enter first name,last name,user id,password,and confirm password
And i click on submit button 
Then i recieved a user registration confirmation
