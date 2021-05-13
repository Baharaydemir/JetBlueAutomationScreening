Feature: JetBlue Scenarios

      #Scenario 1:
      #1. Navigate to https://www.jetblue.com/
      #2. Enter “From” city (say: New York) and do not enter “To” city.
      #3. Click on Search flights
      #Expected: User should get an error message “Please enter a valid city”

      @TC1
      Scenario: Verify that the error message poping up
      Given The user wants to navigate Jetblue
      When The user wants to choose from city as "New York, NY (JFK)"
      Then The user wants to search flights
      And The user should get an error message as “Please enter a valid city”

      #Scenario 2:
      #1. Enter “From” and “To” city.
      #2. Enter “Depart” date.
      #3. Try to select a Return date prior to Depart date
      #Expected: Return Date prior to Depart date should be disabled

      @TC2
      Scenario:Verify that return date is disabled
      Given The user wants to navigate Jetblue
      When The user wants to choose from city as "New York, NY (JFK)" and To city as "San Jose, CA (SJC)"
      Then The user wants to enter Depart date as "05-17-2021"
      And The user should not enter the return date as "05-14-2021"

      #Scenario 3:
      #1. Enter “From”,” To”, “Depart”,” Return” values.
      #2. Click on Search flights button.
      #3. User should be landed to flights selection page (Validate this)
      #4. For Departing flights – Select the LOWEST fare that is displayed (Note that ticket prices would be
      #dynamic)
      #5. For Returning flights – Select the LOWEST fare that is displayed.
      #6. Note: if there are multiple “Lowest “fares, implement a logic to select the flight with earliest
      #Depart time.
      #7. Click “Continue” button.
      #8. User should be navigated to “travelers’ information “page (Validate this)
      #9. Quit the session.

      @TC3
      Scenario: Verify that The user can navigate to travelers' information page
            Given The user wants to navigate Jetblue
            When The user wants to choose from city as "New York, NY (JFK)" and To city as "San Jose, CA (SJC)"
            And The user wants to enter Depart date as "05-17-2021" and enter return date as "06-14-2021"
            And The user wants to search flights
            Then The user wants to verify flights selection page
            And The user wants to choose the LOWEST fare for Departing flights
            And The user wants to choose the LOWEST fare for Returning flights
            And The user wants to continue
            And The user wants to verify travelers’ information page
            And The user wants to quit session





