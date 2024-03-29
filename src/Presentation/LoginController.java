package Presentation;

import javafx.fxml.Initializable;
import BusinessLogicServices.*;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class LoginController implements Initializable{
	public void LoginConrtoller()
	{
		
	}
	@FXML 
	private TextField username;
	@FXML 
	private PasswordField password;
	@FXML
	private Button login;
	
	@FXML 
	private ComboBox<String> usertype;
	
	@FXML
	private ImageView image;
	
	
	public void AuthenticateUser(ActionEvent event) throws IOException {
        String enteredUsername = username.getText();
        String enteredPassword = password.getText();
        String selectedUserType = usertype.getSelectionModel().getSelectedItem(); // Get selected user type

        if (AuthenticateUser.authenticateUser(enteredUsername, enteredPassword, selectedUserType)) {
            
        	UserSession userSession = UserSession.getInstance();
        	userSession.setUserEmail(enteredUsername);


        	 Alert alert = new Alert(AlertType.INFORMATION);
             alert.setTitle("Success");
             alert.setHeaderText(null);
             alert.setContentText("Login Successful");
             alert.showAndWait();
             
             DashboardService.loadDashboard(selectedUserType);
             
             
            
        } else {
            // Authentication failed
        	Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Login Failed");
            alert.showAndWait();
          
        }
    }
	
	public void SelectChoice(ActionEvent event)
	{
		String s = usertype.getSelectionModel().getSelectedItem().toString();
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<String> list = FXCollections.observableArrayList("Admin","Beneficiary","Benefactor","CaseWorker");
		usertype.setItems(list);
		
	}
	
	

	

	

}
