package Presentation;

import java.sql.Date;
import java.time.LocalDate;

import BusinessLogicServices.Benefactor_Menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


public class Beneficiary_Program_Controller {
	
	   @FXML
	    private TextField age;

	    @FXML
	    private TextField budget;

	    @FXML
	    private TextField duration;

	    @FXML
	    private TextField eligibility;

	   
	    @FXML
	    private TextField fundin_source;

	    @FXML
	    private TextField locationField;

	    @FXML
	    private TextField name;

	    @FXML
	    private TextField objectives;
	    @FXML
	    private DatePicker start_date;

	    @FXML
	    private DatePicker end_date;

	    @FXML
	    void Submit_Application(ActionEvent event) {
	    	 // Get values from the UI elements
	        String programName = name.getText();
			String beneficiaryGroup = age.getText();
	        LocalDate startDateValue = start_date.getValue();
	        Date startDate = Date.valueOf(startDateValue);
	        LocalDate endDateValue = end_date.getValue();
	        Date endDate = Date.valueOf(endDateValue);
	        String programLocation = locationField.getText();
	        String programObjectives = objectives.getText();
	        String fundingSource = fundin_source.getText();
	        String eligibilityCriteria = eligibility.getText();
	        float programBudget = Float.parseFloat(budget.getText());
	        String programStatus = "Pending";
	        
	        // Call the service to add the beneficiary program
	        Benefactor_Menu bmenu = new Benefactor_Menu();
	        bmenu.addBeneficiaryProgram(programName, beneficiaryGroup, startDate, endDate,
	                programLocation, programObjectives, fundingSource, eligibilityCriteria,
	                programBudget, programStatus);

	    }

}
