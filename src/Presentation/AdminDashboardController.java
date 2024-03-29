package Presentation;


import java.io.IOException;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class AdminDashboardController {
	  @FXML
	    private Button manage_application;

	    @FXML
	    private Button pending_programs;

	    @FXML
	    private AnchorPane the_anchor_pane;

	    @FXML
	    void Manage_Applications(ActionEvent event) {

	    }

	    @FXML
	    void Pending_Programs(ActionEvent event) {
	        if (the_anchor_pane != null) {
	            try {
	                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resources/Pogram_Information.fxml"));
	                AnchorPane newPane = loader.load();
	                the_anchor_pane.getChildren().setAll(newPane);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } else {
	            System.out.println("Error: AnchorPane is null");
	        }
	    }
	   
}
