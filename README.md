# martrust-forex-calculator
This is the official FX Rates Widget Application made by Allen Windel V. Bernabe as part of his application as a Software Engineer to Offshore. 

HOW TO SETUP martrust-web ANGULAR APPLICATION (Front-End):

1. Make sure that node is installed in your device, preferably the latest version.
2. Import this in VS Code.
3. Upon importation, install all the packages by inputting in the terminal: npm install.
4. To start the front-end application, input in the terminal: npm start

HOW TO SETUP martrust-api SPRING BOOT APPLICATION (Back-End):

1. Make sure your device is equipped with Java Version 1.8 onwards.
2. Import the project as an Existing Maven Project in Eclipse IDE (Photon onwards).
3. Make sure that the Eclipse IDE has Spring Tool Suite installed.
4. Install all the packages by right clicking the project -> Maven -> Update Project ... until all the packages have been installed.
5. Run the project as Spring Boot Application

After setting the front-end and the back-end, you may now proceed to testing.

APPLICATION ASSUMPTIONS AND LIMITATIONS:
1. Since I have been given an external api link in the instructions, the assumption is the back-end application will also call an external API using Rest Template.
2. I used the Free API of https://free.currencyconverterapi.com/ as this has more currencies as compare to what https://exchangeratesapi.io/ offers.
3. The application is limited to converting up to 7 currencies. This is due to the external APIs being limited to certain currencies available only for the free account. Other currencies are available only in paid accounts. 
4. I implemented Simple CORS Filter in order for the front-end, when run in local, can call the back-end API without any breach in the security.
5. The default server port is 8080. 
6. External API URL and Access Key are found in application.properties
