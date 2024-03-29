package BusinessLogicServices;

import java.util.List;
import DataAcces.Beneficiary_Pogram;
public class Beneficiary_Program_Record {
	 private List<Beneficiary_Program> programs; // List of programs retrieved from the database
	    private int currentIndex; // Index of the currently displayed program
	    

	    public Beneficiary_Program_Record(int number) {
	        // Initialize and retrieve programs from the database
	    	 if(number == 1)
	    	 {
	        this.programs = DataAcces.Beneficiary_Pogram.retrievePrograms();
	        this.currentIndex = 0; // Start with the first program
	    	 }
	    	 else
	    	 {
	    		   this.programs = DataAcces.Beneficiary_Pogram.retrieveProgramsapproved();
	   	        this.currentIndex = 0; // Start with the first program
	    	 }
	    }
	    public Beneficiary_Program getCurrentProgram() {
	        return programs.get(currentIndex);
	    }

	    public void nextProgram() {
	        if (currentIndex < programs.size() - 1) {
	            currentIndex++;
	        }
	    }
	    public void previousProgram() {
	        if (currentIndex > 0) {
	            currentIndex--;
	        }
	    }
	    public void updateProgramStatus(String newStatus) {
	        // Call the Data Access layer to update the program status
	        int programId = getCurrentProgram().getID();
	       Beneficiary_Pogram.updateProgramStatus(programId, newStatus);
	    }

}
