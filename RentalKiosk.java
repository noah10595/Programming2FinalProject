/*
 * @author Noah Smith, Jacob Smith
 */

package finalproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jacob Smith
 */
public class RentalKiosk extends Application {
	CustomerAccount loggedInCustomer;
	Manager manage = new Manager();

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene by calling the getPane() method and place it in the stage
        Scene scene = new Scene(getPane(), 400, 400);
        primaryStage.setTitle("Rental Kiosk"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        
        // Creates an initial inventory of Sedan objects that the car rental company has
        Sedan s1 = new Sedan("Toyota", "Camry", "2021", "5TFAW5F12HX597834", 4, 15);
        Sedan s2 = new Sedan("Honda", "Accord", "2003", "6FTWA7X32XH863278", 4, 13);
        Sedan s3 = new Sedan("Dodge", "Charger", "2004", "9BTHY7B78WE326893", 4, 14);
        Sedan s4 = new Sedan("Honda", "Accord", "2016", "8NKJU7R53NY759252", 4, 17);
        
        // Creates an initial inventory of Suv objects that the car rental company has
        Suv suv1 = new Suv("Ford", "Explorer", "2021", "5TFAW5F12HX597834", 6, 15);
        Suv suv2 = new Suv("Honda", "Pilot", "2017", "8NTUI8C56NR742468", 7, 14);
        Suv suv3 = new Suv("Kia", "Sorento", "2016", "7IPVE9V42NE782564", 6, 16);
        Suv suv4 = new Suv("Subaru", "Ascent", "2015", "4BRRW8K21LQ679801", 8, 17);
        
        // Adds the initial inventory of sedan objects to the inventory ArrayList
        manage.addVehicle(s1);
        manage.addVehicle(s2);
        manage.addVehicle(s3);
        manage.addVehicle(s4);
        
        // Adds the initial inventory of Suv objects to the inventory ArrayList
        manage.addVehicle(suv1);
        manage.addVehicle(suv2);
        manage.addVehicle(suv3);
        manage.addVehicle(suv4);
    }
    
    protected BorderPane getPane() {
        //Create all of the labels, buttons, text fields, and text areas needed
        //to build the GUI
        Label lblCustID = new Label("User ID: ");
        Label lblCustPass = new Label("Password: ");
        Label lblCustIDReg = new Label("User ID: ");
        Label lblCustIDRen = new Label("Confirm User ID: ");
        Label lblCustPassReg = new Label("Password: ");
        Label lblCustNameReg = new Label("Name: ");
        Label lblCustPhoneReg = new Label("Phone Number: ");
        Label lblDateRen = new Label("Date: ");
        Label lblVehicleRen = new Label("Vehicle: ");
        Label lblLengthRen = new Label("Days: ");
        Label lblFeeRen = new Label("Fee: ");
        Label lblPaymentRen = new Label("Payment: ");
        Label lblPrompt = new Label("Please input the following: ");
        Label lblDateRet = new Label("Date: ");
        Label lblVehicleRet = new Label("Vehicle: ");
        Label lblLengthRet = new Label("Days: ");
        Label lblFeeRet = new Label("Fee: ");
        Label lblDateCon = new Label("Date: ");
        Label lblVehicleCon = new Label("Vehicle: ");
        Label lblLengthCon = new Label("Days: ");
        Label lblFeeCon = new Label("Fee: ");
        Label lblPaymentCon = new Label("Payment: ");
        Label lblSelect = new Label("Select an option: ");
        Label lblSelect2 = new Label("Select an option: ");
        Label lblCustIDRet = new Label("Confirm user ID: ");
        
        TextField txtCustID = new TextField();
        TextField txtCustPass = new TextField();
        TextField txtCustNameReg = new TextField();
        TextField txtCustIDReg = new TextField();
        TextField txtCustIDRen = new TextField();
        TextField txtCustPassReg = new TextField();
        TextField txtCustPhoneReg = new TextField();
        TextField txtDateRen = new TextField();
        TextField txtLengthRen = new TextField();
        TextField txtFeeRen = new TextField();
        TextField txtPaymentRen = new TextField();
        TextField txtCustIDRet = new TextField();
        TextField txtVehicleRet = new TextField();
        txtVehicleRet.setEditable(false);
        TextField txtDateRet = new TextField();
        txtDateRet.setEditable(false);
        TextField txtLengthRet = new TextField();
        txtLengthRet.setEditable(false);
        TextField txtFeeRet = new TextField();
        txtFeeRet.setEditable(false);
        TextField txtVehicleCon = new TextField();
        txtVehicleCon.setEditable(false);
        TextField txtDateCon = new TextField();
        txtDateCon.setEditable(false);
        TextField txtLengthCon = new TextField();
        txtLengthCon.setEditable(false);
        TextField txtFeeCon = new TextField();
        txtFeeCon.setEditable(false);
        TextField txtPaymentCon = new TextField();
        txtPaymentCon.setEditable(false);
        
        TextArea taOutput = new TextArea();
        taOutput.setEditable(false);
        
        Button btnLogin = new Button("Log In");
        Button btnRegister = new Button("Register");
        Button btnRent = new Button("Confirm Rental");
        Button btnReturn = new Button("Return Car");
        Button btnLogout = new Button("Logout");
        
        ComboBox cmbLog = new ComboBox();
        cmbLog.getItems().addAll("Log In","Register"); 
        ComboBox cmbOption = new ComboBox();
        cmbOption.getItems().addAll("Rent a Car","Return a Car","Current Rental", "Logout"); 
        ComboBox cmbVehicle = new ComboBox();
        cmbVehicle.getItems().addAll(manage.getInventory()); // Add Vehicles
        
        //Pane to hold the text area for output
        StackPane taOutputPane = new StackPane();
        taOutputPane.setPrefWidth(400);
        taOutputPane.setPrefHeight(150);
        taOutputPane.setPadding(new Insets(15,15,15,15));
        taOutputPane.getChildren().add(taOutput);
        taOutputPane.setAlignment(Pos.BOTTOM_CENTER);
        
        //Pane to hold the log in pane content
        HBox logPane = new HBox(2);
        logPane.setPadding(new Insets(15,15,15,15));
        logPane.getChildren().addAll(lblSelect,cmbLog);
        logPane.setAlignment(Pos.CENTER);
        
        //Pane to hold the option pane content
        HBox optPane = new HBox(2);
        optPane.setPadding(new Insets(15,15,15,15));
        optPane.getChildren().addAll(lblSelect2,cmbOption);
        optPane.setAlignment(Pos.CENTER);
        
       
        
        //Pane to hold the log in content
        GridPane loginPane = new GridPane();
        loginPane.setPrefWidth(300);
        loginPane.setPadding(new Insets(15,15,15,15));
        loginPane.setAlignment(Pos.TOP_LEFT);
        loginPane.add(lblCustID,0,1);
        loginPane.add(txtCustID,1,1);
        loginPane.add(lblCustPass,0,2);
        loginPane.add(txtCustPass,1,2);
        loginPane.add(btnLogin,1,3);
        
        //Pane to hold register content
        GridPane registerPane = new GridPane();
        registerPane.setPrefWidth(300);
        registerPane.setPadding(new Insets(15,15,15,15));
        registerPane.setAlignment(Pos.TOP_LEFT);
        registerPane.add(lblPrompt,0,0);
        registerPane.add(lblCustIDReg,0,1);
        registerPane.add(txtCustIDReg,1,1);
        registerPane.add(lblCustPassReg,0,2);
        registerPane.add(txtCustPassReg,1,2);
        registerPane.add(lblCustNameReg, 0,3);
        registerPane.add(txtCustNameReg, 1,3);
        registerPane.add(lblCustPhoneReg, 0,4);
        registerPane.add(txtCustPhoneReg, 1,4);
        registerPane.add(btnRegister,1,5);
        
        //Pane to hold the rental content
        GridPane rentalPane = new GridPane();
        rentalPane.setPrefWidth(300);
        rentalPane.setPadding(new Insets(15,15,15,15));
        rentalPane.setAlignment(Pos.TOP_LEFT);
        rentalPane.add(lblVehicleRen,0,0);
        rentalPane.add(cmbVehicle,1,0);
        rentalPane.add(lblDateRen, 0, 2);
        rentalPane.add(txtDateRen, 1, 2);
        rentalPane.add(lblLengthRen,0,3);
        rentalPane.add(txtLengthRen,1,3);
        rentalPane.add(lblPaymentRen,0,4);
        rentalPane.add(txtPaymentRen,1,4);
        rentalPane.add(lblFeeRen,0,5);
        rentalPane.add(txtFeeRen,1,5);
        rentalPane.add(lblCustIDRen, 0, 6);
        rentalPane.add(txtCustIDRen, 1, 6);
        rentalPane.add(btnRent,1,7);
        
        //Pane to hold the return content
        GridPane returnPane = new GridPane();
        returnPane.setPrefWidth(300);
        returnPane.setPadding(new Insets(15,15,15,15));
        returnPane.setAlignment(Pos.TOP_LEFT);
        returnPane.add(btnReturn,0,0);
        
      //Pane to hold the log in content
        GridPane blankPane = new GridPane();
        blankPane.setPrefWidth(400);
        blankPane.setPadding(new Insets(15,15,15,15));
        blankPane.setAlignment(Pos.TOP_LEFT);
        
        //Pane to hold the contract content
        GridPane contractPane = new GridPane();
        contractPane.setPrefWidth(300);
        contractPane.setPadding(new Insets(15,15,15,15));
        contractPane.setAlignment(Pos.TOP_LEFT);
        contractPane.add(lblVehicleCon,0,1);
        contractPane.add(txtVehicleCon,1,1);
        contractPane.add(lblDateCon,0,2);
        contractPane.add(txtDateCon,1,2);
        contractPane.add(lblLengthCon,0,3);
        contractPane.add(txtLengthCon,1,3);
        contractPane.add(lblPaymentCon,0,4);
        contractPane.add(txtPaymentCon,1,4);
        contractPane.add(lblFeeCon,0,5);
        contractPane.add(txtFeeCon,1,5);
        
        //Create a border pane and set the top with the combo box
        BorderPane mainPane = new BorderPane();
	mainPane.setTop(logPane);
	mainPane.setBottom(taOutputPane);

        //Handling to change the contents between register and log in
        cmbLog.setOnAction(e -> {
            if(cmbLog.getValue() == "Log In"){
                //Display log in pane
                mainPane.setCenter(loginPane);
            } else if(cmbLog.getValue() == "Register"){
                //Display register pane
                mainPane.setCenter(registerPane);
            } 
        });
        
        //Handling to change the contents of the layout whenever a new option is 
        //selected from the combo box
        cmbOption.setOnAction(e -> {
            if(cmbOption.getValue() == "Rent a Car"){
                //Display rental
                mainPane.setCenter(rentalPane);
                mainPane.setBottom(taOutputPane);
            } else if(cmbOption.getValue() == "Return a Car"){
                //Display return
                mainPane.setCenter(returnPane);
            } else if(cmbOption.getValue() == "Current Rental"){
                //Display current contract
                mainPane.setCenter(contractPane);
            } else if(cmbOption.getValue() == "Logout") {
            	mainPane.setTop(logPane);
            	mainPane.setCenter(blankPane);
            	loggedInCustomer = null;// deletes info about logged in customer so their information can't be taken
            }
        });
        
        btnRegister.setOnAction(e -> {
            mainPane.setTop(optPane);
            mainPane.setCenter(blankPane);
            mainPane.setBottom(taOutputPane);
            
            	String custId = txtCustIDReg.getText();
            	String password = txtCustPassReg.getText();
            	String name = txtCustNameReg.getText();
            	String phone = txtCustPhoneReg.getText();
            	
            	//Unique customerID
            	if(manage.findSameCustomerID(custId)){
            		String text ="ID is already in use. Please try a different ID";
            		taOutput.setText(text);
            		mainPane.setCenter(registerPane);
            		mainPane.setTop(logPane);
            	} else {
            		CustomerAccount newCust = new CustomerAccount(custId, password, name, phone);
                	manage.addCustomer(newCust);
                	txtCustIDReg.clear();
               		
                	//clears text field
                	txtCustPassReg.clear();
               		txtCustNameReg.clear();
               		txtCustPhoneReg.clear();
               		
               		String text = "Account created successfully!";
               		taOutput.setText(text);
            	}
            
        });
        
        btnLogin.setOnAction(e -> {
            mainPane.setTop(optPane);
            mainPane.setCenter(blankPane);
            mainPane.setBottom(taOutputPane);
            
            String custID = txtCustID.getText();
            String password = txtCustPass.getText();
            
            //Determines if login was succesful
            if(manage.loginSuccess(custID, password)) {
            	String text ="Login Successful";
            	taOutput.setText(text);
            }else {
            	String text = "ID or Password is incorrect. Please try again";
            	taOutput.setText(text);
            	mainPane.setCenter(loginPane);
            	mainPane.setTop(logPane);
            }
            loggedInCustomer = manage.savedCustomer(custID, password);//saves logged in customers information
            
        });
        
        btnRent.setOnAction(e -> {
        	Vehicle c = (Vehicle)cmbVehicle.getValue();//downcast value of what is in combo box
            String d = txtDateRen.getText();
            
            //try-catch to make sure date is in correct format
            try {
            	 Date date = new SimpleDateFormat("mm/dd/yyyy").parse(d);
                 String days = txtLengthRen.getText();
                 int daysRented = Integer.parseInt(days);
                 String payment = txtPaymentRen.getText();
                 String fees = txtFeeRen.getText();
                 double feesRent = Double.parseDouble(fees);
                 
                 //Assign random number for agreementID
                 int min = 1000;
                 int max = 99999;
                 double AgreementID = Math.random()*(max-min+1) + min;
                 
                 RentalAgreement agreement = new RentalAgreement(AgreementID, loggedInCustomer.getCustomerId(), c.getVinNumber(), date, daysRented, feesRent, payment, true);
                 
                 loggedInCustomer.addAgreement(agreement);//adds agreement to customer information
                 
                 //removes vehicle from inventory and adds it to vehicle inventory currently being rented
                 manage.removeVehicle(c);
                 manage.addOutofInventory(c);
                 String text = ("Thank you! We'll see you soon!");
                 taOutput.setText(text);
			} catch (ParseException e1) {
				String text = "Please format date as follows 'mm/dd/yyyy'";
				taOutput.setText(text);
			} 
            
        });
        
        btnReturn.setOnAction(e -> {
            //if agreement status is active(true) search for rented vehicle vin, find the vehicle in current rental
            //inventory then remove from rented inventory back to regular inventory
        	if(loggedInCustomer.checkAgreementStatus()){
            	String vin = loggedInCustomer.getRentalVin();
            	Vehicle c = manage.findVehicle(vin);
            	manage.removeOutOfInventory(c);
            	manage.addVehicle(c); 
            	String text = "Your return has been processed";
            	taOutput.setText(text);
         	}else {
         		String text = "You do not have an active agreement with this vehicle";
         		taOutput.setText(text);
         	}
            
        });
        
        return mainPane;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
