package Presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import BusinessLogicServices.Beneficiary_Program_Record;
import BusinessLogicServices.Beneficiary_Program;

public class Program_Information_Controller {
	
	
	 private Beneficiary_Program_Record pgr;
	 public Program_Information_Controller() {
	        this.pgr =  new Beneficiary_Program_Record(1);
	    }
	  @FXML
	   private void initialize() {
	        // Initialize UI with details of the current program
	        updateUI();
	   }

    @FXML
    private Button approve;

    @FXML
    private Label ciriteria;

    @FXML
    private Label company_name;

    @FXML
    private Label fund;

    @FXML
    private Label funding_source;

    @FXML
    private Button next;

    @FXML
    private Button previous;
    

    @FXML
    private Label prog_name;
    
    // Method to set values for labels
    public void setLabelValues(String criteriaText, String companyNameText, String fundText, String fundingSourceText) {
        ciriteria.setText(criteriaText);
        company_name.setText(companyNameText);
        fund.setText(fundText);
        funding_source.setText(fundingSourceText);
    }

    @FXML
    void approveApplication(ActionEvent event) {
    	 pgr.updateProgramStatus("Approved");

    }

    @FXML
    void next_button(ActionEvent event) {
    	pgr.nextProgram();
        updateUI();

    }

    @FXML
    void previous_button(ActionEvent event) {
    	pgr.previousProgram();
         updateUI();

    }
    private void updateUI() {
        Beneficiary_Program currentProgram = pgr.getCurrentProgram();
        ciriteria.setText(currentProgram.getEligibility_criteria());
        company_name.setText(currentProgram.getCompanyName());
        prog_name.setText(currentProgram.getProgram_name());
        funding_source.setText(currentProgram.getFunding_source());
        float fundValue = currentProgram.getBudget();
       // Using String.valueOf()
       fund.setText(String.valueOf(fundValue));

    }

}
