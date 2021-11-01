Feature: Application Login

Scenario Outline: Home page default login
Given Initialize the browser with chrome
And Naviagate to "http://qaclickacademy.com" site
And Click on login to home page to land on secure sign in page
When user enteres <username> and <password> and logs in
Then Verify that user is succesfully signed in

Examples:

|username|   |password|
|test@1.com| |secure12345|
|test@2.co|  |Secure1234|