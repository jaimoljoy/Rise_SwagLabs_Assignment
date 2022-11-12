# Rise_SwagLabs

This is a demo project 

Credential used for login:-

username - standard_user

password -secret_sauce

I have added a directory called "Data" in the project for storing the credentials in excel, so this will make the input parameters of the login dynamic and you can
change the credentials from the excel.

Done this project in Selenium and language used is Java

I have used maven tool and POM concept along with testng framework.

Page factory is used to make the web elements dynamic, because if there is any change in web element we have to change it in a single place.

Java version "19" 2022-09-20

#Steps for running the project

1.Open the project in Intellij.

2.Change the root of the excel path in "Data" directory, if required. (I have given relative path).

3.Change the chromedriver based on your chrome browser, it is in the "Driver" directory. My chrome version is "Version 107.0.5304.107 (Official Build) (64-bit)".

4.For getting the output as html report enable it in the "Edit configurations(click save report under the listeners tab)" from the run menu.

5.Run the project. 

6.After running the project check the file "emailable-report.html" under "test output" directory, you can open it in available browsers.
