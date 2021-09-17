Case study for Flink based on Cucumber Selenium Automation Framework

This is a sample Flink feature test case scenario to verify a regular user flow of selecting the low priced products in the available categories
according to the temperature.

The test scripts are written based on Selenium and Java Frontend Automation Suite utilising the BDD methodologies of Cucumber and Gherkins.

Steps required to Execute the scenario --

Clone master branch from GIT Repository or download the ZIP file. 
Clone the project from GIT to local machine with below dependencies -- JAVA Sdk, Apache Maven, Selenium Webdriver (chromedriver and geckodriver). 
Currently the script supports Chrome and Firefox browsers only.

Open Excel file and change the Test Data if required. 
Save the changes and execute the script through the below methods by executing the test cases either consecutively or parallelly --
Method 1:
Eclipse IDE: Execute as JUnit Test.

Method 2: Through this method one can execute the scenario parallely on Chrome and Firefox browsers at the same time.
Eclipse IDE -- Right Click on the project --> Run As --> Maven Build --> clean install --> Apply and Run.

Method 3: Through this method one can execute the scenario parallely on Chrome and Firefox browsers at the same time.
Command Line: Open cmd prompt in the system --> Navigate to the filepath where the project is stored --> mvn test

Method 4: Through this method one can execute the scenario parallely on Chrome and Firefox browsers at the same time.
Windows batch file: Navigate to the filepath where the project is stored --> Execute the "run.bat" file.
