Feature: to check room booking functionality in adactinhotel

Scenario: login with valid credentials in Adactin webpage
Given the user launch the browser
And the user opens the login page
Then the user enters username and password
|dinesh0017|9080132507|
When the user clicks login button and it navigates to search hotel page


Scenario: user searches the hotels
Given the user selects location, hotels, room type,number of rooms
And the user clears check in date and check out date
Then the user enters valid check in date and check out date
And the user selects adults per room and children per room
When the user clicks search button and it navigates to select hotel page

Scenario: user selects the hotels
Given the user clicks valid hotel
When the user clicks continue button and it navigates to book a hotel page

Scenario: user books a hotel
Given the user enters first name, last name, billing address, credit card number
And the user selects credit card type, expiry month , expiry year
Then the user enters cvv number
When the user clicks book now button and it navigates to booking confirmation page

