package BusinessLogicServices;

import java.sql.Date;

import DataAcces.Beneficiary_Pogram;

public class Benefactor_Menu {
	  
	
	 private DataAcces.Beneficiary_Pogram dataAccessObject;

	    public Benefactor_Menu() {
	        this.dataAccessObject = new DataAcces.Beneficiary_Pogram(); // Initialize your data access object
	    }

	    public void addBeneficiaryProgram(String name, String bGroup, Date startDate, Date endDate,
	            String location, String objectives, String fundingSource, String eligibility,
	            float budget, String pStatus) {

	    	 UserSession userSession = UserSession.getInstance();
	 	     String userEmail = userSession.getUserEmail();
	 	     System.out.print(userEmail);
	        // Call the data access object to insert the beneficiary program into the database
	        dataAccessObject.insertBeneficiaryProgram(name, bGroup, startDate, endDate, location, 
	                objectives, fundingSource, eligibility, budget, pStatus, userEmail);
	    }
	   
	
	


}
