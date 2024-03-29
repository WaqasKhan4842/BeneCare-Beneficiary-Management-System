package Presentation;

import BusinessLogicServices.Beneficiary_Program;
import BusinessLogicServices.Beneficiary_Program_Record;
import BusinessLogicServices.Application_Record;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Beneficiary_See_Program_Controller {
	private Beneficiary_Program_Record pgr;
	private Application_Record ar;
	public Beneficiary_See_Program_Controller()
	{
		this.ar = new Application_Record();
		this.pgr = new Beneficiary_Program_Record(2);
	}
	 @FXML
	   private void initialize() {
	        // Initialize UI with details of the current program
	        updateUI();
	   }
	
	@FXML
    private Button apply;

    @FXML
    private Label company_name;

    @FXML
    private Label criteria;

    @FXML
    private Label end_date;

    @FXML
    private Label group;

    @FXML
    private Button next;

    @FXML
    private Button previous;

    @FXML
    private Label prog_name;

    @FXML
    private Label start_date;

    @FXML
    void Submit_Application(ActionEvent event) {
    	ar.Submit_Applications( pgr.getCurrentProgram().getID());
    	

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
 // Method to set values for labels
    public void setLabelValues(String criteriaText, String companyNameText, String fundText, String fundingSourceText) {
        criteria.setText(criteriaText);
        company_name.setText(companyNameText);
        end_date.setText(fundText);
       start_date.setText(fundingSourceText);
    }
    private void updateUI() {
        Beneficiary_Program currentProgram = pgr.getCurrentProgram();
        criteria.setText(currentProgram.getEligibility_criteria());
        company_name.setText(currentProgram.getCompanyName());
        prog_name.setText(currentProgram.getProgram_name());
        end_date.setText(currentProgram.getFunding_source());
        float fundValue = currentProgram.getBudget();
       // Using String.valueOf()
      start_date.setText(String.valueOf(fundValue));

    }


}
