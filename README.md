# INFO C211 Car Rental System Project
## Project Aim and Description
***
This project involves creating a car rental company system and Graphical User Interface (GUI) kiosk that is to be used by car rental clients.  The car rental company system is host-centered and keeps track of information on customers, car rental agreements, current car rentals, and customer accounts.  This car rental system allows customers to rent and return vehicles.  In this car rental system there are two different types of vehicles which include SUVs and sedans.

## Source Files and Purpose
***
* CustomerAccount.java : Helps define what a customer account should contain; Contains class attributes about customer accounts such as customer id, password, phone, and name
* Vehicle.java : Helps define and create abstract vehicles that needs to be further defined/sub-classed; Contains class attributes about vehicles such as the make, model, year, and vinNumber
* Sedan.java : Helps define and create sedans; Contains class attributes about sedans such as the number of doors and trunk size
* Suv.java : Helps define and create SUVs; Contains class attributes about SUVs such as the daily fee and number of seats
* Manager.java : Manages ArrayLists of vehicles and customers; Contains methods to be able to add and remove vehicles and customers, test if login information is correct and successful, and can find out whether accounts have the same customer id
* RentalAgreement.java : Helps define what a car rental agreement should contain; Contains class attributes about rental agreements such as agreement id, customer id, date, rental length, and rental fee, payment, and status
* RentalKiosk.java : Creates GUI; used for testing; adds functionality to login, register, rent a car, view current rental information, return a car, and log out

## Interface Functionality
***
* TextArea object taOutput is used to be able to display text output, provide status updates, and for the interface to give feedback to the user
* TextField objects called txtCustPass, txtCustID, txtCustNameReg, txtCustIDReg, txtCustPassReg, txtCustPhoneReg, txtDateRen, txtLengthRen, txtFeeRen, txtPaymentRen, and other TextField objects that makes visual text boxes for the user to type in information
* Button objects called btnLogin, btnRegister, btnRent, btnReturn, and btnLogout to perform tasks when the button is pressed.  These tasks include checking and displaying information
* ComboBox objects called cmbLog, cmbOption, and cmbVehicle that makes a selectable drop down list of the menu items when the area is clicked.
* Login pane and ComboBox cmbLog allows user to select whether they want to login or register for a customer account;  changes what is displayed based on choice to ask and receive user input of login information
* HBox optPane and ComboBox cmbOption allows user to select whether they want to rent a car, return a car, view current rental information, or logout

## Design and Implementation Assumptions
***
* Customer IDs are checked for uniqueness when registering
* Passwords, phones, and names are not checked for uniqueness when registering for a customer account
* There is a Graphical User Interface or GUI for the client to perform tasks such as registering and creating customer accounts, logging into customer accounts, renting a car, returning a car, displaying current car rentals and contracts, and logging out
* Code needs to handle common exceptions from faulty user inputs
* Assume that users know how to read English
* Assume that users know how to read a list, and be able to follow the procedures to use the car rental system
* Assume that user knows their customer ID and password when logging into their account
* Assume that user knows their personal information such as their name, customer ID, phone number, and password they want to use when registering for their account
* Assume that the user knows information about the sedans or SUVs they want to rent/return
* A customer can have as many car rental agreements and rent out as many vehicles as the customer needs
* Assume that there can only be one vehicle and one customer per rental agreement
* Assume the user of the system is a customer/client

## Procedures to Run Bank Management System
***
If using Jar file: Double click or open executable .jar file and skip to step 5 below
1. Download and extract the zip file
2. Open the .java files in a Java IDE or program of your choosing that can run the files
3. Put the java files in a java project in a default package that has proper access to the JRE system library and JavaFx library
4. Run the program or main test class called RentalKiosk
5. After the GUI pops up, follow the prompt
6. Click on the combo box with a small triangle and click on the option of whether you want to login or register for an account
7. Follow all other prompts, input login/registration information into the text fields and submit with the "Log In" or "Register" button
8. Click on the combo box with a small triangle and click on the options of the task you want to perform from the drop down list
9. New prompts will appear with each selection where you should follow the directions, input information into the text boxes after each prompt by clicking on the text boxes and typing
10. Click on the button after filling out all of the information into the text boxes to perform tasks
11. Make sure you type the corresponding answers next to the prompt or directions
12. If you typed in the wrong input or want to change what you typed, delete and replace text in the text boxes
13. If you want to change your option and continue performing other tasks, click the combo box that makes a drop down list that is located next to the “Select an option: ”.  Then pick the task you want to perform from the drop down list.
14. Continue answering prompts and following directions
15. To exit the program whenever you want or after finishing all transactions, creating accounts, and other tasks, click the “X” on the top right corner of the GUI window.

## Authors and Acknowledgement
***
* Jonah Reardon
* Krystina Rush
* Noah Smith
* Jacob Smith

