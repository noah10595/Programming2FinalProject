/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalkiosk;

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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Jacob Smith
 */
public class RentalKiosk extends Application {
    
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene by calling the getPane() method and place it in the stage
        Scene scene = new Scene(getPane(), 300, 300);
        primaryStage.setTitle("Rental Kiosk"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    
    protected BorderPane getPane() {
        //Create all of the labels, buttons, text fields, and text areas needed
        //to build the GUI
        Label lblCustID = new Label("User ID: ");
        Label lblCustPass = new Label("Password: ");
        Label lblCustIDReg = new Label("User ID: ");
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
        
        TextField txtCustID = new TextField();
        TextField txtCustPass = new TextField();
        TextField txtCustNameReg = new TextField();
        TextField txtCustIDReg = new TextField();
        TextField txtCustPassReg = new TextField();
        TextField txtCustPhoneReg = new TextField();
        TextField txtDateRen = new TextField();
        TextField txtLengthRen = new TextField();
        TextField txtFeeRen = new TextField();
        TextField txtPaymentRen = new TextField();
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
        
        Button btnLogin = new Button("Log In");
        Button btnRegister = new Button("Register");
        Button btnRent = new Button("Confirm Rental");
        Button btnReturn = new Button("Return Car");
        
        ComboBox cmbLog = new ComboBox();
        cmbLog.getItems().addAll("Log In","Register"); 
        ComboBox cmbOption = new ComboBox();
        cmbOption.getItems().addAll("Rent a Car","Return a Car","Current Rental"); 
        ComboBox cmbVehicle = new ComboBox();
        cmbVehicle.getItems().addAll(); // Add Vehicles
        
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
        GridPane blankPane = new GridPane();
        blankPane.setPrefWidth(400);
        blankPane.setPadding(new Insets(15,15,15,15));
        blankPane.setAlignment(Pos.TOP_LEFT);
        
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
        rentalPane.add(lblVehicleRen,0,1);
        rentalPane.add(cmbVehicle,1,1);
        rentalPane.add(lblDateRen,0,2);
        rentalPane.add(txtDateRen,1,2);
        rentalPane.add(lblLengthRen,0,3);
        rentalPane.add(txtLengthRen,1,3);
        rentalPane.add(lblPaymentRen,0,4);
        rentalPane.add(txtPaymentRen,1,4);
        rentalPane.add(lblFeeRen,0,5);
        rentalPane.add(txtFeeRen,1,5);
        rentalPane.add(btnRent,1,6);
        
        //Pane to hold the return content
        GridPane returnPane = new GridPane();
        returnPane.setPrefWidth(300);
        returnPane.setPadding(new Insets(15,15,15,15));
        returnPane.setAlignment(Pos.TOP_LEFT);
        returnPane.add(lblVehicleRet,0,1);
        returnPane.add(txtVehicleRet,1,1);
        returnPane.add(lblDateRet,0,2);
        returnPane.add(txtDateRet,1,2);
        returnPane.add(lblLengthRet,0,3);
        returnPane.add(txtLengthRet,1,3);
        returnPane.add(lblFeeRet,0,4);
        returnPane.add(txtFeeRet,1,4);
        returnPane.add(btnReturn,1,5);
        
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
            } else if(cmbOption.getValue() == "Return a Car"){
                //Display return
                mainPane.setCenter(returnPane);
            } else if(cmbOption.getValue() == "Current Rental"){
                //Display current contract
                mainPane.setCenter(contractPane);
            } 
        });
        
        btnRegister.setOnAction(e -> {
            mainPane.setTop(optPane);
            mainPane.setCenter(blankPane);
        });
        
        btnLogin.setOnAction(e -> {
            mainPane.setTop(optPane);
            mainPane.setCenter(blankPane);
        });
        
        btnRent.setOnAction(e -> {
            
        });
        
        btnReturn.setOnAction(e -> {
           
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
