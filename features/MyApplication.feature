Feature: Test Facebook smoke scenario 

		Scenario: Test login with valid credentials
		Given Open firefox and start application
		When I enter valid username and valid password
		Then user should be able to login successfully
		
		Scenario: Test login with Invalid credentials
		Given Open firefox and start application
		When I enter valid username and Invalid password
		Then user should not be able to login successfully