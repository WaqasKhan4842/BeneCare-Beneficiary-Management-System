package BusinessLogicServices;

import java.util.Date;


public class Beneficiary_Program {
    private int ID;
    private String program_name;
    private String age_group;
    private Date start;
    private Date end;
    private String location;
    private String objective;
    private String Funding_source;
    private String eligibility_criteria;
    private float budget;
    private String status;
    private String companyName;

    // Getter and Setter methods for ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // Getter and Setter methods for program_name
    public String getProgram_name() {
        return program_name;
    }

    public void setProgram_name(String program_name) {
        this.program_name = program_name;
    }

    // Getter and Setter methods for age_group
    public String getAge_group() {
        return age_group;
    }

    public void setAge_group(String age_group) {
        this.age_group = age_group;
    }

    // Getter and Setter methods for start
    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    // Getter and Setter methods for end
    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    // Getter and Setter methods for location
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Getter and Setter methods for objective
    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    // Getter and Setter methods for Funding_source
    public String getFunding_source() {
        return Funding_source;
    }

    public void setFunding_source(String funding_source) {
        Funding_source = funding_source;
    }

    // Getter and Setter methods for eligibility_criteria
    public String getEligibility_criteria() {
        return eligibility_criteria;
    }

    public void setEligibility_criteria(String eligibility_criteria) {
        this.eligibility_criteria = eligibility_criteria;
    }

    // Getter and Setter methods for budget
    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    // Getter and Setter methods for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getter and Setter methods for companyName
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

