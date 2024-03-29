package Presentation;

import Resources.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class BenefactorDashboardController {
	public BenefactorDashboardController()
	{
		
	}
	
	@FXML
    private Button add_porgram; 

    @FXML
    private Button logout;

    @FXML
    void Add_Porgram_Form(ActionEvent event) {
        try {
            // Load the BeneficiaryProgram.fxml file
            Parent root = FXMLLoader.load(getClass().getResource("/Resources/BeneficiaryProgram.fxml"));
            
            // Create a new scene
            Scene scene = new Scene(root);
            
            // Get the stage information
            Stage stage = (Stage) add_porgram.getScene().getWindow();
            
            // Set the new scene on the stage
            stage.setScene(scene);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Logout(ActionEvent event) {
        try {
            // Load the Login.fxml file
            Parent root = FXMLLoader.load(getClass().getResource("/Resources/Login.fxml"));
            
            // Create a new scene
            Scene scene = new Scene(root);
            
            // Get the stage information
            Stage stage = (Stage) logout.getScene().getWindow();
            
            // Set the new scene on the stage
            stage.setScene(scene);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
