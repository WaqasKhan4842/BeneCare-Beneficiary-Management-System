package Presentation;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BeneficiaryDashboardController {
	 @FXML
	    private Button logout;

	    @FXML
	    private Button see_programs;

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

	    @FXML
	    void see_programs(ActionEvent event) {
	    	 try {
	             // Load the BeneficiaryProgram.fxml file
	             Parent root = FXMLLoader.load(getClass().getResource("/Resources/Porgram_Info_For_Beneficiary.fxml"));
	             
	             // Create a new scene
	             Scene scene = new Scene(root);
	             
	             // Get the stage information
	             Stage stage = (Stage) see_programs.getScene().getWindow();
	             
	             // Set the new scene on the stage
	             stage.setScene(scene);
	             
	         } catch (IOException e) {
	             e.printStackTrace();
	         }

	    }

}
